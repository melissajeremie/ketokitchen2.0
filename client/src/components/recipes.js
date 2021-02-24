import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Recipes() {
    const [recipes, setRecipes] = useState(null);

    async function getRecipes() {
        try {
            const res = await axios.get('http://localhost:8080/recipes')
            setRecipes(res.data);
        } catch(e) {
            console.error(e.message);
        }
    }
    useEffect(() => {
        getRecipes();
    }, [])

    return (
        <div>
            <h2>These are some of our favorites</h2>
            {recipes}

            <h3>Create your own recipe below:</h3>
            <form className="recipeForm" onChange={ (e) => handleChange(e) } onSubmit={ (e) => handleSubmit(e) }>
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
                </label>
            </form>
        </div>
    )
}

export default recipes;