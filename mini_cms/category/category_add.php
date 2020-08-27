<?php
    session_start();

    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    # 投稿ボタンが押されたかチェック
    if ( $_SERVER['REQUEST_METHOD'] != 'POST') {
        header('Location: category_post.php');
        exit();
    }

    # 正規の投稿フォームから来たかチェック
    check_token();

    try {
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $sql = 'INSERT INTO categories (category_name) VALUES (?)';
        
        $stmt = $dbh->prepare($sql);
        
        $stmt->bindValue(1, $_POST['category_name'], PDO::PARAM_STR);
        
        $stmt->execute();

        $dbh = null;
    }
    catch (PDOException $e) {
        echo 'エラー' . h($e->getMessage());
        exit();
    }
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>カテゴリの登録完了</title>
    </head>

    <body>
        <h1>カテゴリの登録完了</h1>
        <p>新しいカテゴリを追加しました。</p>
        <p><a href="category.php">カテゴリ一覧に戻る</a></p>
    </body>
</html>