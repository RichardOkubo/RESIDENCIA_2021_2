import React from "react";
import { View, Text, TouchableOpacity } from "react-native";
import { useNavigation } from '@react-navigation/native';

import { styles } from "./style";

export default function Home() {

  const navigation = useNavigation();
  
  const options = [
    {
      key: 1,
      tag: <Text style={styles.text}>Exercício 1</Text>,
      name: "Ex1",
    },
    {
      key: 2,
      tag: <Text style={styles.text}>Exercício 2</Text>,
      name: "Ex2",
    },
    {
      key: 3,
      tag: <Text style={styles.text}>Exercício 3</Text>,
      name: "Ex3",
    },
  ];

  return (
    <View style={styles.container}>
      {options.map(({ key, tag, name }) => {
        return (
          <TouchableOpacity
            style={styles.button}
            key={key}
            onPress={() => navigation.navigate(name)}
          >
            {tag}
          </TouchableOpacity>
        );
      })}
    </View>
  );
}
