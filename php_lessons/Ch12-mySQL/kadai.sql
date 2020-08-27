# 課題1
SELECT posts.title, users.name
FROM posts
LEFT JOIN users
ON posts.user_id = users.id
;

# 課題2
SELECT users.name, count(posts.user_id) as total 
FROM posts
LEFT JOIN users
ON posts.user_id = users.id
GROUP BY posts.user_id
;

# 課題3
SELECT posts.id, posts.title, posts.content, users.name 
FROM posts
LEFT JOIN users
ON posts.user_id = users.id
WHERE posts.user_id in (3,4)
ORDER BY posts.created DESC
LIMIT 5
;

# 課題4
create view view2 as
SELECT posts.*, users.name, users.email 
FROM posts
LEFT JOIN users
ON posts.user_id = users.id
;

# 課題5
SELECT *
FROM view2
ORDER BY created DESC
;

# 課題6
drop view view2;
