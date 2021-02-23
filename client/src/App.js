import React from 'react';
import Axios from 'axios';
import './App.css';
import {
  BrowserRouter as Router, 
  Switch, 
  Route, 
  Link
} from "react-router-dom";

class App extends React.Component {
  render() {
  return (
    <div className="App">
     <Router>
       <div>
         <ul className="nav">
           <li>
             <Link to="/">Home</Link>
           </li>
           <li>
             <Link to="/users">Users</Link> 
             </li>
             <li>
               <Link to="/recipes">Recipes</Link>
             </li>
             <li>
               <Link to="/addrecipe">Create</Link>
             </li>
         </ul>

         <Switch>
           <Route path="/addrecipe">
             <CreateRecipe />
           </Route>

           <Route path="/recipes">
            <Recipes />
           </Route>

           <Route path="/users">
             <Users />
           </Route>
           
           <Route path="/">
             <Home />
           </Route>
         </Switch>
       </div>
     </Router>


    </div>
  );
  }
}

export default App;

{/* <header className="App-header">
<h1>Keto Kitchen</h1>
</header> */}