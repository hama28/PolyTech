document.write("<h1>前置型のインクリメントと後置型のインクリメント</h1>");

let num1 = 500;
let ans1 = ++num1;

document.write("<p>「let ans1 = ++num1」(前置型)を表示する</p>");
document.write("「num1」は" + num1 + " 「ans1」は" + ans1);

let num2 = 500;
let ans2 = num2++;

document.write("<p>「let ans2 = num2++」(後置型)を表示する</p>");
document.write("「num2」は" + num2 + " 「ans2」は" + ans2);
