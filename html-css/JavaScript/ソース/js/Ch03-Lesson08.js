document.write('<h1>前置型のインクリメントと後置型のインクリメント</h1>');

//前置型のインクリメント
let num1 = 500;     //変数「num1」の宣言と代入
let ans1 = ++num1;  //前置型でインクリメントしてから「ans」に代入する
document.write('<p>◇「let ans1 = ++num1」(前置型)を表示する</p>');
document.write('「num1」は' + num1 + '「ans1」は' + ans1);  //変数「num1」を表示する

//後置型のインクリメント
let num2 = 500;     //変数「num2」の宣言と代入
let ans2 = num2++;  //「ans2」に代入してから後置型でインクリメントする
document.write('<p>◇「let ans2 = num2++」(後置型)を表示する</p>');
document.write('「num2」は' + num2 + '「ans2」は' + ans2);  //変数「num2」を表示する
