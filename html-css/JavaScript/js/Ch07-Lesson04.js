document.write("<h1>複数の引数を受け取る関数</h1>");

document.write("<h2>乱数の値を２つ引数として渡して結果を表示</h2>")

function square(number1, number2) {
    let area = number1 * number2;
    return area;
}

let num1 = Math.round(Math.random()*10);
document.write("乱数発生値" + num1 + "です<br>");

let num2 = Math.round(Math.random()*10);
document.write("乱数発生値" + num2 + "です<br>");

document.write("幅" + num1 + "cm、高さ" + num2 + "cmの四角形の面積は" + square(num1,num2) + "平方センチメートルです");

document.write("<p>処理が終了しました！</p>");
