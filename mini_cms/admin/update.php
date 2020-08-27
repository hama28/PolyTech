<?php
    session_start();

    require_once('../inc/config.php');
    require_once('../inc/functions.php');

    check_token();

    # ファイル名の初期値
    # edit.phpからhiddenで受け取ったのを初期値に入れることで、画像が消えないようにする
    $file_name = $_POST['post_image'];

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

    if ( $_SERVER['REQUEST_METHOD'] !== 'POST') 
    {
        header('Location: index.php');
        exit();
    }

    try 
    {
        $dbh = new PDO(DSN, DB_USER, DB_PASSWORD);

        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $sql = 'UPDATE posts SET title=?, category_id=?, content=?, post_image=? WHERE id = ?';
        
        $stmt = $dbh->prepare($sql);
        
        $stmt->bindValue(1, $_POST['title'], PDO::PARAM_STR);
        $stmt->bindValue(2, (int)$_POST['category_id'], PDO::PARAM_INT);
        $stmt->bindValue(3, $_POST['content'], PDO::PARAM_STR);
        $stmt->bindValue(4, $file_name, PDO::PARAM_STR);
        $stmt->bindValue(5, (int)$_POST['id'], PDO::PARAM_INT);
        
        
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
        <title>記事の更新</title>
    </head>

    <body>
        <h1>記事の更新</h1>
        <p>記事を更新しました。</p>

        <p><a href="./">一覧に戻る</a></p>
    </body>
</html>