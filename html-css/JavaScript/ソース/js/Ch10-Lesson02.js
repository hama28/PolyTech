document.write('<h2>ノード操作の基本</h2>');

//idによる要素の取得
function onH1ButtonClick()
{
    //idが「head_title」の要素を取得
    let headTitle = document.getElementById('p_1');
    //取得した要素をコンソールに表示
    document.write(headTitle);
}

//テキストの取得
function onH1TextButtonClick()
{
    //idが「head_title」の要素を取得
    let headTitle = document.getElementById('head_title');
    //取得した要素のテキスト部分を取得
    let headTitleText = headTitle.textContent;
    //取得した要素をコンソールに表示
    document.write(headTitleText);
}

//テキストの置き換え
function onH1TextAltButtonClick()
{
    //idが「head_title」の要素を取得
    let headTitle = document.getElementById('head_title');
    //取得した要素のテキスト部分を取得
    headTitle.textContent = 'idによる取得とテキストの書き換えができました！';
}

document.write('<p>処理が終了しました!</p>');