SELECT
	c.name
FROM
	legal_person l
LEFT JOIN customers c ON
	l.id_customers = c.id