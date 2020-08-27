document.write('<h1>オブジェクト指向を知る2</h1>');
document.write('<h2>～クラスの作成と利用～</h2>');

class TestScore
{
    //コンストラクタを定義する(プロパティメソッドを持つオブジェクトが生成される)
    constructor()
    {
        this.name = '';         //変数のまとまり(プロパティ)
        this.english = 0;
        this.math = 0;
        this.japanese = 0;
    }

    //「name」「english」「math」「japanese」の4つの引数を持ち合計と平均を求めて出力する関数「score」を定義する
    score()
    {
        let sum = this.english + this.math + this.japanese;     //合計を求めて「sum」に代入
        let ave = sum /3;                                       //平均を求めてsumに代入

        //合計結果を表示する
        document.write('<p>◆' + this.name + 'さんの3教科合計点は「' +sum + '点」です。<br>');
        //平均結果を表示する
        document.write('平均点は「' + ave + '点」でした</p>');
    }

    setConstructor(name = '', english = 0, math = 0, japanese = 0)
    {
        this.name = name;
        this.english = english;
        this.math = math;
        this.japanese = japanese;
    }   
}//ここでClass testScoreの定義終了

//山田さんのオブジェクトを生成する
let yamada = new TestScore();

//山田さんの情報で初期化する
yamada.name = '山田';
yamada.english = 80;
yamada.math = 70;
yamada.japanese = 90;

//山田さんの情報を表示するメソッドを呼び出す
yamada.score();

//小林さんのオブジェクトを生成する
let kobayashi = new TestScore();

//小林さんの情報を引数4つの「setConstructor」メソッドを利用して初期化する
kobayashi.setConstructor('小林', 60, 55, 70);

//小林さんの情報を表示する「score()」メソッドを呼び出す
kobayashi.score();

//田中さんのオブジェクトを生成と同時に初期化する(引数の数は合わない)
let tanaka = new TestScore();

//田中さんの情報を4つの「setConstructor」メソッドを利用して初期化する(引数が足りない)
tanaka.setConstructor('田中', 25);

//田中さんの情報を表示するメソッドを呼び出す
tanaka.score();

document.write('<p>処理が終了しました!</p>');