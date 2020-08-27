INSERT INTO posts VALUES (0, 2, 'test', 'テストだよ', '2017/04/07 10:00:00', '2017/04/07 10:00:00');

select * from posts;


INSERT INTO posts (
    user_id,
    title,
    content,
    created,
    modified
)
VALUES (
    2,
    'first content',
    'Hello World!',
    '2017/04/07 10:00:00',
    '2017/04/07 10:00:00'
);
