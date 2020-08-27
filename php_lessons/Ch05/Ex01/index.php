<?php
    function deguti() {
        header("Location: kakunin.php");
        exit();
    }
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>リダイレクト</title>
    </head>

    <body>
        <h3>リダイレクト</h3>

        <button onclick="<?php deguti() ?>">出口</button>

    </body>
</html>