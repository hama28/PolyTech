<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Cookieの利用</title>
    </head>

    <body>
        <h3>Cookieの利用</h3>

        <form action="receive.php" method="POST">
            <dl>
                <dt><label for="name">名前</label></dt>
                <dd><input type="text" name="name" id="name"></dd>
                <dt><label for="pass">パスワード</label></dt>
                <dd><input type="password" name="pass" id="pass"></dd>
            </dl>
            <label>
                <input type="checkbox" name="save" value="on">名前を保存する
            </label>

            <p><input type="submit" value="ログイン"></p>
        </form>
    </body>
</html>