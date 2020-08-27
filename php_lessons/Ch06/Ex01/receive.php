<?php
    mb_language('ja');
    mb_internal_encoding('UTF-8');

    if($_POST['mail'] == '') {
        header('Location: ./');
        exit();
    }

    $to = $_POST['mail'];
    $subject = "PHPからのメール送信テスト";
    $message = "これはPHPから自動送信されたメールです。";
    $from = mb_encode_mimeheader('ダミー').'<noreplay@dummy.com>';

    $result = mb_send_mail($to,$subject,$message,'from'.$from);
    if($result) {
        $msg = "送信成功";
    } else {
        $msg ="送信失敗";
    }
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>メールの送信</title>
    </head>

    <body>
        <h1>メールの送信</h1>

        <p><?php echo htmlspecialchars($msg,ENT_QUOTES,"UTF-8"); ?></p>
        
    </body>
</html>