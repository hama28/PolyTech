document.write("<h1>「+」演算子での連結と加算</h1>");

let name = "Sakurai";
let num = 500;
let dec = 3.14;

document.write("<p>文字列の後に数値を連結する「name + num + dec」を表示</p>");
document.write(name + num + dec);

document.write("<p>文字列の後に数値を連結する「num + dec + name」を表示</p>");
document.write(num + dec + name);

document.write("<p>文字列の後に優先順位を変更して数値を連結する「name + (num + dec)」を表示</p>");
document.write(name + (num + dec));

document.write("<p>数値wに文字列の数字を連結する「num + str」を表示</p>");
let str = "29"
document.write(num + str);
