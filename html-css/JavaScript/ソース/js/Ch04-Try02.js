document.write('<h1>今日の運勢 (SWITCH文を使用して表示してみましょう)</h1>');

let num = Math.round(Math.random() * 4);

switch(num)
{
    case 0:
        document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
        document.write('<p>今日の運勢は「大吉！」です。</p>');
        document.write('<p>素敵な1日を！</p>');
        break;

    case 1:
        document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
        document.write('<p>今日の運勢は「中吉☆」です。</p>');
        document.write('<p>素敵な1日を！</p>');
        break;
    
    case 2:
        document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
        document.write('<p>今日の運勢は「小吉〇」です。</p>');
        document.write('<p>素敵な1日を！</p>');
        break;
    
    case 3:
        document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
        document.write('<p>今日の運勢は「残念(T_T)」です。</p>');
        document.write('<p>素敵な1日を！</p>');
        break;

    case 4:
        document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
        document.write('<p>今日はありえないことが起こるかも。</p>');
        document.write('<p>素敵な1日を！</p>');
        break;
}