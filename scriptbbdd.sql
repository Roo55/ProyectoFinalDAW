DROP DATABASE IF EXISTS Gym;
CREATE DATABASE Gym;

USE Gym;

CREATE TABLE Clientes (
id_cliente INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
apellido VARCHAR(50) NOT NULL,
fecha_nacimiento VARCHAR(25) NOT NULL,
direccion VARCHAR(100) NOT NULL,
numero_telefono VARCHAR(15) NOT NULL,
email VARCHAR(255) NOT NULL,
password VARCHAR(200) NOT NULL,
username VARCHAR(255) NOT NULL
);

CREATE TABLE roles (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL
);

CREATE TABLE user_roles (
user_id INT NOT NULL,
role_id INT NOT NULL,
PRIMARY KEY (user_id,role_id)
);

CREATE TABLE Suscripciones (
id_suscripcion INT AUTO_INCREMENT PRIMARY KEY,
id_cliente INT NOT NULL,
tipo_suscripcion VARCHAR(50) NOT NULL,
precio DECIMAL(10,2) NOT NULL,
duracion VARCHAR(30) NOT NULL,
FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente)
);

CREATE TABLE Compras (
id_compras INT AUTO_INCREMENT PRIMARY KEY,
id_cliente INT NOT NULL,
id_suscripcion INT NOT NULL,
fecha_compra DATE NOT NULL,
FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente),
FOREIGN KEY (id_suscripcion) REFERENCES Suscripciones(id_suscripcion)
);

-- Generar datos para probar(clientes)
-- Insertar datos en la tabla clientes
/*
INSERT INTO Clientes (nombre, apellido, fecha_nacimiento, direccion, numero_telefono, email, password, username)
VALUES
('Sofía', 'García', '1985-07-12', 'Calle 123', '555-1234', 'sofia.garcia@example.com', '123456', 'sofiagarcia'),
('Pedro', 'López', '1990-03-22', 'Avenida 456', '555-5678', 'pedro.lopez@example.com', 'password', 'pedrol'),
('Ana', 'Martínez', '1988-11-05', 'Calle 789', '555-9012', 'ana.martinez@example.com', 'abc123', 'anamartinez');
*/
-- Generar datos para probar(roles)
-- Insertar datos en la tabla roles
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_USER');


