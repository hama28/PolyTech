document.write("<h1>配列の利用</h1>");

document.write("<h2>配列を利用して値を初期化・表示する<h2>")

let num = [];

num[0] = 10;
num[1] = 20;
num[2] = 30;
num[3] = 40;
num[4] = 50;

let i ;

for(i = 0; i < 5; i++){
    document.write("配列「num」の" + (1+i) + "つ目の値は" + num[i] + "です<br>");
}

document.write("<p>処理が終了しました！</p>");
