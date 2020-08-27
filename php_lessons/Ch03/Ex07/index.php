<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>連想配列の作成</title>
    </head>

    <body>
        <h2>連想配列の作成</h2>

        <?php
            $savings = array();

            $savings['father'] = 150;
            $savings['mother'] = 300000;
            $savings['child'] = 15000;

            print($savings['mother']);
        ?>

    </body>
</html>