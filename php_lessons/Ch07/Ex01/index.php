<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="utf-8">
        <title>ファイルの読み込み</title>
    </head>

    <body>
        <h1>ファイルの読み込み</h1>

        <?php
            //data.txtを読み込みモードで開く
            $fp = fopen('data.txt', 'rb');

            //ファイルをロックする
            flock($fp, LOCK_SH);

            //ファイルを読み込んで表示
            while(($line = fgets($fp)) != false) {
                echo htmlspecialchars($line, ENT_QUOTES, 'UTF-8') . '<br>';
            }

            //ファイルのロックを解除する
            flock($fp, LOCK_UN);

            //ファイルを閉じる
            fclose($fp);
        ?>

    </body>
</html>