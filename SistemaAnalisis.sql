CREATE DATABASE sistema_financiero;
USE sistema_financiero;
CREATE TABLE roles (
    id_rol INT AUTO_INCREMENT PRIMARY KEY,
    nombre_rol VARCHAR(30) NOT NULL UNIQUE
);

INSERT INTO roles (nombre_rol)
VALUES ('Administrador');
INSERT INTO roles (nombre_rol)
VALUES ('Analista');
INSERT INTO roles (nombre_rol)
VALUES ('Usuario');
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasena VARCHAR(100) NOT NULL,
    id_rol INT NOT NULL,
    FOREIGN KEY (id_rol)
    REFERENCES roles(id_rol)
);
INSERT INTO usuarios
(nombre, usuario, contrasena, id_rol)
VALUES('Administrador General','admin','1234',1);
INSERT INTO usuarios
(nombre, usuario, contrasena, id_rol)
VALUES ('Contador', 'analista', '1234', 2);
INSERT INTO usuarios(nombre, usuario, contrasena, id_rol)
VALUES('Empresa', 'usuario', '1234', 3);
CREATE TABLE registros_financieros (
id_registro INT AUTO_INCREMENT PRIMARY KEY,
anio INT NOT NULL,
efectivo DECIMAL(12,2),
cuentas_cobrar DECIMAL(12,2),
inventarios DECIMAL(12,2),
activo_fijo DECIMAL(12,2),
proveedores DECIMAL(12,2),
deuda_cp DECIMAL(12,2),
deuda_lp DECIMAL(12,2),
capital DECIMAL(12,2),
ventas DECIMAL(12,2),
costo_ventas DECIMAL(12,2),
gastos_operativos DECIMAL(12,2),
impuestos DECIMAL(12,2),
id_usuario INT,
FOREIGN KEY(id_usuario) REFERENCES usuarios(id_usuario)
);
