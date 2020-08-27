<?php
    $cost1 = $_POST['cost1'];
    $cost2 = $_POST['cost2'];
    $cost3 = $_POST['cost3'];
    
    $total1 = $cost1 * $cost2;
    $total2 = $cost1 * $cost3 * $cost2;
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>金額(税込み)計算</title>
    </head>

    <body>
        <h3>金額(税込み)計算</h3>
        <p>金額(税込み)は「
            <?php 
                echo htmlspecialchars((int)$total1, ENT_QUOTES, 'UTF-8')
            ?>
            円」です。
        </p>

        <h3>個数計算</h3>
        <p>
            <?php
                echo $cost1;
            ?>
        円のものを
            <?php
                echo $cost3;
            ?>
        個購入するには、「
            <?php 
                echo htmlspecialchars((int)$total2, ENT_QUOTES, 'UTF-8')
            ?>
            円(税込み)」が必要です。
        </p>

    </body>
</html>