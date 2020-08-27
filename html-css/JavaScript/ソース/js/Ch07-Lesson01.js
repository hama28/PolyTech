document.write('<h1>関数を知る</h1>');

//変数「num」を「乱数」で初期化する
let num = Math.round(Math.random() * 50);

//乱数の値を表示する
document.write('乱数で発生した値は「' + num + '」です。<br>');
document.write('<h2>乱数の値(cm)の円周を求めて表示する</h2>');

//関数「circle()」を定義する
function circle()
{
    let length = num * 2 * 3.14;
    document.write(num + 'cmの円周は、' + length + 'cmです。');
}
circle();
//関数「circle()」を呼び出す

document.write('<p>処理が終了しました!</p>');