import Dashboard from 'Pages/Dashboard';
import { BrowserRouter, Route, Switch } from "react-router-dom";

function Routes() {
    return (
       <BrowserRouter>
             <Switch>
                <Route path="/dashboard">
                    <Dashboard />
                </Route>
             </Switch>
       </BrowserRouter>

    );
}

export default Routes;