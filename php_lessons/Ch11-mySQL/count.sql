SELECT count(*)
FROM posts
;

# グループ化してカウント
SELECT user_id,count(*)
FROM posts
GROUP BY user_id
;

# 出力名の変更
SELECT user_id,count(*) as total
FROM posts
GROUP BY user_id
;

# 変更して条件式
SELECT user_id,count(*) as total
FROM posts
GROUP BY user_id
HAVING total >= 2
;

# 文字数のカウント
SELECT content,char_length(content) as len
FROM posts
;

# 文字列の一部を抜粋(↓は、1文字目から10文字目)
SELECT title,substring(content,1,10) as content
FROM posts
;

