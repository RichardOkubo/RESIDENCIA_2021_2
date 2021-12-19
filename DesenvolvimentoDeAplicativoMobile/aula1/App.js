import React, { useState } from "react";
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import Home from "./src/screens/Home";
import Ex1 from "./src/screens/Ex1";
import Ex2 from "./src/screens/Ex2";
import Ex3 from "./src/screens/Ex3";

const Stack = createNativeStackNavigator();

export default function App() {
  return (
   <NavigationContainer>
     <Stack.Navigator>
      <Stack.Screen name="Home" component={Home} />
      <Stack.Screen name="Ex1" component={Ex1} />
      <Stack.Screen name="Ex2" component={Ex2} />
      <Stack.Screen name="Ex3" component={Ex3} />
     </Stack.Navigator>
   </NavigationContainer>
  )
}
