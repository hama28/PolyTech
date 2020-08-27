document.write("<h2>ノード操作の基本 ～IDで操作する</h2>");

function onFreewordButtonClick() {
    let freewordInput = document.getElementById("freeword_input");
    let freewordInputValue = freewordInput.value;

    let freewordInputName = freewordInput.getAttribute("name");
    let showInput = document.getElementById("show_input");

    showInput.textContent = "name属性が" + freewordInputName + "の入力された値：" + freewordInputValue;
}

document.write("<p>処理が終了しました！</p>");