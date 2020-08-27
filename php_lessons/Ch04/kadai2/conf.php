<?php
    $mail1 = $_POST['mail1'];
    $pass1 = $_POST['pass1'];
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>ログイン</title>
    </head>

    <body>
        <h3>ログインチェック</h3>
        <?php 
            if (mb_strlen($pass1) < 7) {
                echo "パスワードは8文字以上で入力してください<br>";
            } elseif ($mail1 == "dummy@dummy.com" && $pass1 == "dummydummy") {
                echo "ログイン成功";
            } else {
                echo "メールアドレスとパスワードが一致しません";
            }
        ?>


    </body>
</html>