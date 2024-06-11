SELECT c.nombre, c.primerApellido, c.segundoApellido, s.nombre
FROM SUCURSAL AS s
INNER JOIN VENTA AS v
ON v.FK_idSucursal = s.idSucursal
INNER JOIN CLIENTE AS c
ON c.rutCliente = v.FK_rutCliente
WHERE s.idSucursal = 1;