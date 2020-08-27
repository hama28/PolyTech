document.write('<h1>オブジェクト指向を知る1</h1>');
document.write('<h2>～複数の異種データ型の変数を作成してみましょう～</h2>');

//「name」「english」「math」「japanese」の4つの引数を持ち合計と平均を求めて出力する関数「score」を定義します
function score(name, english, math, japanese)
{
    let sum = english + math + japanese;        //合計を求めて「sum」に代入
    let ave = sum / 3;                          //平均を求めて「ave」に代入

    //合計結果を表示する
    document.write('<p>◆' + name + 'さんの3教科合計点は「' + sum + '点」です。<br>');

    //平均点を表示する
    document.write('平均点は「' + ave + '点」でした。</p>');
}

//山田さんの情報を代入する
let yamadaName = '山田';
let yamadaEnglish = 80;
let yamadaMath = 70;
let yamadaJapanese = 90;

//山田さんの情報を表示する関数を呼び出す
score(yamadaName, yamadaEnglish, yamadaMath, yamadaJapanese);

//小林さんの情報を代入する
let kobayashiName = '小林';
let kobayashiEnglish = 60;
let kobayashiMath = 55;
let kobayashiJapanese = 70;

//小林さんの情報を表示する関数を呼び出す
score(kobayashiName, kobayashiEnglish, kobayashiMath, kobayashiJapanese);

//田中さんの情報を代入する
let tanakaName = '田中';
let tanakaEnglish = 25;
let tanakaMath = 33;
let tanakaJapanese = 41;

//田中さんの情報を表示する関数を呼び出す
score(tanakaName, tanakaEnglish, tanakaMath, tanakaJapanese);

document.write('<p>処理が終了しました!</p>');