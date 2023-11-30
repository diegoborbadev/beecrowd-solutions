SELECT 
    e.cpf, 
    e.enome, 
    d.dnome 
FROM 
    empregados e,
    departamentos d
WHERE 
    e.dnumero = d.dnumero 
    AND e.cpf NOT IN (
        SELECT 
            t.cpf_emp
        FROM 
            trabalha t
    )
ORDER BY e.cpf;