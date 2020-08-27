document.write('<h1>while文で1～1000までの整数を足し算する</h1>');

document.write('<h2>whileループを開始します。</h2>');

let num = 1;
let sum = 0;

while(num <= 1000)
{
    sum = sum + num;
    num++;
}

document.write('答えは' + sum + 'です。');
document.write('ループ終了時の「i」は' + num + 'です。');

document.write('<p>処理が終了しました！</p>');