<?php
    session_start();
    $name = 'dummy';
    $pass = 'dummy';

    if($_POST['name'] == $name && $_POST['pass'] == $pass) {
        $_SESSION['name'] = $_POST['name'];
        $msg = 'ようこそ'.$_SESSION['name'].'さん';
    } else {
        $msg = 'ログインできませんでした';
    }
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Sessionの利用</title>
    </head>

    <body>
        <h1>Sessionの利用</h1>

        <p><?php echo htmlspecialchars($msg,ENT_QUOTES,"UTF-8"); ?></p>
        
        <ul>
            <li><a href="./">入力フォームに戻る</a></li>
            <li><a href="mypage.php">マイページへ</a></li>
        </ul>
    </body>
</html>