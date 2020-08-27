document.write("<h1>同じ変数に何度も代入する</h1>")

let br = "<br>";
let box = 500;

document.write("<p>◆変数「box」に「500」で初期化して表示</p>");
document.write(box);
document.write(br);

box = 10000;

document.write("<p>◆変数「box」に「10000」を代入して表示</p>");
document.write(box);
document.write(br);

box = "ドラえもん";

document.write("<p>◆変数「box」に「ドラえもん」を代入して表示</p>");
document.write(box);
document.write(br);