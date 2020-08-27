SELECT name,email
FROM users
;

SELECT name,created,modified
FROM users
WHERE created < "2017-05-01" and modified >= "2017-05-01"
;

SELECT *
FROM users
WHERE modified between "2017-07-01" and "2017-08-01"
;

SELECT * 
FROM users
WHERE email like "%.___"
;

SELECT title,content,created
FROM posts
WHERE content like "%こんにちは%"
ORDER BY created DESC
LIMIT 3
;
