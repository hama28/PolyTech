<?php
    require_once('inc/config.php');
    require_once('inc/functions.php');

    if (empty($_GET['id'])){
        header('Location: index.php');
        exit();
    }

    try{
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        
        # SQLインジェクションの脆弱性のある書き方
        # $sql = 'SELECT posts.*,categories.category_name FROM posts JOIN categories ON posts.category_id = categories.id WHERE posts.id = '.$_GET['id'];
        
        # プリペアド・ステートメントを利用する
        $sql = 'SELECT posts.*,categories.category_name FROM posts JOIN categories ON posts.category_id = categories.id WHERE posts.id = ?';
        
        # ステートメントの用意
        # $stmt = $dbh->query($sql);
        $stmt = $dbh->prepare($sql);
        
        # プレスホルダに値を入れる
        $stmt->bindValue(1, $_GET['id'], PDO::PARAM_INT);
        
        # ステートメントの実行
        $stmt->execute();
        
        $result = $stmt->fetch(PDO::FETCH_ASSOC);
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
        <title><?php print($result['title']); ?></title>
    </head>
    <body>
        <h1><?php print($result['title']); ?></h1>

        <?php if (!empty($result['post_image'])) { ?>
            <figure>
                <img src="upload/<?php print($result['post_image']); ?>" alt="<?php print($result['title']); ?>" class="pic">
            </figure>
        <?php } ?>

        <ul>
            <li>公開日：<time datetime="<?php print($result['created']) ?>"><?php print(date('Y年m月d日',strtotime($result['created']))); ?></time></li>
            <li>カテゴリ：<?php print($result['category_name']); ?></li>
        </ul>

        <p><?php print(nl2br($result['content'])); ?></p>

        <p><a href="./">一覧に戻る</a></p>
    </body>
</html>