document.write('<h1>DOMとWindowオブジェクト</h1>');

//アラートボックスを表示する
window.alert('今日も元気です!');

//確認ダイヤログボックスを表示する
if(window.confirm('今日も元気ですか???'))
{
    document.write('<p>よかったね</p>');
}
else
{
    document.write('<p>そーなんだ</p>');
}

//入力ダイヤログボックスを表示する
let moji =window.prompt('何か入力してみてください');

if(moji == '')
{
    document.write('<p>ちゃんと入力してよ</p>');
}
else
{
    document.write('<p>「' + moji + '」と入力されました</p>');
}

//新しい画面で「Ch10-Lesson01.html」を開く
window.open('Ch10-open.html');

document.write('<p>処理が終了しました!</p>');