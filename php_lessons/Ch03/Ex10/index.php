<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>多次元配列</title>
    </head>

    <body>
        <h2>多次元配列</h2>

        <?php
            $users = array(
                array(
                    'name' => 'Yamada',
                    'password' => 'abc123'
                ),
                array(
                    'name' => 'Tanaka',
                    'password' => 'tantan'
                ),
                array(
                    'name' => 'Suzuki',
                    'password' => '123123'
                ),
                array(
                    'name' => 'Tom',
                    'password' => 'tomtom'
                ),
                array(
                    'name' => 'Bob',
                    'password' => 'bbbb'
                ),
                array(
                    'name' => 'Stave',
                    'password' => 'stave'
                )
            );

            print('Name : '.$users[0]['name'].'<br>'.'Pass : '.$users[0]['password']);
        ?>

    </body>
</html>