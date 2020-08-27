<?php
    require_once('../inc/config.php');
    require_once('../inc/functions.php');

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
        <title>カテゴリ管理画面</title>
    </head>
    <body>
        <h1>カテゴリ管理画面</h1>
        <p><a href="../admin/index.php">投稿の管理画面へ</a></p>

        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>カテゴリ名</th>
                    <th>編集</th>
                    <th>削除</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach($result as $row) { ?>
                <tr>
                    <td><?php print($row['id']) ?></td>
                    <td><?php print($row['category_name']) ?></td>
                    <td><a href="category_edit.php?id=<?php print($row['id']); ?>">編集</a></td>
                    <td><a href="category_delete.php?id=<?php print($row['id']); ?>">削除</a></td>
                </tr>
                <?php } ?>
            </tbody>
        </table>
        <p>
        <button type="button" onclick="location.href='category_post.php'">カテゴリの新規登録へ</button>
        </p>
    </body>
</html>