document.write('<h1>switch文による条件分岐</h1>');

let num = Math.round(Math.random() * 12);    //変数「num」を「乱数(最大12)」で初期化する
document.write('乱数で発生した値は「' + num + '」です。<br>');  //乱数の値を表示する

document.write('<h2>あなたのラッキーパーソンの生まれた季節は？</h2>');

switch(num)
{
    case 12:
    case 1:
    case 2:
        document.write('冬生まれの人がラッキー！');
        break;

    case 3:
    case 4:
    case 5:
        document.write('春生まれの人がラッキー！');
        break;
    
    case 6:
    case 7:
    case 8:
        document.write('夏生まれの人がラッキー！');
        break;
    
    case 9:
    case 10:
    case 11:
        document.write('秋生まれの人がラッキー！');
        break;

    default:
        document.write('今の季節に生まれたラッキー！！');
        break;
}

document.write('<p>探してみてね！</p>');