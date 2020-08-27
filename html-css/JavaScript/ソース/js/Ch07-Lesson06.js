document.write('<h1>関数の仮引数にデフォルト値を設定と、実引数の数が違った場合の処理</h1>');

//苗字と名前を半角スペースで挟んで連結する
document.write('<h2>デフォルト値を持った引数3つの関数を定義して、第1引数+第3引数+第2引数と連結して表示する</h2>');

//関数「name(引数1 = '', 引数2 = '', 引数3 = '')」を定義する
function name(lastName = '', firstName = '', space = '')       //引数を3つ受け取ることができる関数を定義
{
    let fullName = lastName + space + firstName;
    return fullName;
}

//変数3つを宣言しておく
let lName = '山田';     //苗字
let fName = '太郎';     //名前
let sp = ' ';           //半角スペース

//関数「name(引数1, 引数2, 引数3)」を実引数3つで呼び出して表示する
let name1 = name(lName, fName, sp);
document.write('引数3つで関数「name(lastName, firstName, space)」を呼び出すと、「' + name1 + '」と実行される。<br>');

//関数「name(引数1, 引数2, 引数3)」を実引数2つで呼び出して表示する
let name2 = name(lName, fName);
document.write('引数2つで関数「name(lastName, firstName, space)」を呼び出すと、「' + name2 + '」と実行される。<br>');

//関数「name(引数1, 引数2, 引数3)」を実引数1つで呼び出して表示する
let name3 = name(lName);
document.write('引数1つで関数「name(lastName, firstName, space)」を呼び出すと、「' + name3 + '」と実行される。<br>');

//関数「name(引数1, 引数2, 引数3)」を実引数なしで呼び出して表示する
let name4 = name();
document.write('引数なしで関数「name(lastName, firstName, space)」を呼び出すと、「' + name4 + '」と実行される。<br>');

//関数「name(引数1, 引数2, 引数3)」を実引数「undefined, 引数1つ」で呼び出して表示する
let name5 = name(undefined, '花子');
document.write('引数「undefined, 引数1つ」で関数「name(lastName, firstName, space)」を呼び出すと、「' + name5 + '」と実行される。<br>');

document.write('<p>処理が終了しました!</p>');