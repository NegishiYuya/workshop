import React from 'react';

export const App = () => {
    const wordsList = ['文言1', '文言2', '文言3'];
    return (
        <>
            {wordsList.map((word) => {
                return <h1>{word}</h1>;
            })}
        </>
    );
};
