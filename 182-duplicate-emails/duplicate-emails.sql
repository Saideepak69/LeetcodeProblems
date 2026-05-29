# Write your MySQL query statement below
SELECT p.email AS Email FROM 
Person p JOIN Person e on p.email = e.email
GROUP BY e.email
HAVING COUNT(e.id) > 1;