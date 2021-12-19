import React, { useState } from "react";
import { View, Text } from "react-native";
import Child from "./Child";
import { styles } from "./style";

export default function Ex3() {
  const [text, setText] = useState("Props de Ex3");

  return (
    <View style={styles.container}>
      <Child text={ text } />
    </View>
  );
}
