document.write('<h1>Mathオブジェクトの利用と確認</h1>');

//0～1のランダムに発生した数値を確認する
let random = Math.random();
document.write('<p>ランダムに発生した数値は、' + random + 'です。</p>');

//ランダムに発生した数値を1000倍した値を確認する
let multiple = 1000;
let num = random * multiple;
document.write('<p>ランダムな数値を' + multiple + '倍すると' + num + 'です。</p>');

//小数点第一位を四捨五入した値を確認する
let round = Math.round(num);
document.write('<p>小数点第一位を四捨五入すると、' + round + 'です。</p>');

document.write('<p>処理が終了しました!</p>');