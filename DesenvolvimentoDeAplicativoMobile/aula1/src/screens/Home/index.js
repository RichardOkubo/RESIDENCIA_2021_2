import React from "react";
import { View, Text, TouchableOpacity } from "react-native";
import { styles } from "./style";

export default function Home({ navigation }) {
  const options = [
    {
      id: 1,
      tag: <Text style={styles.text}>Exercício 1</Text>,
      name: "Ex1",
    },
    {
      id: 2,
      tag: <Text style={styles.text}>Exercício 2</Text>,
      name: "Ex2",
    },
    {
      id: 3,
      tag: <Text style={styles.text}>Exercício 3</Text>,
      name: "Ex3",
    },
  ];

  return (
    <View style={styles.container}>
      {options.map(({ id, tag, name }) => {
        return (
          <TouchableOpacity
            style={styles.button}
            key={id}
            onPress={() => navigation.navigate(name)}
          >
            {tag}
          </TouchableOpacity>
        );
      })}
    </View>
  );
}
