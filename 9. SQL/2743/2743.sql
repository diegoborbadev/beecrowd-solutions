SELECT 
    p.name, 
    char_length(p.name) AS length
FROM 
    people p
ORDER BY length DESC