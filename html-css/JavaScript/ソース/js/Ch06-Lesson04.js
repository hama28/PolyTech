document.write('<h1>配列を作成してfor文で値を表示する</h1>');

//配列「nameList」を宣言して初期化
let nameList = ['ポチ', 'タマ', 'モモ','ミー', 'リンリン'];

//配列「nameList」の内容を表示
for(let i = 0; i <= 4; i++)
{
    document.write('配列「nameList」の' + (i + 1) + 'つ目の名前は' + nameList[i] + 'です。<br>');
}

document.write('<p>処理が終了しました!</p>');