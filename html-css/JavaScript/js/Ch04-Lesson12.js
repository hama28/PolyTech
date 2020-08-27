document.write("<h1>switch文による条件分岐</h1>");

let num = Math.round(Math.random() * 12);
document.write("乱数で発生した値は「" + num + "」です。<br>");

switch(num) {
    case 1:
        document.write("1月生まれの人がラッキー");
        break;
    case 2:
        document.write("2月生まれの人がラッキー");
        break;
    case 3:
        document.write("3月生まれの人がラッキー");
        break;
    case 4:
        document.write("4月生まれの人がラッキー");
        break;
    case 5:
        document.write("5月生まれの人がラッキー");
        break;
    case 6:
        document.write("6月生まれの人がラッキー");
        break;
    case 7:
        document.write("7月生まれの人がラッキー");
        break;
    case 8:
        document.write("8月生まれの人がラッキー");
        break;
    case 9:
        document.write("9月生まれの人がラッキー");
        break;
    case 10:
        document.write("10月生まれの人がラッキー");
        break;
    case 11:
        document.write("11月生まれの人がラッキー");
        break;
    case 12:
        document.write("12月生まれの人がラッキー");
        break;
    default:
        document.write("今月生まれの人がラッキー");
        break;
}

document.write("<p>処理が終了しました！</p>");
