document.write("<h2>様々なノードの取得方法</h2>");

function onTagButtonClick() {
    let buttonTags = document.getElementsByTagName("button");
    let result = "";
    for(let i = 0; i < buttonTags.length; i++) {
        result += buttonTags[i].textContent + ":";
    }
    let resultP = document.getElementById("result");
    resultP.textContent = "【button 要素の取得】" + result;
}

function onClassButtonClick() {
    let redElements = document.getElementsByClassName("red_text");
    let result = "【red_text クラスを含む要素】";
    for(let i = 0; i < redElements.length; i++) {
        result += redElements[i].textContent + ":";
    }
    let resultP = document.getElementById("result");
    resultP.textContent = result;
}

function onNameButtonClick() {
    let checkboxes = document.getElementsByName("study");
    let result = "【チェックされたもの】";
    for(let i = 0; i < checkboxes.length; i++) {
        if(checkboxes[i].checked) {
            result += checkboxes[i].value + ":";
        }
    }
    let resultP = document.getElementById("result");
    resultP.textContent = result;
}


document.write("<p>処理が終了しました！</p>");