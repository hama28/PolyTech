# データベースの操作
# データベースの作成
create database my_blog default character set utf8;

# データベース一覧を表示
show databases;

# 使用するデータベースを変更
# MariaDB [(none)] => MariaDB [my_blog]　←のように変更されればOK
use my_blog;

# データベースの削除
drop database my_blog;


# テーブルの操作
# テーブルの作成
create table posts (
    id int(11) unsigned auto_increment primary key,
    title varchar(255) not null,
    content longtext not null,
    created datetime
) engine=InnoDB default charset=utf8;

# テーブル一覧の表示
show tables;

# テーブル情報の表示
desc posts;

# テーブルの削除
drop table posts;


# 練習
create table users (
    id int(11) unsigned auto_increment primary key,
    name varchar(255) not null,
    email varchar(100) not null unique key,
    password varchar(255) not null
) engine=InnoDB default charset=utf8;
