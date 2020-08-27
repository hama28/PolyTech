document.write('<h1>今日の運勢 (if文を使用して表示してみましょう)</h1>');

let num = Math.round(Math.random() * 100);

if(num >= 70)
{
    document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
    document.write('<p>今日の運勢は「大吉！」です。</p>');
    document.write('<p>素敵な1日を！</p>');
}
else if(num >= 50)
{
    document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
    document.write('<p>今日の運勢は「中吉☆」です。</p>');
    document.write('<p>素敵な1日を！</p>');
}
else if(num >= 20)
{
    document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
    document.write('<p>今日の運勢は「小吉〇」です。</p>');
    document.write('<p>素敵な1日を！</p>');
}
else if(num >= 5)
{
    document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
    document.write('<p>今日の運勢は「残念(T_T)」です。</p>');
    document.write('<p>素敵な1日を！</p>');
}
else
{
    document.write('<p>乱数で発生した値は「' + num + '」です。</p>');
    document.write('<p>今日はありえないことが起きるかもしれません。</p>');
    document.write('<p>素敵な1日を！</p>');
}