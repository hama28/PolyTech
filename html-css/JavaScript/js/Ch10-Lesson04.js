document.write("<h2>要素にクラス属性を追加</h2>");

function onP2RedButtonClick() {
    let showText = document.getElementById("show_text");
    showText.setAttribute("class", "red_text");
}

function onP2DefaultButtonClick() {
    let showText = document.getElementById("show_text");
    showText.removeAttribute("class");
}

document.write("<p>処理が終了しました！</p>");