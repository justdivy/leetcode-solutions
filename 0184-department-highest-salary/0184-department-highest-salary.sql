Select
   d.name as Department,
   e.name as Employee,
   e.salary as Salary
From Employee e
Join Department d
    ON e.departmentId = d.id
Where (e.departmentId, e.salary) In (
    Select departmentId, MAX(salary)
    From Employee
    Group By departmentId
);