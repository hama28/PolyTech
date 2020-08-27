<?php
    $select = $_POST['select'];
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>ラジオボタンによる選択</title>
    </head>

    <body>
        <h3>ラジオボタンによる選択</h3>
        <p>選択されたのは「
            <?php 
                echo htmlspecialchars($select, ENT_QUOTES, 'UTF-8')
            ?>
            」です。
        </p>
    </body>
</html>