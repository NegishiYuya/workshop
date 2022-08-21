import ReactDOM from 'react-dom/client';
import { App } from './App';

// Reactの要素をrenderする先を定義する
const rootElement = document.getElementById('root');
// Reactの要素を作成する
const root = ReactDOM.createRoot(rootElement);
// 任意の要素を描画する
root.render(<App></App>);