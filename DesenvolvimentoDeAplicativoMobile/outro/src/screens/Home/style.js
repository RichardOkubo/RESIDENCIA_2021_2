import { StyleSheet, StatusBar } from "react-native";

export const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    //paddingTop: StatusBar.currentHeight,
  },
  
  text: {
    fontWeight: "bold",
    marginBottom: 50,
    fontSize: 20,
  },

  button: {
    justifyContent: "center",
    alignItems: "center",
    minWidth: "70%",
    height: 50,
    borderRadius: 30,
    backgroundColor: "#7159c1",
  },

  buttonText: {
    color: "white",
    fontWeight: "bold",
  },
});
