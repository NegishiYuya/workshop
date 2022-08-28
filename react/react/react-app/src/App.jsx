import React from 'react';

export const App = () => {
    const wordsList = ['文言1', '文言2', '文言3'];
    // onclickに対応する関数
    const onClickButton = () => {
        alert('クリック！！');
    };

    // onchangeに対応する関数(イベントはeで受け取る)
    const onChangeText = (e) => {
        console.log(e.target.value);
    };

    return (
        <>
            {wordsList.map((word) => {
                return <h1 key={word}>{word}</h1>;
            })}
            <button onClick={onClickButton}>ボタン</button>
            <input onChange={onChangeText}></input>
        </>
    );
};
