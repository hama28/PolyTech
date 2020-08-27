document.write('<h1>変数「num」が条件を満たすか(45以下か)を表示</h1>');

let num = 30;       //変数「num」を任意の数値で初期化する
if(num <= 45)       //もし「num」が45以下だったら
{
    document.write('数値は45以下です。');   //「数値は45以下です」
}
document.write('<p>処理が終了しました！</p>');