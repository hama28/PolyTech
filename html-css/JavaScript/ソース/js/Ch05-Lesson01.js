document.write('<h1>while文によるループ(繰り返し)</h1>');

let num = 5;
let rand = Math.round(Math.random() * 10);      //変数「rand」を「乱数(最大10)」で初期化する

document.write('<h2>whileループを開始します</h2>');

document.write('<p>◇変数numの値「5」と乱数で発生した値が一致するまで繰り返す</p>');

//ランダムに発生させた「rand」と「num」が一致したら終了
while(rand !== num)
{
    document.write('乱数で発生した値は「' + rand + '」です。<br>');     //乱数の値を表示する
    rand = Math.round(Math.random() * 10);                            //変数「rand」を「乱数(最大10)」で初期化する
}

document.write('<p>処理が終了しました！</p>');