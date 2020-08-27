<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>文字列の長さを取得</title>
    </head>

    <body>
        <h2>文字列の長さを取得</h2>

        <?php
            $str = 'Hello PHP';

            echo $str;
            echo '<br>'.$str.'の文字数は<br>';
            echo mb_strlen($str);
        ?>

    </body>
</html>