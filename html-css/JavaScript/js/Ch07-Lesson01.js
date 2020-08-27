document.write("<h1>関数を知る</h1>");

let num = Math.round(Math.random()*50);

document.write("乱数発生値" + num + "です<br>");

function circle() {
    let length = num * 2* 3.14;
    document.write(num + "cmの円周は、" + length + "cmです");
}

circle();

document.write("<p>処理が終了しました！</p>");
