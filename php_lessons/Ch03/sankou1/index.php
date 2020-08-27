<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>print_r関数</title>
    </head>

    <body>
        <h3>配列の中身を確認</h3>

        <?php
        //多次元配列usersを新規に作成
            $users = array(
                array('name' => 'Yamada', 'password' => 'abc123'),
                array('nam' => 'Tanaka', 'password' => 'tantan'),
                array('name' => 'Suzuki', 'password' => '123123'),
                array('name' => 'Tom', 'password' => 'tomtom'),
                array('name' => 'Bob', 'password' => 'bbbb'),
                array('name' => 'Stave', 'password' => 'stave')
            );
        ?>

        <h4>preタグ未使用</h4>
        <?php print_r($users); ?>

        <h4>preタグ使用</h4>
        <pre><?php print_r($users); ?></pre>
    </body>
</html>