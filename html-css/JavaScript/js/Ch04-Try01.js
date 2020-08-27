document.write("<h1>今日の運勢（if文を使用して表示してみましょう）</h1>");

let num = Math.round(Math.random() * 100);
document.write("乱数で発生した値は「" + num + "」です。<br>");

if(num >= 70) {
    document.write("今日の運勢は「大吉」です。");
} else if(num < 70 && num >= 50) {
    document.write("今日の運勢は「中吉」です。");
} else if(num < 50 && num >=20) {
    document.write("今日の運勢は「小吉」です。");
} else if(num < 20 && num >= 5) {
    document.write("今日の運勢は「残念」です。");
} else {
    document.write("今日はありえないことが起こるかもしれません。");
}

document.write("<p>素敵な一日を！</p>")