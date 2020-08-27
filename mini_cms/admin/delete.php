<?php
    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    if (empty($_GET['id'])){
        header('Location: index.php');
        exit();
    }

    try{
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        
        $sql = 'DELETE FROM posts WHERE id = ?';

        $stmt = $dbh->prepare($sql);

        $stmt->bindValue(1, (int)$_GET['id'], PDO::PARAM_INT);
        
        $stmt->execute();

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
        <title>記事の削除</title>
    </head>

    <body>
        <h1>記事の削除</h1>
        <p>記事を削除しました。</p>
    
        <p><a href="./">一覧に戻る</a></p>
    </body>
</html>