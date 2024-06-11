SELECT s.nombre AS SUCURSAL, c.nombre AS nombre, 
c.primerApellido AS primerApellido, c.segundoApellido AS segundoApellido
FROM SUCURSAL AS s
INNER JOIN COLABORADOR AS c
ON s.idSucursal = c.FK_idSucursal
WHERE c.rol= 1;