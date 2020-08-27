document.write('<h1>戻り値を返す関数</h1>');

//変数「num」を「乱数」で初期化する
let num = Math.round(Math.random() * 50);

//乱数の値を表示する
document.write('乱数で発生した値は「' + num + '」です。<br>');

//関数の呼び出し結果を出力する(1)
document.write('<h2>乱数の値(cm)の円周を求めて表示する(1)</h2>');

//関数「circle1()」を定義する
function circle1()
{
    let length = num * 2 * 3.14;
}
//関数「circle1()」を呼び出す
document.write(num + 'cmの円周は、' + circle1() + 'cmです。');

//関数の呼び出し結果を出力する(2)
document.write('<h2>乱数の値(cm)の円周を求めて表示する(2)</h2>');

//関数「circle2()」を定義する
function circle2()
{
    let length = num * 2 * 3.14;
    return length;
}
//関数「circle2()」を呼び出す
document.write(num + 'cmの円周は、' + circle2() + 'cmです。');

document.write('<p>処理が終了しましt!</p>');