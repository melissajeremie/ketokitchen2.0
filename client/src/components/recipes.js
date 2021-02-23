import React, { useState, useEffect } from 'react';
import Axios from 'axios';
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
            
        </div>
    )
}