<?php
    session_start();

    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    set_token();

    try{
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $sql = 'SELECT * FROM categories';
        $stmt = $dbh->query($sql);
        $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
        
        $dbh = null;
    }
    catch(PDOException $e){
        echo 'エラー' . h($e->getMessage());
        exit();
    }
?>



<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>カテゴリ登録フォーム</title>
    </head>

    <body>
        <h1>カテゴリ登録フォーム</h1>
        
        <form action="category_add.php" method="post">
            <dl>
                <dt><label for="category_name">カテゴリ名</label></dt>
                <dd>
                    <input type="text" id="category_name" name="category_name">
                </dd>
            </dl>
        
            <p><input type="hidden" name="token" value="<?php echo h($_SESSION['token']); ?>"></p>
            <p><input type="submit" value="登録"></p>
        </form>
        <p><a href="category.php">一覧に戻る</a></p>
    </body>
</html>