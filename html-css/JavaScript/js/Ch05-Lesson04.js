document.write("<h1>for文によるループ</h1>");

let num = 5;

document.write("<h2>forループで" + num + "回繰り返します</h2>")

let i ;

for(i = 0; i < num; i++){
    document.write("「i」は" + i + "です<br>");
    document.write("今日も元気です<br><br>");
}

document.write("<p>ループ終了時の「i」は" + i + "です</p>");
document.write("<p>処理が終了しました！</p>");
