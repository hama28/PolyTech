<?php
    session_start();

    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    check_token();

    if ( $_SERVER['REQUEST_METHOD'] !== 'POST') 
    {
        header('Location: category.php');
        exit();
    }

    try 
    {
        $dbh = new PDO(DSN, DB_USER, DB_PASSWORD);

        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $sql = 'UPDATE categories SET category_name=? WHERE id = ?';
        
        $stmt = $dbh->prepare($sql);
        
        $stmt->bindValue(1, $_POST['category_name'], PDO::PARAM_STR);
        $stmt->bindValue(2, (int)$_POST['id'], PDO::PARAM_INT);
        
        $stmt->execute();

        $dbh = null;

    } 
    catch (PDOException $e) 
    {
        echo 'エラー' . h($e->getMessage());
        exit();
    }
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>カテゴリ名の更新</title>
    </head>

    <body>
        <h1>カテゴリ名の更新</h1>
        <p>カテゴリ名を更新しました。</p>

        <p><a href="category.php">カテゴリ一覧に戻る</a></p>
    </body>
</html>