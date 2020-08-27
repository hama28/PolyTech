document.write("<h1>戻り値を返す関数</h1>");

let num = Math.round(Math.random()*50);
document.write("乱数発生値" + num + "です<br>");

document.write("<h2>乱数の値の円周を求めて表示</h2>")

function circle1() {
    let length = num * 2 * 3.14;
}

document.write(num + "cmの円周は、" + circle1() + "cmです");



document.write("<h2>乱数の値の円周を求めて表示</h2>")

function circle2() {
    let length = num * 2 * 3.14;
    return length;
}

document.write(num + "cmの円周は、" + circle2() + "cmです");

document.write("<p>処理が終了しました！</p>");
