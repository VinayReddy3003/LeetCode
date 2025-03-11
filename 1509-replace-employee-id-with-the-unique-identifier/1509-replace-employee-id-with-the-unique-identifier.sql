# Write your MySQL query statement below
select empU.unique_id,Emp.name from Employees Emp left join EmployeeUNI empU on Emp.id = empU.id;