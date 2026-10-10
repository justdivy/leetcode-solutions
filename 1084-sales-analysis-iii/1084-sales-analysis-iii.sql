select p.product_name, p.product_id
from Product As p
Join Sales as s
on p.product_id = s.product_id
Group by p.product_id, p.product_name
Having Min(s.sale_date) >= '2019-01-01'
    And Max(s.sale_date) <= '2019-03-31';