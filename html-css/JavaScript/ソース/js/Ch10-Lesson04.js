document.write('<h2>要素にクラス属性を追加</h2>');

//[上の文字を赤色に]ボタンクリックの処理
function onP2RedButtonClick()
{
    //idがshow_textのp要素を取得
    let showText = document.getElementById("show_text");
    //取得したp要素のclass属性にredTextクラスを設定
    showText.setAttribute("class", "red_text");
}

//[赤文字を元通りに]ボタンクリック時の処理
function onP2DefaultButtonClick()
{
    //idがshow_textのp要素を取得
    let showText = document.getElementById("show_text");
    //取得したp要素のclass属性を削除
    showText.removeAttribute("class");
}

document.write('<p>処理が終了しました!</p>');