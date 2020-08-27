document.write('<h1>for文によるループ(繰り返し)</h1>');

let num = 5;        //変数「num」を任意の数値で初期化する

document.write('<h2>forループで' + num + '回繰り返します</h2>');

//「i」のループカウンタを0で初期化し、「num」の回数を超えない範囲で繰り返し処理を行い、
//「i」カウントをインクリメントする
let i;              //変数「i」を宣言する

for(i = 0; i < num; i++)
{
    document.write('「i」は' + i + 'です。');     //ループの回数を表示する
    document.write('今日も元気です<br><br>');
}

document.write('ループ終了時の「i」は' + i + 'です。'); //ループ時の「i」の値を表示する

document.write('<p>処理が終了しました!</p>');