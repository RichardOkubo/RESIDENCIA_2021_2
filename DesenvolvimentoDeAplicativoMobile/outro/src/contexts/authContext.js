import React, { createContext, useState, useEffect, useContext } from "react";
import AsyncStorage from "@react-native-async-storage/async-storage";
import Toast from "react-native-root-toast";

import api from "../services/api";

const AuthContext = createContext({});

export const AuthProvider = ({ children }) => {
  const [signed, setSigned] = useState(false);
  const [user, setUser] = useState({});
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    async function loadStorageData() {
      const storageToken = await AsyncStorage.getItem("@token");
      const storageUser = await AsyncStorage.getItem("@user");

      if (storageToken && storageUser) {
        //api.defaults.headers.Authorization = `Bearer ${storageToken}`

        setSigned(true);
        setUser(JSON.parse(storageUser));
        setLoading(false)
      }

    }

    loadStorageData();
  }, []);

  async function signIn(email, senha) {
    try {
      const { data } = await api.get("/token");

      if (email === data[0].user.email && senha === data[0].user.senha) {
        setSigned(true);
        setUser(data[0].user);

        //api.defaults.headers.Authorization = `Bearer ${data[0].token}`

        AsyncStorage.setItem("@user", JSON.stringify(data[0].user));
        AsyncStorage.setItem("@token", data[0].token);
      } else {
        Toast.show("Dados inválidos");
      }
    } catch (error) {
      console.log(error);
    }
  }

  function signOut() {
    AsyncStorage.clear().then(() => {
      setSigned(false);
      setUser({});
    });
  }

  return (
    <AuthContext.Provider
      value={{
        signed,
        signIn,
        signOut,
        user,
        loading,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
};

export default AuthContext;
