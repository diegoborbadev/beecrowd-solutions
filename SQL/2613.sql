SELECT
	m.id,
	m.name
FROM
	movies m
LEFT JOIN prices p ON
	p.id = m.id_prices
WHERE
	p.value < 2.00