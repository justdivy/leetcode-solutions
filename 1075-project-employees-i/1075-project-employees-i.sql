Select 
     p.project_id,
     Round(avg(e.experience_years), 2) as average_years 
from Project as p
Join Employee as e
     on p.employee_id = e.employee_id
Group by p.project_id;