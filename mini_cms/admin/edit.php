<?php
    session_start();

    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    set_token();

    if (empty($_GET['id'])){
        header('Location: index.php');
        exit();
    }

    try{
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        
        $sql = 'SELECT * FROM posts WHERE id = ?';

        $stmt = $dbh->prepare($sql);

        $stmt->bindValue(1, (int)$_GET['id'], PDO::PARAM_INT);
        
        $stmt->execute();

        $result = $stmt->fetch(PDO::FETCH_ASSOC);

        $sql = 'SELECT * FROM categories';

        $stmt = $dbh->query($sql);

        $categories = $stmt->fetchAll(PDO::FETCH_ASSOC);

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
        <title>編集</title>
    </head>

    <body>
        <h1>編集</h1>
        
        <form action="update.php" method="post">
            <dl>
                <dt><label for="title">記事のタイトル</label></dt>
                <dd>
                    <input type="text" id="title" name="title" value="<?php print($result['title']) ?>">
                </dd>
        
                <dt><label for="category_id">カテゴリーID</label></dt>
                <dd>
                    <select name="category_id" id="category_id">
                        <?php foreach($categories as $category) { ?>
                            <?php $selected = '';
                            if ($category['id'] == $result['category_id']) {
                                $selected = 'selected';
                            }
                            ?>
                            <option value="<?php print($category['id']) ?>" <?php print($selected) ?>>
                            <?php print($category['category_name']) ?>
                            </option>
                        <?php } ?>
                    </select>
                </dd>

                <dt><label for="content">記事の内容</label></dt>
                <dd>
                    <textarea name="content" id="content" cols="30" rows="10"><?php print($result['content']) ?></textarea>
                </dd>

                <dt><label for="post_image">画像</label></dt>
                <dd>
                    <?php if (!empty($result['post_image'])) { ?>
                        <figure>
                            <img src="../upload/<?php print($result['post_image']); ?>" width="240" alt="<?php print($result['title']); ?>" class="pic">
                        </figure>
                    <?php } ?>
                    <input type="file" id="post_image" name="post_image">
                </dd>
            </dl>

            <p><input type="hidden" name="id" value="<?php echo h($result['id']); ?>"></p>
            <p><input type="hidden" name="post_image" value="<?php echo h($result['post_image']); ?>"></p>
            <p><input type="hidden" name="token" value="<?php echo h($_SESSION['token']); ?>"></p>
            <p><input type="submit" value="編集完了"></p>
        </form>
        <p><a href="../index.php">一覧に戻る</a></p>
    </body>
</html>