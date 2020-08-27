<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>多次元配列</title>
    </head>

    <body>
        <h2>多次元配列</h2>

        <?php
            $members = array(
                array('Takahashi', 'Maeda', 'Oshima'),
                array('Yamamoto', 'Watanabe', 'Umeda'),
                array('Sashihara', 'Miyawaki', 'Kodama')
            );

            print($members[2][0]);
        ?>

    </body>
</html>