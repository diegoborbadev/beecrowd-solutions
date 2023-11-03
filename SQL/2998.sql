SELECT
	sub.name,
	sub.investment,
	sub.month_of_payback,
	SUM(o.profit) - sub.investment AS RETURN
FROM
	(
	SELECT
		c.name,
		c.investment,
		CEILING((c.investment / AVG(o.profit))) AS month_of_payback
	FROM
		clients c
	INNER JOIN operations o ON
		o.client_id = c.id
	GROUP BY
		c.name,
		c.investment
	) AS sub
INNER JOIN clients c ON
	c.name = sub.name
INNER JOIN operations o ON
	o.client_id = c.id
WHERE
	o.month <= sub.month_of_payback
GROUP BY 
	sub.name,
	sub.investment,
	sub.month_of_payback
HAVING
	SUM(o.profit) - sub.investment >= 0
ORDER BY
	RETURN DESC;