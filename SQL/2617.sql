SELECT
	p.name,
	pv.name
FROM
	providers pv
RIGHT JOIN products p ON
	p.id_providers = pv.id
WHERE pv.name = 'Ajax SA'