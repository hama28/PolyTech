create database mini_cms_app default character set utf8;

show databases;

use mini_cms_app

create table posts (
    id int(11) unsigned auto_increment primary key,
    title varchar(60) not null,
    content longtext not null,
    category_id int(11) unsigned,
    created datetime,
    modified timestamp
) engine=InnoDB default charset=utf8;

create table categories (
    id int(11) unsigned auto_increment primary key,
    category_name varchar(60) not null
) engine=InnoDB default charset=utf8;

show tables;

INSERT INTO posts (title, content, category_id, created)
VALUES (
    "Webサイトを公開しました。",
    "本日、Webサイトを公開しました。お楽しみ下さい。",
    1,
    "2020/04/01 10:00"
),(
    "春の握手会について",
    "4月21日（土）、22日（日）の2日間、握手会を開催致します。",
    2,
    "2020/04/16 10:00"
),(
    "ゴールデンウィーク休暇について",
    "4月28日（土）~ 5月6日（日）までの9日間は、休みを頂戴いたします。",
    1,
    "2020/04/20 10:00"
);

select * from posts;

INSERT INTO categories (category_name)
VALUES (
    "お知らせ"
),(
    "イベント情報"
),(
    "活動報告"
);

select * from categories;
