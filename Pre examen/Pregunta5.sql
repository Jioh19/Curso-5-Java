SELECT COUNT(v.idVenta) , c.nombre, c.primerApellido, c.segundoApellido, s.nombre
FROM CLIENTE c
INNER JOIN VENTA v
ON c.rutCliente = v.FK_rutCliente
INNER JOIN SUCURSAL s
ON v.FK_idSucursal = s.idSucursal
GROUP BY c.rutCliente, s.nombre
ORDER BY COUNT(v.idVenta) DESC;