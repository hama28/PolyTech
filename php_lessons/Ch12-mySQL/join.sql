# テーブルの内部結合
SELECT posts.id, posts.title, posts.content, posts.user_id, users.name
FROM posts
JOIN users
ON posts.user_id = users.id
;

SELECT posts.id, posts.title, posts.content, posts.user_id, users.name
FROM posts
JOIN users
ON posts.user_id = users.id
ORDER BY posts.id DESC
;

# 練習
SELECT new_posts.id, new_posts.title, new_posts.content, new_posts.created, users.name
FROM new_posts
JOIN users
ON new_posts.user_id = users.id
ORDER BY new_posts.id DESC
;


# テーブルの外部結合
SELECT new_posts.id, new_posts.title, new_posts.content, new_posts.created, users.name
FROM new_posts
LEFT JOIN users
ON new_posts.user_id = users.id
ORDER BY new_posts.created DESC
;

# LEFT --> FROM 全レコードを表示するテーブル名 LEFT JOIN 結合するテーブル名
# RIGHT --> FROM 結合するテーブル名 RIGHT JOIN 全レコードを表示するテーブル名
