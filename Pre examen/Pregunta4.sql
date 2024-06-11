SELECT s.nombre, p.nombreProducto, st.stock 
FROM SUCURSAL AS s
INNER JOIN stock as st
ON s.idSucursal = st.idSucursal
INNER JOIN PRODUCTO AS p
ON p.idProducto = st.idProducto
WHERE s.nombre = "Freire";