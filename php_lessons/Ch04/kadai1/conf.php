<?php
    $name1 = $_POST['name1'];
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>ログイン</title>
    </head>

    <body>
        <h3>if文による入力チェック</h3>
        <?php 
            if (mb_strlen($name1) == 0) {
                echo "お名前を入力してください";
            } else {
                echo "ようこそ、{$name1}様";
            }
        ?>


    </body>
</html>