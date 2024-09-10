SELECT
	p.name
FROM
	products p
LEFT JOIN providers pv ON
	pv.id = p.id_providers
WHERE 
	p.amount > 10
	AND p.amount < 20
	AND pv.name LIKE 'P%'