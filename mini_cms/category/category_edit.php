<?php
    session_start();

    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    set_token();

    if (empty($_GET['id'])){
        header('Location: category.php');
        exit();
    }

    try{
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        
        $sql = 'SELECT * FROM categories WHERE id = ?';

        $stmt = $dbh->prepare($sql);

        $stmt->bindValue(1, (int)$_GET['id'], PDO::PARAM_INT);
        
        $stmt->execute();

        $result = $stmt->fetch(PDO::FETCH_ASSOC);

        $dbh = null;
    }
    catch (PDOException $e){
        echo 'エラー' . h($e->getMessage());
        exit();
    }
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>カテゴリ名の編集</title>
    </head>

    <body>
        <h1>カテゴリ名の編集</h1>
        
        <form action="category_update.php" method="post">
            <dl>
                <dt><label for="category_name">カテゴリ名</label></dt>
                <dd>
                    <input type="text" id="category_name" name="category_name" value="<?php print($result['category_name']) ?>">
                </dd>
            </dl>

            <p><input type="hidden" name="id" value="<?php echo h($result['id']); ?>"></p>
            <p><input type="hidden" name="token" value="<?php echo h($_SESSION['token']); ?>"></p>
            <p><input type="submit" value="編集完了"></p>
        </form>
        <p><a href="category.php">一覧に戻る</a></p>
    </body>
</html>