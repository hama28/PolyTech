SELECT p.id, p.title, p.content, p.created, u.name
FROM new_posts as p 
LEFT JOIN users as u
ON p.user_id = u.id
ORDER BY p.created DESC
;
