SELECT
	a.id,
	a.password,
	MD5(a.password) AS MD5
FROM
	account a