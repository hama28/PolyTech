<?php
    $name1 = $_POST['name1'];
    $mail1 = $_POST['mail1'];

    function touroku($n,$m) {
        echo "お名前：".$n."<br>";
        echo "メール：".$m;
    }
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>メール形式のチェック</title>
    </head>

    <body>
        <h3>ログインチェック</h3>

        <?php 
            if (mb_strlen($name1) == 0) {
                echo "<p>お名前を入力してください</p>";
            } elseif (filter_var($mail1, FILTER_VALIDATE_EMAIL) === false) {
                echo "<p>メールアドレスの形式が正しくありません</p>";
            } else {
                echo "<p>チェック完了 以下の情報で登録します</p>";
                echo touroku($name1,$mail1);
            }
        ?>

    </body>
</html>