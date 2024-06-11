SELECT s.nombre, c.nombre, c.primerApellido, c.segundoApellido
FROM SUCURSAL AS s
INNER JOIN COLABORADOR AS c
ON s.idSucursal = c.FK_idSucursal;