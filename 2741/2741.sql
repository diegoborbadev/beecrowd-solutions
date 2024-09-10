SELECT 
    concat('Approved: ', s.name) as name, 
    s.grade
FROM 
    students s
WHERE 
    s.grade >= 7
ORDER BY s.grade DESC