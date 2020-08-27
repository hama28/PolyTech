document.write("<h1>while文によるループ</h1>");

let num = 5;
let rand = Math.round(Math.random()*10);

document.write("<h2>whileループを開始します</h2>")
document.write("<p>変数numの値「5」と乱数で発生した値が一致するまで繰り返す</p>")

while(rand !== num) {
    document.write("乱数で発生した値は" + rand + "です。<br>");
    rand = Math.round(Math.random()*10);
}

document.write("<p>処理が終了しました！</p>");
