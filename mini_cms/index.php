<?php
    require_once('inc/config.php');
    require_once('inc/functions.php');

    $page = 1;
    if (isset($_GET['page']) && !empty($_GET['page'])) {
        $page = $_GET['page'];
    }

    $limit = 5;

    try{
        # データベースハンドル
        # new PDO(データソースネーム、DBのユーザー名、DBのパスワード)
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
    
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        # SQL文の作成
        # $sql = 'INSERT INTO posts (title,content,category_id,created) VALUES ("テストのご報告","先日、テストを行いました。",3,now())';
        # $sql = 'SELECT * FROM posts ORDER BY created DESC';
        $sql = 'SELECT count(*) AS total FROM posts';

        # SQLの実行
        # $dbh->query($sql);
        $stmt = $dbh->query($sql);

        $count = $stmt->fetch(PDO::FETCH_ASSOC);
        $total = ceil($count['total'] / $limit);

        $page = max($page, 1);
        $page = min($page, $total);

        $start = ($page - 1) * $limit;
        $sql = 'SELECT * FROM posts ORDER BY created DESC LIMIT ?, ?';
        $stmt = $dbh->prepare($sql);

        $stmt->bindValue(1, (int)$start, PDO::PARAM_INT);
        $stmt->bindValue(2, (int)$limit, PDO::PARAM_INT);
        $stmt->execute();

        # 実行結果を連想配列として取得
        $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
        # 通常の配列で取得
        # $result = $stmt->fetchAll(PDO::FETCH_NUM);

        # DBとの接続終了
        $dbh = null;
    }
    catch(PDOException $e){
        # 例外発生時の処理
        echo 'エラー' . h($e->getMessage());
        exit();
    }
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>新着記事一覧</title>
    </head>
    <body>
        <h1>新着記事一覧</h1>

        <dl>
            <?php
                foreach ($result as $r){ 
            ?>
                    <dt><time datetime="<?php print($r['created']) ?>"><?php print(date('Y年m月d日',strtotime($r['created']))); ?></time></dt>
                    <dd>
                        <a href="detail.php?id=<?php print($r['id']) ?>">
                            <?php print($r['title']); ?>
                        </a>
                    </dd>
            <?php
                } 
            ?>
        </dl>

        <button type="button" onclick="location.href='/mini_cms/admin/post.php'">新規投稿する</button>

        <h3>ページ</h3>
        <?php if ($page == 1) { ?>
            <p><button type="button" onclick="location.href='./?page=<?php print($page + 1) ?>'">次のページへ</button></p>
        <?php } elseif ($page != $total) { ?>
            <p><button type="button" onclick="location.href='./?page=<?php print($page + 1) ?>'">次のページへ</button></p>
            <p><button type="button" onclick="location.href='./?page=<?php print($page - 1) ?>'">前のページへ</button></p>
        <?php } else { ?>
            <p><button type="button" onclick="location.href='./?page=<?php print($page - 1) ?>'">前のページへ</button></p>
        <?php } ?>
    </body>
</html>