<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="utf-8">
        <title>ファイルの書き込み</title>
    </head>

    <body>
        <h1>ファイルの書き込み</h1>

        <?php
            //data.txtを書き込みモードで開く
            $fp = fopen('data.txt', 'ab');

            //ファイルをロックする
            flock($fp, LOCK_EX);

            //書き込む文字列の準備
            $msg = "こんにちは\r\nこんばんは\r\n";

            //ファイルに書き込む
            $flag = fwrite($fp, $msg);

            //書き込み状況をチェック
            if($flag) {
                echo 'ファイルの書き込みに成功しました！';
            } else {
                echo 'ファイルの書き込みに失敗しました';
            }

            //ファイルのロックを解除する
            flock($fp, LOCK_UN);

            //ファイルを閉じる
            fclose($fp);
        ?>

    </body>
</html>