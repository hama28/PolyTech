<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>foreachによる反復</title>
    </head>

    <body>
        <h2>foreachによる反復</h2>

        <?php
            $names = array("suzuki","yamada","tanaka","yamamoto","nakamura");
            foreach($names as $name) {
                echo $name."さん<br>";
            }
        ?>

    </body>
</html>