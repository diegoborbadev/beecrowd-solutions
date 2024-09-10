SELECT 
    c.id, 
    c.name
FROM 
    customers c
WHERE 
    NOT EXISTS (
        SELECT 
            id_customers 
		FROM 
            locations l
		WHERE 
            c.id = l.id_customers
    )