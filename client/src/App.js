import React from 'react';
import './App.css';
import {
  BrowserRouter as Router, 
  Switch, 
  Route, 
  Link
} from "react-router-dom";
import Recipes from './components/recipes';
import Users from './components/users';

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
         </ul>

         <Switch>

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

class Home extends React.Component {
  render() {
    return(
      <div className="home-div">
        <h1>Keto Kitchen</h1>
        <h3>Find keto recipes or share your favorite!</h3>
      </div>
    )
  }
}

export default App;