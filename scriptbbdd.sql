CREATE DATABASE Gym;

USE Gym;

CREATE TABLE Clientes (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
  direccion VARCHAR(100) NOT NULL,
  correo_electronico VARCHAR(100) NOT NULL,
  numero_telefono VARCHAR(15) NOT NULL,
  contrasena VARCHAR(255) NOT NULL
);

CREATE TABLE roles (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL
);

CREATE TABLE user_roles (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES Clientes(id),
  FOREIGN KEY (role_id) REFERENCES roles(id)
);

CREATE TABLE Suscripciones (
  id INT AUTO_INCREMENT PRIMARY KEY,
  tipo_suscripcion VARCHAR(50) NOT NULL,
  precio DECIMAL(10,2) NOT NULL,
  duracion INT NOT NULL
);

CREATE TABLE Compras (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_cliente INT NOT NULL,
  id_suscripcion INT NOT NULL,
  fecha_compra DATE NOT NULL,
  FOREIGN KEY (id_cliente) REFERENCES Clientes(id),
  FOREIGN KEY (id_suscripcion) REFERENCES Suscripciones(id)
);
USE Gym;
ALTER TABLE Clientes
ADD COLUMN username VARCHAR(50) NOT NULL;

ALTER TABLE Clientes
CHANGE COLUMN contrasena password VARCHAR(255) NOT NULL;

ALTER TABLE lientes DROP COLUMN id, DROP COLUMN email;


-- Renombrar la columna id en la tabla Clientes
ALTER TABLE Clientes RENAME COLUMN id TO id_cliente;

-- Renombrar la columna id en la tabla Suscripciones
ALTER TABLE Suscripciones RENAME COLUMN id TO id_suscripcion;

-- Renombrar la columna id en la tabla Compras
ALTER TABLE Compras RENAME COLUMN id TO id_compra;

INSERT INTO clientes (nombre, apellido, fecha_nacimiento, direccion, correo_electronico, numero_telefono, password, username)
VALUES ('Nombre1', 'Apellido1', '2000-01-01', 'Dirección1', 'correo1@example.com', '123456789', 'contraseña1', 'usuario1'),
       ('Nombre2', 'Apellido2', '2001-02-02', 'Dirección2', 'correo2@example.com', '234567890', 'contraseña2', 'usuario2'),
       ('Nombre3', 'Apellido3', '2002-03-03', 'Dirección3', 'correo3@example.com', '345678901', 'contraseña3', 'usuario3');
ALTER TABLE Clientes ADD email VARCHAR(255);

ALTER TABLE Clientes DROP COLUMN correo_electronico;
ALTER TABLE Clientes DROP COLUMN contrasena;
