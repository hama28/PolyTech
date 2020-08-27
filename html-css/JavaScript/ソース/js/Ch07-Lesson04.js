document.write('<h1>複数の引数を受け取る関数</h1>');

//四角形の面積を求める関数を呼び出し、結果を出力する
document.write('<h2>乱数の値(cm)を2つ引数として渡して結果を表示する</h2>');

//関数「square(引数1, 引数2)」を定義する
function square(number1, number2)           //引数を2つ受け取ることができる関数を定義して、
{
    let area = number1 * number2;
    return area;
}

//変数「num1」を「乱数」で初期化する
let num1 = Math.round(Math.random() * 10);      //乱数で数値を発生させ「num1」に、
//乱数の値を表示する
document.write('乱数で発生した1つ目の値は「' + num1 + '」です。<br>');

//変数「num2」を「乱数」で初期化する
let num2 = Math.round(Math.random() * 10);      //乱数で数値を発生させ「num2」に、
//乱数の値を表示する
document.write('乱数で発生した2つ目の値は「' + num2 + '」です。<br>');

//乱数の数値2つを引数として渡した関数「square(number1, number2)」を呼び出す
document.write('<strong>幅：' + num1 + 'cm、' + '高さ：' + num2 + 'cmの四角形の面積は、' + square(num1, num2) + '平方センチメートルです。</strong>');

document.write('<p>処理が終了しました!</p>');