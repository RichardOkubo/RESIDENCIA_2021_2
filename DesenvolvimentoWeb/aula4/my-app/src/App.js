import Login from "./pages/Login";
import Home from "./pages/Home";
import Products from "./pages/Products";
import {BrowserRouter, Switch, Route} from "react-router-dom";

function App() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact component={Login} />
        <Route path="/home" exact component={Home} />
        <Route path="/home/products" component={Products} />
      </Switch>
    </BrowserRouter>
  )
}

export default App;