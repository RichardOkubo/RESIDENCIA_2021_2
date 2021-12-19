import React, { useState } from "react";
import { Text, TouchableOpacity, View } from "react-native";
import { styles } from "./style";

export default function Ex1() {
  const [hidden, setHidden] = useState(false);

  return (
    <View style={styles.container}>
      <TouchableOpacity
        style={styles.button}
        onPress={() => setHidden(!hidden)}
      >
        <Text style={styles.text}>Click me</Text>
      </TouchableOpacity>
      {hidden ? <Text /> : <Text>Hello, world</Text>}
    </View>
  );
}
