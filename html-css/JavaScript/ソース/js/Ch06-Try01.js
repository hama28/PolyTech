document.write('<h1>配列「omikuji」を作成してランダムに結果を表示させる</h1>');

let num;
let kuji = [];

kuji[1] = '大吉';
kuji[2] = '中吉';
kuji[3] = '小吉';
kuji[4] = '凶';
kuji[5] = 'ぴょん吉';

do
{
    num = Math.round(Math.random() * 5);
}
while(num == 0);

document.write('今日のおみくじは「' + kuji[num] + '」です。');
document.write('<br>またきてね!');