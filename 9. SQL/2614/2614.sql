SELECT
	c.name,
	r.rentals_date
FROM
	rentals r
LEFT JOIN customers c ON
	c.id = r.id_customers
WHERE
	EXTRACT(MONTH
FROM
	r.rentals_date) = 9