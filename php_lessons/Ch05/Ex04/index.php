<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Sessionの利用</title>
    </head>

    <body>
        <h1>Sessionの利用</h1>

        <form action="receive.php" method="POST">
            <dl>
                <dt><label for="name">ユーザー名</label></dt>
                <dd><input type="text" name="name" id="name"></dd>
                <dt><label for="pass">パスワード</label></dt>
                <dd><input type="password" name="pass" id="pass"></dd>
            </dl>

            <p><input type="submit" value="ログイン"></p>
        </form>
    </body>
</html>