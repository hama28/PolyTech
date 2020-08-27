document.write('<h1>いろいろな演算子と計算</h1>');

//いろいろな演算子
let br = '<br>';        //改行タグ<br>を代入
let num1 = 500;
let num2 = 10;
let ans = num1 - num2;  //引き算

document.write('<p>◇変数「num1」と「num2」を「-」した「ans」を表示</p>');
document.write(ans);    //答え
document.write(br);

ans = num1 * num2;      //掛け算

document.write('<p>◇変数「num1」と「num2」を「*」した「ans」を表示</p>');
document.write(ans);
document.write(br);

ans = num1 / num2;      //割り算

document.write('<p>◇変数「num1」と「num2」を「/」した「ans」を表示</p>');
document.write(ans);    //答え
document.write(br);

num1 = 507;
num2 = 10;

ans = num1 % num2;      //あまり

document.write('<p>◇変数「num1」と「num2」を「%」した「ans」を表示</P>');
document.write(ans);
document.write(br);