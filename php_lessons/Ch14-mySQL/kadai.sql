#データベース
#sales_management

#テーブル
#detail
#    id
#    sales_id
#    product_id
#    quanity
#sales
#    id
#    order_date
#    customer
#product
#    id
#    name
#    price
#customer
#    id
#    name
#    pref


create database sales_management default character set utf8;

create table detail (
    id int(11) unsigned auto_increment primary key,
    sales_id int(6) unsigned zerofill not null,
    product_id int(11) unsigned not null,
    quanity int(11) unsigned not null
) engine=InnoDB default charset=utf8;

create table sales (
    id int(6) unsigned zerofill auto_increment primary key,
    order_date date not null,
    customer_id int(11) unsigned not null
) engine=InnoDB default charset=utf8;

create table product (
    id int(11) unsigned auto_increment primary key,
    name varchar(255) not null,
    price int(11) unsigned not null
) engine=InnoDB default charset=utf8;

create table customer (
    id int(11) unsigned auto_increment primary key,
    name varchar(255) not null,
    pref varchar(255) not null
) engine=InnoDB default charset=utf8;


INSERT INTO detail (sales_id, product_id, quanity)
VALUES (
    1,1,2
),(
    1,2,1
),(
    1,3,5
),(
    2,4,2
),(
    2,5,1
),(
    3,1,18
),(
    3,5,1
),(
    3,6,8
);

select * from detail;

INSERT INTO sales (order_date, customer_id)
VALUES (
    "2020-07-23",1
),(
    "2020-07-25",2
),(
    "2020-07-07",3
);

INSERT INTO product (name, price)
VALUES (
    "えんぴつ",50
),(
    "消しゴム",100
),(
    "のり",60
),(
    "ものさし",80
),(
    "ノート",100
),(
    "文鎮",100
);

INSERT INTO customer (name, pref)
VALUES (
    "秋元","東京都"
),(
    "前田","東京都"
),(
    "柴田","大阪府"
);


SELECT *
FROM product
;

SELECT *
FROM customer
WHERE pref = "東京都"
;

SELECT count(*) as total
FROM sales
;

SELECT sales_id, SUM(quanity) as total
FROM detail
GROUP BY sales_id
;
