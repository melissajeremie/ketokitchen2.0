import React, { useState } from 'react';
// import Ingredients from './Ingredients';

const Recipe = ({ recipe }) => {
    const [show, setShow] = useState(false);
    const { title, netCarbs, image, sourceLink } = recipe.recipe;

    return (
        <div>
            <h4>{title}</h4>
            <p>{netCarbs}</p>
            <img src={image} alt={title} />
            <a href={sourceLink} target="_blank" rel="noopener noreferrer">Source</a>
            
        </div>
    )
}
export default Recipe;