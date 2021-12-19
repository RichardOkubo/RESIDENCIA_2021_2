import React, { useContext } from "react";
import { View, Text, StyleSheet, StatusBar } from 'react-native';
import { TouchableOpacity } from "react-native-gesture-handler";

import AuthContext from "../../contexts/authContext";
import { styles } from "./style";

export default function Home() {

  const { signOut, user } = useContext(AuthContext);

  return (
    <View style={styles.container}>
      <Text style={styles.text}>{user.email}</Text>
      <TouchableOpacity onPress={signOut} style={styles.button}>
        <Text style={styles.buttonText}>LOGOUT</Text>
      </TouchableOpacity>
    </View>
  );
}
