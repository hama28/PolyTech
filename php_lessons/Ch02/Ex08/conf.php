<?php
    $word1 = $_POST['word1'];
    $word2 = $_POST['word2'];
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>データの受信 POST XSS対策</title>
    </head>

    <body>
        <h3>XSS対策なし</h3>
        <p>
            <?php
                echo $word1;
            ?>
        </p>

        <h3>XSS対策あり</h3>
        <p>
            <?php
                echo htmlspecialchars($word2, ENT_QUOTES, 'UTF-8');
            ?>
        </p>

    </body>
</html>