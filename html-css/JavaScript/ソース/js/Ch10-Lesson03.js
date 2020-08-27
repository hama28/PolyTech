document.write('<h2>ノード操作の基本 ～IDで操作する～</h2>');

//idによる要素の取得
function onFreewordButtonClick()
{
    //idが「freeword_input」の要素を取得
    let freewordInput = document.getElementById('freeword_input');
    //取得した「input」要素の入力値を取得
    let freewordInputValue = freewordInput.value;       //テキストボックスに入った文字を取得

    //取得した「input」要素の「name」属性値を取得
    let freewordInputName = freewordInput.getAttribute('name');     //「freeword」が取得される
    //idが「showInput」の「p」要素を取得
    let showInput = document.getElementById('show_input');          //show_inputのp要素「ここに結果が表示されます」の部分

    //取得した「p」要素のテキストに「input」要素の入力値と「name」属性を表示
    showInput.textContent = 'name属性が' + freewordInputName + 'の入力された値：' + freewordInputValue;
}

document.write('<p>処理が終了しました!</p>');