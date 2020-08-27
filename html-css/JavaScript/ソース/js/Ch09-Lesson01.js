document.write('<h1>日付と時刻のオブジェクトの利用</h1>');

//現在の日時を取得する
let today = new Date();
document.write('<h2>今日の日付をそのまま表示する</h2>');
document.write('<p>現在の日時は、' + today + 'です。</p>');

//todayオブジェクトから月を取り出す(月の取得は0から始まるので1足しておく)
let month = today.getMonth() + 1;
//todayオブジェクトから日を取り出す
let day = today.getDate();

document.write('<h2>現在の日付から取り出した「月」と「日」を連結して表示する</h2>');
document.write('<p>今日は、' + month + '月' + day + '日です。</p>');

//todayを現在地の表示形式に合った「toLocalDateString()」で文字列に整えて表示
document.write('<h2>今日の日付を現在地の表示形式に合った「toLocalDateString()」で文字列に整えて表示する</h2>');
document.write('<p>日本的に表記すると' + today.toLocaleDateString() + 'です。</p>');

//12ヶ月前を取得する「setMonth()」で取得
document.write('<h2>今日の日付から12ヶ月前を取得する「setMonth()」で表示する</h2>');
let monthAgo = today.setMonth(month - 1 - 12);
document.write('<p>◆今から12ヶ月前は' + today.toLocaleDateString(monthAgo) + 'です。</p>')

document.write('<p>処理が終了しました!</p>');