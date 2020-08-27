# 以下の２つをまとめて実行する
SELECT AVG(char_length(content))
FROM posts
;
SELECT content,char_length(content) as len
FROM posts
HAVING len <= 2
;

# まとめて実行(サブクエリ)
SELECT content,char_length(content) as len
FROM posts
HAVING len <= (
    SELECT AVG(char_length(content))
    FROM posts
    )
;
