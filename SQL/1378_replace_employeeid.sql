# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id,Employees.name
FROM Employees
LEFT JOIN EmployeeUNI ON EMployees.id=EmployeeUNI.id;

-- Rule to remember
-- INNER JOIN → "Only common records."
-- LEFT JOIN → "Keep everything from the left table, fill missing matches with NULL."
