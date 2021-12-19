import React, { useState, useContext } from "react";
import { View, TouchableOpacity, Text, TextInput } from "react-native";
import AuthContext from "../../contexts/authContext";

import { styles } from "./style";

export default function Login() {
  const { signIn } = useContext(AuthContext);
  
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");

  function handleLogin() {
    signIn(email, senha);
  }

  return (
    <View style={styles.container}>
      <Text style={styles.textLogin}>Login</Text>
      <TextInput
        placeholder="Email"
        style={styles.input}
        onChange={(e) => setEmail(e.nativeEvent.text)}
        value={email}
      />
      <TextInput
        secureTextEntry={true}
        placeholder="Senha"
        style={styles.input}
        onChange={(e) => setSenha(e.nativeEvent.text)}
        value={senha}
      />
      <TouchableOpacity style={styles.button} onPress={handleLogin}>
        <Text style={styles.buttonText}>SIGN IN</Text>
      </TouchableOpacity>
    </View>
  );
}
