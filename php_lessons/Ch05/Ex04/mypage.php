<?php
    session_start();
    if(!isset($_SESSION['name']) || empty($_SESSION['name'])) {
        header('Location: ./');
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
        <h2>マイページ</h2>

        <dl>
            <dt>ユーザー名</dt>
            <dd><?php echo htmlspecialchars($_SESSION['name'],ENT_QUOTES,"UTF-8") ?></dd>
        </dl>

            <p><a href="logout.php">ログアウト</a></p>
        </form>
    </body>
</html>