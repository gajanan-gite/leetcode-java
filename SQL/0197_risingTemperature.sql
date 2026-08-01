# Write your MySQL query statement below
select a.id 
from Weather as a
join Weather as b
on a.recordDate=DATE_ADD(b.recordDate, INTERVAL 1 day)
where   a.temperature> b.temperature;

-- SELECT a.id
-- FROM Weather a
-- JOIN Weather b
--     ON a.recordDate = DATE_ADD(b.recordDate, INTERVAL 1 DAY)
-- WHERE a.temperature > b.temperature;
