<?php
    $jobs = array(
        'webデザイナー','webプログラマー','組み込みプログラマー','電子回路設計者'
    );
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>チェックボックスの送信</title>
    </head>

    <body>
        <h3>チェックボックスの送信</h3>

        <form action="conf.php" method="POST">
            <dl>
                <dt>希望職種</dt>
                <dd>
                    <?php foreach($jobs as $job) { ?>
                            <label>
                                <input type="checkbox" name="selects[]" value="<?php echo $job; ?>">
                                <?php echo $job ?> 
                            </label>
                    <?php } ?>
                </dd>
            </dl>
            <p><input type="submit" value="送信"></p>
        </form>

    </body>
</html>