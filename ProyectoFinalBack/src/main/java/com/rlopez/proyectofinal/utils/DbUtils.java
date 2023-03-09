package com.rlopez.proyectofinal.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtils {

private static SessionFactory sessionFactory;
	
	private DbUtils() {
		
	}
	
	public static SessionFactory creadorSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			}catch(Throwable ex) {
				System.err.println("Error al crear el objeto SessionFactory" + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		return sessionFactory;
		
	}
	
	public static Connection conexion() {
		Connection conexionBD = null;
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			String servidor = "jdbc:mysql://localhost:3306/gym";
			String username = "root";
			String password = "root";
			conexionBD = DriverManager.getConnection(servidor, username, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		return conexionBD;
	}
	
}
