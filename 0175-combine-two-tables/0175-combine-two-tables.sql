select
p.firstName,
p.lastName,
a.city,
a.state
From Person AS p
Left Join Address AS a
ON p.personId = a.personId;