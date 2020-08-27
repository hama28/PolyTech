document.write('<h1>ランダムな数値を発生させfor文で表示、値を合計して表示する。</h1>');
document.write('<h2>0～100のランダムな数値を発生させ、<br>要素数10の配列「math」に代入し、<br>for文で表示する。</h2>');

let math = [];
let num = 0;
let sum = 0;

for(let i = 0; i < 10; i++)
{
    num = Math.round(Math.random() * 100);
    math[i] = num;
}

for(let i = 0; i < math.length; i++)
{
    document.write('配列「math」の' + (i + 1) + 'つ目の値は「' + math[i] + '」です。<br>');
    sum += math[i];
}

document.write('<h2>合計「sum」を宣言し、<br>for文で合計し、<br>結果を表示する。');

document.write('配列「math」の要素の値の合計は「' + sum + '」です。');