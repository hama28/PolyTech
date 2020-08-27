<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>チェックボックスの受信</title>
    </head>

    <body>
        <h3>チェックボックスの受信</h3>
        <?php if (isset($_POST["selects"])): ?>
            <ul>
                <?php foreach($_POST["selects"] as $select): ?>
                    <li>
                        <?php echo htmlspecialchars($select, ENT_QUOTES, "UTF-8"); ?>
                    </li>
                <?php endforeach; ?>
            </ul>
            <p>
                <?php echo count($_POST["selects"]). "個が選択されました" ?>
            </p>
        <?php else: ?>
            <p>何も選択されませんでした</p>
        <?php endif; ?>
        
        <p><a href="./">入力フォームに戻る</a></p>
        <br>
        
        <p>↓に配列の中身を表示</p>
        <pre><?PHP print_r($_POST); ?></pre>

    </body>
</html>