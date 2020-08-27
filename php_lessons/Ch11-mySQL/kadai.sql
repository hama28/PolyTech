# 練習1
SELECT count(*) as total
FROM users
;

# 練習2
SELECT name,password,char_length(password) as length
FROM users
HAVING length <= 8
;

# 練習3
SELECT AVG(char_length(email)) as email_length
FROM users
;

# 練習4
SELECT name,email,char_length(email) as length
FROM users
HAVING length >= (
    SELECT AVG(char_length(email))
    FROM users
    )
;
