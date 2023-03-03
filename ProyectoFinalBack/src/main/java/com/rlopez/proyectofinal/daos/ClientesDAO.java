package com.rlopez.proyectofinal.daos;

public interface ClientesDAO {

	Integer insertarCliente(Integer id,String nombre,String apellido,String fechaNacimiento,String direccion,String correoElectronico,String numeroTelefono,String contrasena);


}
