<?php
    $name = $_GET['user'];
    $pass = $_GET['pass'];
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>データの受信 GET</title>
    </head>

    <body>
        <h3>名前</h3>
        <p>
            <?php
                echo $name;
            ?>
        </p>

        <h3>パスワード</h3>
        <p>
            <?php
                echo $pass;
            ?>
        </p>

    </body>
</html>