document.write('<h1>配列利用</h1>');

document.write('<h2>変数を5つ宣言して代入・表示する</h2>');

//num1～num5を宣言して代入
let num1 = 10;
let num2 = 20;
let num3 = 30;
let num4 = 40;
let num5 = 50;

//num1～num5の内容を表示
document.write('「num1」は' + num1 + 'です。<br>');
document.write('「num2」は' + num2 + 'です。<br>');
document.write('「num3」は' + num3 + 'です。<br>');
document.write('「num4」は' + num4 + 'です。<br>');
document.write('「num5」は' + num5 + 'です。<br>');
document.write('<h2>配列(複数の値を1まとまりで扱える変数)を利用して値を初期化・表示する</h2>');

//配列「nums」を宣言して初期化
let nums = [];

nums[0] = 10;
nums[1] = 20;
nums[2] = 30;
nums[3] = 40;
nums[4] = 50;

//let nums = [10, 20, 30, 40, 50];  //宣言と初期化を合わせて行う

//配列「nums」の内容を表示
document.write('配列「nums」の１つ目の値は' + nums[0] + 'です。<br>');
document.write('配列「nums」の２つ目の値は' + nums[1] + 'です。<br>');
document.write('配列「nums」の３つ目の値は' + nums[2] + 'です。<br>');
document.write('配列「nums」の４つ目の値は' + nums[3] + 'です。<br>');
document.write('配列「nums」の５つ目の値は' + nums[4] + 'です。<br>');

document.write('<p>処理が終了しました！</p>');