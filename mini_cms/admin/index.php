<?php
    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    $page = 1;
    if (isset($_GET['page']) && !empty($_GET['page'])) {
        $page = $_GET['page'];
    }

    $limit = 5;

    try{
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $sql = 'SELECT count(*) AS total FROM posts';
        $stmt = $dbh->query($sql);
        $count = $stmt->fetch(PDO::FETCH_ASSOC);
        # print_r($count);

        $total = ceil($count['total'] / $limit);
        # print_r($total);

        # 存在しないページ番号にならない対策
        # 1より小さくしない
        # &page と 1 を比較して、大きい方を返す
        $page = max($page, 1);
        # トータル以上の数にならない
        # &page と $total を比較して、小さい方を返す
        $page = min($page, $total);

        $start = ($page - 1) * $limit;
        $sql = 'SELECT * FROM posts ORDER BY created DESC LIMIT ?, ?';
        $stmt = $dbh->prepare($sql);

        $stmt->bindValue(1, (int)$start, PDO::PARAM_INT);
        $stmt->bindValue(2, (int)$limit, PDO::PARAM_INT);
        $stmt->execute();

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
        <title>管理画面</title>
    </head>
    <body>
        <h1>管理画面</h1>
        <p><a href="post.php">新しい記事を投稿する</a></p>
        <p><a href="../category/category.php">カテゴリの管理画面へ</a></p>

        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>タイトル</th>
                    <th>公開日</th>
                    <th>更新日</th>
                    <th>編集</th>
                    <th>削除</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach($result as $row) { ?>
                <tr>
                    <td><?php print($row['id']) ?></td>
                    <td><?php print($row['title']) ?></td>
                    <td><time datetime="<?php print($row['created']) ?>"><?php print(date('Y年m月d日',strtotime($row['created']))); ?></time></td>
                    <td><time datetime="<?php print($row['modified']) ?>"><?php print(date('Y年m月d日',strtotime($row['modified']))); ?></time></td>
                    <td><a href="edit.php?id=<?php print($row['id']); ?>">編集</a></td>
                    <td><a href="delete.php?id=<?php print($row['id']); ?>">削除</a></td>
                </tr>
                <?php } ?>
            </tbody>
        </table>

        <h2>ページナビゲーション</2>
        
        <?php if ($page < $total) { ?>
            <p><button type="button" onclick="location.href='./?page=<?php print($page + 1) ?>'">次のページへ</button></p>
        <?php } ?>

        <?php if ($page > 1) { ?>
            <p><button type="button" onclick="location.href='./?page=<?php print($page - 1) ?>'">前のページへ</button></p>
        <?php }  ?>

    </body>
</html>