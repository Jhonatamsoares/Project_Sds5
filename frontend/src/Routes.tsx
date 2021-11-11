import Dashboard from "Pages/Dashboard";
import Home from "Pages/Home";
import { BrowserRouter, Route, Switch } from "react-router-dom";

function Routes() {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/dashboard">
                    <Dashboard />
                    <Home />
            </Route>
        </Switch>
       </BrowserRouter >

    );
}

export default Routes;