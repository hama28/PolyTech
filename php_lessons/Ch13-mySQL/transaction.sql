## 用語説明
# コミット --> 処理を確定させる
# ロールバック --> 処理を取り消す
# 通常のSQLはダイレクトに処理を実行しているので、取り消したりできない

# トランザクションの開始
begin;

# 出金と入金の処理
update account_a set balance = 50000 where id = 1;
update account_b set balance = 125000 where id = 1;

select * from account_a;
select * from account_b;

# 一連の処理を取り消す
rollback;

# 一連の処理を確定させる
commit;
