select
e.name,
b.bonus
From Employee AS e
Left Join Bonus As b
On e.empId = b.empId
where b.bonus < 1000 or b.bonus is Null;