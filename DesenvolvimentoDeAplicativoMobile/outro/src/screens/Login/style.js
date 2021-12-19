import { StyleSheet } from "react-native";
//import EStyleSheet from 'react-native-extended-stylesheet';

export const styles = StyleSheet.create({
//export const styles = EStyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },

  textLogin: {
    fontSize: 28,
    fontWeight: "bold",
    marginBottom: 30,
    color: "black",
  },

  input: {
    width: "70%",
    borderWidth: 1,
    borderColor: "gray",
    borderRadius: 30,
    marginVertical: 10,
    paddingStart: 15,
    paddingEnd: 15,
    paddingVertical: 10,
  },

  button: {
    width: "70%",
    height: 50,
    borderRadius: 30,
    backgroundColor: "#7159c1",
    justifyContent: "center",
    alignItems: "center",
    marginTop: 30,
  },

  buttonText: {
    color: "white",
    fontWeight: "bold",
  },
});
