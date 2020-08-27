document.write("<h1>引数を受け取る関数</h1>");

document.write("<h2>乱数の値を引数として渡して結果を表示</h2>")

function circle1(number1) {
    let length1 = number1 * 2 * 3.14;
    return length1;
}

let num1 = Math.round(Math.random()*50);
document.write("乱数発生値" + num1 + "です<br>");

document.write(num1 + "cmの円周は、" + circle1(num1) + "cmです");



document.write("<h2>乱数の値を引数として渡して結果を表示</h2>")

function circle2() {
    let length2 = number2 * 2 * 3.14;
    return length2;
}

let num2 = Math.round(Math.random()*50);
document.write("乱数発生値" + num2 + "です<br>");

document.write(num2 + "cmの円周は、" + circle2() + "cmです");


document.write("<p>処理が終了しました！</p>");
