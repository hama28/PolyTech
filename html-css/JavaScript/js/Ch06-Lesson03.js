document.write("<h1>Javascriptの配列</h1>");
document.write("<h2>配列に型の違う値で初期化・表示する<h2>")

let list = [100,"タマ","モモ","ミー",55];
let i ;

for(i = 0; i < 5; i++){
    document.write("配列「num」の" + (1+i) + "つ目の値は" + list[i] + "です<br>");
}

document.write("<p>配列「list」の1つ目と5つ目の合計は「" + (list[0]+list[4]) + "」です</p>")

list[5] = "小林さん";

document.write("<p>配列「list」の6つ目の値は" + list[5] + "です</p>");

list[8] = "斎藤さん";

for(i = 0; i < 9; i++){
    document.write("配列「num」の" + (1+i) + "つ目の値は" + list[i] + "です<br>");
}

document.write("<p>処理が終了しました！</p>");
