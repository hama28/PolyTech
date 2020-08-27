document.write("<h1>詳細な条件分岐</h1>");

let score = 66;
let num1 = 80;
let num2 = 70;
let num3 = 50;

if(score >= num1){
    document.write("あなたは成績『優』です！");
} else if(score >= num2) {
    document.write("あなたは成績『良』です○");
} else if(score >= num3) {
    document.write("あなたは成績『可』です△");
} else {
    document.write("あなたは成績『不可』です。");
}

document.write("<p>処理が終了しました！</p>");
