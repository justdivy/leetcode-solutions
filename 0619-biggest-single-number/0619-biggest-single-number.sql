select max(num) as num
from MyNumbers
where num In (
    select num
    from MyNumbers
    Group by num
    Having count(*) = 1
);