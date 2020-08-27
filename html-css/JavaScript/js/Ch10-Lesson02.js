document.write("<h2>ノード操作の基本</h2>");

function onH1ButtonClick() {
    let headTitle = document.getElementById("head_title");
    document.write(headTitle);
}

function onH1TextButtonClick() {
    let headTitle = document.getElementById("head_title");
    let headTitleText = headTitle.textContent;
    document.write(headTitleText);
}

function onH1TextAltButtonClick() {
    let headTitle = document.getElementById("head_title");
    headTitle.textContent = "idによる取得とテキストの書き換えができました！";
}

document.write("<p>処理が終了しました！</p>");