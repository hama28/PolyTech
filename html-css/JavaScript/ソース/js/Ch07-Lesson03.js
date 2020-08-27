document.write('<h1>引数を受け取る関数</h1>');

//関数の呼び出し結果を出力する(1)
document.write('<h2>乱数の値(cm)を引数として渡して結果を表示する(1)</h2>');

//関数「circle1(引数1)」を定義する
function circle1(number1)                   //引数を1つ受け取ることができる関数を定義して
{
    let length1 = number1 * 2 * 3.14;
    return length1;
}

//変数「num1」を「乱数」で初期化する
let num1 = Math.round(Math.random() * 50);  //乱数で数値を発生させ、

//乱数の値を表示する
document.write('乱数で発生した値は「' + num1 + '」です。<br>');

//関数「circle1(number1)」を呼び出す
document.write(num1 + 'cmの円周は、' + circle1(num1) + 'cmです。');     //乱数の数値を引数として関数「circle1(number1)」を呼び出す。

//関数の呼び出し結果を出力する(2)
document.write('<h2>乱数の値(cm)を引数として渡して結果を表示する(2)</h2>');

//関数「circle2()」を定義する
function circle2()                          //引数を受け取らない関数を定義した後、
{
    let length2 = number2 * 2 * 3.14;
    return length2;
}

//変数「num2」を「乱数」で初期化する
let num2 = Math.round(Math.random() * 50);  //乱数で数値を発生させ、

//乱数の値を表示する
document.write('乱数で発生した値は「' + num2 + '」です。<br>');

//関数「circle2()」を呼び出す
document.write(num2 + 'cmの円周は、' + circle2() + 'cmです。');     //乱数の数値を引数として関数「circle2()」を呼び出す。

document.write('<p>処理が終了しました!</p>');