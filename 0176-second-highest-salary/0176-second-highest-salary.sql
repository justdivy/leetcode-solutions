Select max(salary) as SecondHighestSalary
From Employee
Where salary < (Select max(salary) from Employee);