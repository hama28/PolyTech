document.write('<h1>do-while文での繰り返し</h1>');

let i = 1;

document.write('<h2>do-while文での繰り返し</h2>');  //「do-while文での繰り返し」と表示する

do
{
    document.write(i + '回目です。<br>');   //「「i」回目です。」と表示
    i++;
}while(i <= 0);

document.write('<p>処理が終了しました!</p>');