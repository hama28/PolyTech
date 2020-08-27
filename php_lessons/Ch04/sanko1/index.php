<?php 
date_default_timezone_set("Asia/Tokyo");
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>date関数による日付取得</title>
    </head>

    <body>
        <h3>date関数による日付取得</h3>

        <p>現在は、
        <?php 
            echo date('Y年 m月 d日 H:i:s');
        ?>
        です。</p>

        <?php 
            echo date_default_timezone_get();
        ?>

    </body>
</html>