# レコードの抽出
SELECT title,content
FROM posts
;

SELECT *
FROM posts
WHERE created >= "2017-05-01"
;

# 練習
SELECT title
FROM posts
WHERE user_id = 3
;

SELECT *
FROM posts
WHERE created < "2017-05-01" or created >= "2017-07-01"
;

SELECT *
FROM posts
WHERE (user_id = 3 or user_id = 4) and created >= "2017-07-01"
;

SELECT *
FROM posts
WHERE created between "2017-05-01" and "2017-06-01"
;

SELECT *
FROM posts
WHERE user_id in (2,4,5)
;

SELECT *
FROM posts
WHERE content like "%パスタ%"
;

SELECT *
FROM posts
ORDER BY created DESC
;

SELECT *
FROM posts
ORDER BY created DESC,id DESC
;

SELECT *
FROM posts
LIMIT 2,5
;
