SELECT
	p.name,
	pv.name,
	c.name
FROM
	categories c
INNER JOIN products p ON
	p.id_categories = c.id
INNER JOIN providers pv ON
	p.id_providers = pv.id
WHERE
	c.name = 'Imported'
	AND pv.name = 'Sansul SA'