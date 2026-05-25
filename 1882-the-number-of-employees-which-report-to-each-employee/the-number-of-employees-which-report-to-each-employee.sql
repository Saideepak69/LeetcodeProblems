# Write your MySQL query statement below
SELECT e.employee_id, e.name, COUNT(m.reports_to) AS reports_count, ROUND(SUM(m.age) / COUNT(m.age)) AS average_age
FROM Employees e JOIN Employees m on e.employee_id = m.reports_to
GROUP BY m.reports_to
ORDER BY e.employee_id ASC;