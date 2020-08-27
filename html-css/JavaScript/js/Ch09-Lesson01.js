document.write("<h1>Dateオブジェクトの利用</h1>");

let today = new Date();

document.write("<h2>日付の表示</h2>")
document.write("<p>今日は" + today + "です</p>")

let month = today.getMonth() + 1;
let day = today.getDate();

document.write("<h2>日付の表示</h2>")
document.write("<p>今日は" + month + "月" + day + "日です</p>")

document.write("<h2>日付の表示</h2>")
document.write("<p>日本的に表記すると" + today.toLocaleDateString() + "です</p>")

document.write("<h2>12ヶ月前の表示</h2>")
let monthAgo = today.setMonth(month - 1 - 12);
document.write("<p>12ヶ月前は" + today.toLocaleDateString(monthAgo) + "です</p>")

document.write("<p>処理が終了しました！</p>");
