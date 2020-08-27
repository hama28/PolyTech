document.write('<h1>「+」演算子で連結と加算</h1>');
//変数「name」を任意の文字列で初期化する
let name = 'Sakurai';

//変数「num」と「dec」を任意の値で初期化する
let num = 500;
let dec = 3.14;
document.write('<p>◇文字列の後に数値を連結する「name + num + dec」を表示</p>');
document.write(name + num + dec);   //文字列の後に数値を連結する

document.write('<p>◇数値の後に文字列を連結する「num + dec + name」を表示</p>');
document.write(num + dec + name);   //数値の後に文字列を連結する

document.write('<p>◇文字列の後に優先順位を変更して計算した数値を連結する「name + (num + dec)」を表示する</p>');
document.write(name + (num + dec)); //文字列の後に優先順位を変更して計算した数値を連結する

document.write('<p>◇数値に文字列の数字を連結する「num + str」を表示する</p>');
let str = '29';     //文字列の数字「str」を宣言して初期化する

document.write(num + str);  //数値に文字列の数字を連結して表示する