<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>独自関数</title>
    </head>

    <body>
        <h2>独自関数</h2>

        <?php
            function h($s) {
                return htmlspecialchars($s, ENT_QUOTES, 'UTF-8');
            }

            echo h("<button>button</button>");
            echo "<button>button</button>";
        ?>

    </body>
</html>