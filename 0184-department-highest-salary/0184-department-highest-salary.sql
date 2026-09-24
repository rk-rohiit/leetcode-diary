# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary
from employee e
inner join department d
on e.departmentId = d.id
where (e.departmentId,e.salary) in 
(select departmentId,max(salary)
from employee
group by departmentId
);

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna