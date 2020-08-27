<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>メールの送信</title>
    </head>

    <body>
        <h1>メールの送信</h1>

        <form action="receive.php" method="POST">
            <dl>
                <dt><label for="mail">送信先</label></dt>
                <dd><input type="text" name="mail" id="mail"></dd>
            </dl>

            <p><input type="submit" value="送信"></p>
        </form>
    </body>
</html>