<?php
    # XSS対策
    # 入力項目にコードを入力されると、コードを実行してしまうので、それを防ぐ
    function h($s){
        return htmlspecialchars($s, ENT_QUOTES, "UTF-8");
    }

    # CSRF対策 (クロスサイトリクエストフォージェリ)
    # 不正に用意されたフォームからの送信も登録してしまうので、それを防ぐ
    # トークンの生成
    function set_token() {
        if (!isset($_SESSION['token'])) {
            $_SESSION['token'] = bin2hex(openssl_random_pseudo_bytes(16));
        }
    }

    # トークンの確認
    function check_token() {
        if (empty($_POST['token']) || $_POST['token'] != $_SESSION['token']) {
            echo '不正な投稿(トークンが一致しません)';
            exit();
        }
    }
?>