# Write your MySQL query statement below

-- SELECT Product.product_name,Sales.year,Sales.price
-- FROM Sales
-- RIGHT JOIN Product ON Sales.product_id=Product.product_id
-- WHERE Sales.year OR Sales.price IS NOT NULL;

SELECT p.product_name,
       s.year,
       s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;

-- Whenever you solve a SQL problem, ask yourself:

-- Do I need all rows from one table?
-- Yes → LEFT JOIN
-- No → INNER JOIN
-- Is the WHERE clause actually required?
-- If the problem doesn't ask for filtering, don't add one.
