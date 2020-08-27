<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>連想配列の作成</title>
    </head>

    <body>
        <h2>連想配列の作成</h2>

        <?php
            $users = array(
                'Yamada' => 30,
                'Suzuki' => 28
            );

            foreach($users as $key => $val) {
                echo $key .'さん('. $val .'歳) <br>';
            }
        ?>

    </body>
</html>