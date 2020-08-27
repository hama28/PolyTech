document.write("<h1>配列を作成してfor文で値を表示する</h1>");

let list = ["ポチ","タマ","モモ","ミー","リンリン"];
let i ;

for(i = 0; i < list.length; i++){
    document.write("配列「list」の" + (1+i) + "つ目の名前は" + list[i] + "です<br>");
}

document.write("<p>処理が終了しました！</p>");
