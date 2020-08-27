document.write("<h1>変数「num」が条件を満たすか(45以下か45より上かを判断して)表示</h1>");

let num = Math.round(Math.random() * 100);
document.write("乱数で発生した値は「" + num + "」です。<br>");

if(num <= 45){
    document.write("数値は45以下です。");
} else {
    document.write("数値は45より上です。")
}

document.write("<p>処理が終了しました！</p>");
