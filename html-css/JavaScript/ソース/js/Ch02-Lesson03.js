document.write('<h1>同じ変数に何度も代入する</h1>');

//変数宣言して初期化(代入)する
let br = '<br>';
let box = 500;

//表示する
document.write('<p>◇変数「box」に「500」で初期化して表示</P>');
document.write(box);    //「box」の表示
document.write(br);     //改行タグの挿入

//代入する
box = 10000;

//表示する
document.write('<p>◇変数「box」に「10000」を代入して表示</p>');
document.write(box);    //「box」の表示
document.write(br);     //改行タグの挿入

//代入する
box = 'ドラえもん';

//表示する
document.write('<p>◇変数「box」に「ドラえもん」を代入して表示</p>');
document.write(box);    //「box」の表示
document.write(br);     //改行タグの挿入