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
        <title>投稿フォーム</title>
    </head>

    <body>
        <h1>投稿フォーム</h1>
        
        <form action="add.php" method="post" enctype="multipart/form-data">
            <dl>
                <dt><label for="title">記事のタイトル</label></dt>
                <dd>
                    <input type="text" id="title" name="title">
                </dd>
        
                <dt><label for="category_id">カテゴリーID</label></dt>
                <dd>
                    <select name="category_id" id="category_id">
                        <?php foreach($result as $row) { ?>
                            <option value="<?php print($row['id']) ?>"><?php print($row['category_name']) ?></option>
                        <?php } ?>
                    </select>
                </dd>

                <dt><label for="content">記事の内容</label></dt>
                <dd>
                    <textarea name="content" id="content" cols="30" rows="10"></textarea>
                </dd>

                <dt><label for="post_image">画像</label></dt>
                <dd>
                    <input type="file" id="post_image" name="post_image">
                </dd>
            </dl>
        
            <p><input type="hidden" name="token" value="<?php echo h($_SESSION['token']); ?>"></p>
            <p><input type="submit" value="投稿"></p>
        </form>
        <p><a href="../index.php">一覧に戻る</a></p>
    </body>
</html>