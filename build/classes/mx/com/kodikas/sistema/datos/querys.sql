--INSERTANDO CATEGORIAS
/*
INSERT INTO public."cat_categorias"(nom_categoria_prod, desc_categoria_prod) VALUES('bebidas', 'todo tipo de bebidas');
INSERT INTO CAT_CATEGORIAS(nom_categoria_prod, desc_categoria_prod) VALUES('frituras', 'todo tipo de frituras');
INSERT INTO CAT_CATEGORIAS(nom_categoria_prod, desc_categoria_prod) VALUES('pan', 'todo tipo de pan');
*/
select * from cat_categorias;

--INSERTANDO PROVEEDORES
/*
INSERT INTO cat_proveedores(nom_proveedor, dir_proveedor, telefono_proveedor, email_proveedor, contacto_proveedor) VALUES('Distribuidor de frituras', 'Domicilio SN', '555-55-555-55', 'frituras@gmail.com', 'Juan Flores');
INSERT INTO cat_proveedores(nom_proveedor, dir_proveedor, telefono_proveedor, email_proveedor, contacto_proveedor) VALUES('Distribuidor de bebidas', 'Domicilio SN', '555-55-555-55', 'bebidas@gmail.com', 'Horacio Cervantes');
INSERT INTO cat_proveedores(nom_proveedor, dir_proveedor, telefono_proveedor, email_proveedor, contacto_proveedor) VALUES('Distribuidor de pan', 'Domicilio SN', '555-55-555-55', 'pan@gmail.com', 'Marisela Fragoso');
*/
select * from cat_proveedores; 

--Insertando Productos
/*INSERT INTO CAT_PRODUCTOS(id_prod, nombre_prod, desc_prod, stock_prod, unidad_prod, precio_compra_prod, precio_venta_prod, existencias_prod, id_categoria_prod, id_proveedor) VALUES('123', 'Coca-Cola', 'Refresco de Cola', 50, 'pieza', 8.50, 10.0, 120, 1, 5);
INSERT INTO CAT_PRODUCTOS(id_prod, nombre_prod, desc_prod, stock_prod, unidad_prod, precio_compra_prod, precio_venta_prod, existencias_prod, id_categoria_prod, id_proveedor) VALUES('456', 'Pan blanco', 'Pan blanco en rebanadas', 10, 'pieza', 30.50, 42.0, 30, 3, 6);
INSERT INTO CAT_PRODUCTOS(id_prod, nombre_prod, desc_prod, stock_prod, unidad_prod, precio_compra_prod, precio_venta_prod, existencias_prod, id_categoria_prod, id_proveedor) VALUES('789', 'Cacahuates', 'Bolsa de cacahuates 50gr', 20, 'pieza', 5.50, 7.00, 30, 2, 4);*/


select * from cat_productos;

--DELETE FROM [table_name] WHERE [condition]
DELETE FROM CAT_PRODUCTOS WHERE id_prod = '123';
INSERT INTO CAT_PRODUCTOS(id_prod, nombre_prod, desc_prod, stock_prod, unidad_prod, precio_compra_prod, precio_venta_prod, existencias_prod, id_categoria_prod, id_proveedor) VALUES('123', 'Coca-Cola', 'Refresco de Cola', 50, 'pieza', 8.50, 10.0, 120, 1, 5);

--UPDATE [table_name] SET [column_name] = 'Value column' WHERE [condition] 
UPDATE CAT_PRODUCTOS SET existencias_prod = 60 WHERE id_prod= '123';

INSERT INTO VENTAS(monto_venta, fecha_venta) VALUES(0.0, '2016-10-19');
--delete from ventas where id_venta=1
select * from ventas;

INSERT INTO DETALLE_VENTA(id_venta, id_prod, cantidad_vendida) VALUES(2, '123', 1);
INSERT INTO DETALLE_VENTA(id_venta, id_prod, cantidad_vendida) VALUES(2, '456', 1);
INSERT INTO DETALLE_VENTA(id_venta, id_prod, cantidad_vendida) VALUES(2, '789', 1);

select * from detalle_venta;
