document.write('<h1>変数「num」が条件を満たすか(45以上か45未満かを判断して)表示</h1>');

let num = Math.round(Math.random() * 100);      //変数「num」を「乱数」で初期化する
document.write('乱数で発生した値は「' + num + '」です。<br>');  //乱数の値を表示する

if(num >= 45)
{
    document.write('乱数は45以上です。');       //「数値は45以上です。」と表示する
}
else
{
    document.write('数値は45未満です。');       //「数値は45未満です。」と表示する
}

document.write('<p>処理が終了しました！</p>');