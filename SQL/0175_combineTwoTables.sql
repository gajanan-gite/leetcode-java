-- # Write your MySQL query statement below
select firstname,lastname,city,state
FROM Person as a
left join Address as b
on a.personId=b.personId;
