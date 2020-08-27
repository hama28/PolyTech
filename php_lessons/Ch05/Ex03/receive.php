<?php
    if (isset($_POST['save']) && $_POST['save'] == 'on'){
        setcookie('name', $_POST['name'], time() + 60 * 60 * 1);
        $msg = '名前を保存しました';
    } else {
        setcookie('name', '', time() - 3600);
        $msg = '名前を保存しませんでした';
    }

    $name = $_POST['name'];
    $pass = $_POST['pass'];
    $error = '';
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Cookieの読み込み</title>
    </head>

    <body>
        <h3>Cookieの読み込み</h3>

        <?php echo $msg; ?>

        <p><a href="./">入力フォームに戻る</a></p>

        <?php 
            if (mb_strlen($name) == 0) {
                $error .= "<p>※お名前を入力してください</p>";
            } 
            if (mb_strlen($pass) == 0) {
                $error .= "<p>※パスワードを入力してください</p>";
            }
            if(empty($error)) {
                echo "エラーはありません";
            } else {
                echo $error;
            }
        ?>

    </body>
</html>