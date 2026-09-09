select
v.customer_id,
count(v.visit_id) AS count_no_trans
From Visits AS v
Left Join Transactions AS t
ON v.visit_id = t.visit_id
where t.visit_id IS NULL
Group By v.customer_id
Order By count_no_trans DESC;
