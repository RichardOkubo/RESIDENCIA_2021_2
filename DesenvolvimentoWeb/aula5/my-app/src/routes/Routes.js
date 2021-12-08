import Login from "../pages/Login";
import Home from "../pages/Home";
import Products from "../pages/Products";
import List from "../pages/List";
import {BrowserRouter, Switch, Route} from "react-router-dom";

function Routes() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact component={Login} />
        <Route path="/home" exact component={Home} />
        <Route path="/home/products/:id?" component={Products} />
        <Route path="/list" component={List} />
      </Switch>
    </BrowserRouter>
  )
}

export default Routes;