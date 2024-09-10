SELECT 
    l.name, 
    cast(EXTRACT(DAY FROM l.payday) AS INT) as day
FROM 
    loan l