SELECT
	prod.name,
	prov.name
FROM
	products prod
LEFT JOIN providers prov ON
	prov.id = prod.id_providers
WHERE
	prod.id_categories = 6