import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { v4 as uuidv4 } from "uuid";

import Recipe from './Recipe';


function Recipes() {
    const [recipes, setRecipes] = useState([]);

    async function getRecipes() {
        try {
            const res = await axios.get('http://localhost:8080/recipes')
            setRecipes(res.data);
            console.log(res);
        } catch(e) {
            console.error(e.message);
        }
    }
    useEffect(() => {
        getRecipes();
    }, [])

    return (
        <div className="recipes">
            <h2>Recipes</h2>
            {recipes !== [] && recipes.map(recipe => <Recipe key={uuidv4()} recipe={recipe} />)}
            <h3>Create your own recipe below:</h3>
            <form className="recipeForm" >
                <label>
                    Title
                    <input type="text" name="title" />
                </label>
                <label>
                    Net carbs
                    <input type="text" name="netCarbs" />
                </label>
                <label>
                    Image
                    <input type="text" name="image" />
                    <input type="submit" value="submit" />
                </label>
            </form>
        </div>
    )
}

export default Recipes;