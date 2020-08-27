# view の作成
# 書き方 --> create view (view名) as (viewで表示させる中身)
CREATE view view1 as
SELECT p.id, p.title, p.content, u.name, p.created
FROM new_posts as p 
LEFT JOIN users as u
ON p.user_id = u.id
ORDER BY p.created DESC
;

# view が作成できたか確認
show tables;

# view の実行と確認
SELECT * FROM view1;

# view の削除
drop view view1;
