Select e1.name as Employee
From Employee e1
Inner Join Employee e2
      On e1.managerId = e2.id
Where e1.salary > e2.salary;