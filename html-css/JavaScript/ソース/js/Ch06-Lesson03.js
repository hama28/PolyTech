document.write('<h1>JavaScriptの配列</h1>');
document.write('<h2>配列に型の違う値で初期化・合計を表示する</h2>');

//配列「list」を宣言して初期化
let list = [100, 'タマ', 'モモ', 'ミー', 55];

//配列「list」の内容を表示
document.write('配列「list」の1つ目の値は' + list[0] + 'です。<br>');
document.write('配列「list」の2つ目の値は' + list[1] + 'です。<br>');
document.write('配列「list」の3つ目の値は' + list[2] + 'です。<br>');
document.write('配列「list」の4つ目の値は' + list[3] + 'です。<br>');
document.write('配列「list」の5つ目の値は' + list[4] + 'です。<br>');

//配列「list」の1つ目と5つ目の合計を表示
document.write('<p>配列「list」の1つ目と5つ目の合計は「' + (list[0] + list[4]) + '」です。</p>');

document.write('<h2>配列「list」の6つ目に値を代入して表示する</h2>');

//配列「list」の6つ目に値を代入
list[5] = ['小林さん'];

//配列「list」の6つ目の値を表示する
document.write('配列「list」の6つ目の値は' + list[5] + 'です。<br>');

document.write('<h2>配列「list」の9つ目に値を代入して表示する</h2>');

//配列「list」の9つ目に値を代入
list[8] = ['斎藤さん'];

//配列「list」の内容を表示
document.write('配列「list」の1つ目の値は' + list[0] + 'です。<br>');
document.write('配列「list」の2つ目の値は' + list[1] + 'です。<br>');
document.write('配列「list」の3つ目の値は' + list[2] + 'です。<br>');
document.write('配列「list」の4つ目の値は' + list[3] + 'です。<br>');
document.write('配列「list」の5つ目の値は' + list[4] + 'です。<br>');
document.write('配列「list」の6つ目の値は' + list[5] + 'です。<br>');
document.write('配列「list」の7つ目の値は' + list[6] + 'です。<br>');
document.write('配列「list」の8つ目の値は' + list[7] + 'です。<br>');
document.write('配列「list」の9つ目の値は' + list[8] + 'です。<br>');

document.write('<p>処理が終了しました!</p>');