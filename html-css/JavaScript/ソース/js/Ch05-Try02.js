document.write('<h1>乱数で発生させた数値の回数だけfor文でループしましょう</h1>');

let num = Math.round(Math.random() * 100);

document.write('乱数で発生した値は「' + num + '」です。');

document.write('<h2>forループを開始します。</h2>');

for(let i = 0; i < num; i++)
{
    document.write((i + 1) + '回目です。');
}

document.write('処理が終了しました。');