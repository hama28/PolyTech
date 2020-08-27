<?php
    session_start();

    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    # 投稿ボタンが押されたかチェック
    if ( $_SERVER['REQUEST_METHOD'] != 'POST') {
        header('Location: post.php');
        exit();
    }

    # 正規の投稿フォームから来たかチェック
    check_token();

    # ファイル名の初期値
    $file_name = '';

    # 添付ファイルのチェックと、エラーのチェック
    if (isset($_FILES['post_image']) && $_FILES['post_image']['error'] == 0) {
        # ファイルタイプの取得
        $file_type = exif_imagetype($_FILES['post_image']['tmp_name']);

        # 画像ファイル形式のチェック
        if ($file_type != IMAGETYPE_GIF && $file_type != IMAGETYPE_JPEG && $file_type != IMAGETYPE_PNG) {
            # 指定形式以外ならエラー文を出力し、プログラム終了(これ以降の処理をしない)
            echo '画像は「gif」「jpeg」「png」形式で指定して下さい。';
            exit();
        }

        # 画像のアップロード先の指定
        $file_dir = '../upload/';

        # ファイル名を生成（ファイル名の前に現在の日時を追加）
        $file_name = date('YmdHis') .'_'. $_FILES['post_image']['name'];

        # ファイルを一時フォルダから移動
        move_uploaded_file($_FILES['post_image']['tmp_name'], $file_dir.$file_name);
        # 関数説明 move_uploaded_file(一時ファイル,移動先)
    }

    try {
        $dbh = new PDO(DSN,DB_USER,DB_PASSWORD);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $sql = 'INSERT INTO posts (title,category_id,content,post_image,created) VALUES (?,?,?,?,now())';
        
        $stmt = $dbh->prepare($sql);
        
        $stmt->bindValue(1, $_POST['title'], PDO::PARAM_STR);
        $stmt->bindValue(2, (int)$_POST['category_id'], PDO::PARAM_INT);
        $stmt->bindValue(3, $_POST['content'], PDO::PARAM_STR);
        $stmt->bindValue(4, $file_name, PDO::PARAM_STR);
        
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
        <title>投稿完了</title>
    </head>

    <body>
        <h1>投稿完了</h1>
        <p>新着情報を登録しました。</p>
        <p><a href="../index.php">投稿一覧に戻る</a></p>
    </body>
</html>