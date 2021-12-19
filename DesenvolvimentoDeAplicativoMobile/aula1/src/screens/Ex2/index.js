import React, { useState } from "react";
import {
  StyleSheet,
  Text,
  TextInput,
  TouchableOpacity,
  View,
} from "react-native";
import { styles } from "./style";

export default function Ex2() {
  const [text, setText] = useState();

  return (
    <View style={styles.container}>
      <TextInput
        style={styles.input}
        onChangeText={t => setText(t)}
        placeholder="Text"
        value={text}
      />
      <Text>{text}</Text>
    </View>
  );
}
