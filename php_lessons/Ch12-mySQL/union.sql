# union 重複は削除
select * from posts union select * from new_posts;

# union all 重複も含める
select * from posts union all select * from new_posts;
