document.write('<h1>変数を自分自身に代入する「複合代入演算子」</h1>');

//自分自身に代入する
let num1 = 500;     //変数宣言と代入
num1 = num1 + 5;    //加算して代入する
document.write('<p>◇自分自身の変数に代入している「num1 = num1 + 5」を表示する</p>');
document.write(num1);   //変数「num1」を表示する

//自分自身に代入する
let num2 = 500;     //変数宣言と代入
num2 += 5;          //「複合演算子」で加算して代入する
document.write('<p>◇「複合演算子」を利用して「num2 += 5」を表示する</p>');
document.write(num2);   //変数「num2」を表示する