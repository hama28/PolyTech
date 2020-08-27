<?php
    $name1 = $_POST['name1'];
    $mail1 = $_POST['mail1'];

    $error = '';
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
                $error .= "<p>お名前を入力してください</p>";
            } 


            if (filter_var($mail1, FILTER_VALIDATE_EMAIL) === false) {
                $error .= "<p>メールアドレスの形式が正しくありません</p>";
            }

            if(empty($error)) {
                echo "エラーはありません";
            } else {
                echo $error;
            }
        ?>

    </body>
</html>