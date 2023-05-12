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
FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente) ON DELETE CASCADE
);

CREATE TABLE Compras (
id_compras INT AUTO_INCREMENT PRIMARY KEY,
id_cliente INT NOT NULL,
id_suscripcion INT NOT NULL,
fecha_compra VARCHAR(25) NOT NULL,
FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente) ON DELETE CASCADE,
FOREIGN KEY (id_suscripcion) REFERENCES Suscripciones(id_suscripcion) ON DELETE CASCADE
);

-- Insertar datos en la tabla roles
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_USER');
-- Insertar datos (admin)
INSERT INTO Clientes (nombre, apellido, fecha_nacimiento, direccion, numero_telefono, email, password, username)
VALUES
('Sofía', 'García', '12/10/1985', 'Calle 123', '688495782', 'sofiagarcia@gmail.com', '$2a$12$xgWecMc0ma14/L7Kt6hDaOJ7re3idc.2CAnTi.TEk3Bce6/zWWgx2', 'sofiagarcia20');
-- Pass sofía Pruebapr15
-- Asignarle rol al cliente
INSERT INTO user_roles (user_id, role_id) VALUES ((SELECT id_cliente FROM clientes WHERE email = 'sofiagarcia@gmail.com'), 1);





