# テーブルのコピー
create table new_posts select * from posts;
select * from new_posts;
desc new_posts;
# ※制約はコピーできない

# なので、制約の設定をする
alter table new_posts add primary key(id);
alter table new_posts modify id int(11) unsigned auto_increment;
desc new_posts;


# 下記のやり方でもコピーできる
# テーブルの構造をコピー
create table new_posts like posts;
# レコードのコピー
insert into new_posts select * from posts;

