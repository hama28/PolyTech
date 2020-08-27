document.write("<h1>変数を自分自身に代入する「複合代入演算子」</h1>");

let num1 = 500;
num1 = num1 + 5;

document.write("<p>自分自身の変数に代入している「num1 = num1 + 5」を表示する</p>");
document.write(num1);

let num2 = 500;
num2 += 5;

document.write("<p>「複合代入演算子」を利用して「num2 += 5」を表示する</p>");
document.write(num2);
