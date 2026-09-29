select p.product_name,
       s.year,
       s.price
from Sales AS s 
Join Product AS p
on s.product_id = p.product_id; 