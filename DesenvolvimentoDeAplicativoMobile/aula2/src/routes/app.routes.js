import React from "react";
import { createStackNavigator } from "@react-navigation/stack";

import Home from "../screens/Home";
import Ex1 from "../screens/Ex1";
import Ex2 from "../screens/Ex2";
import Ex3 from "../screens/Ex3";

const AppStack = createStackNavigator();

export default function AppRoutes() {
  return (
    <AppStack.Navigator>
      <AppStack.Screen name="Home" component={Home} />
      <AppStack.Screen name="Ex1" component={Ex1} />
      <AppStack.Screen name="Ex2" component={Ex2} />
      <AppStack.Screen name="Ex3" component={Ex3} />
    </AppStack.Navigator>
  );
}
