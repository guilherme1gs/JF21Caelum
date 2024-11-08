package br.com.caelum.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class TestaExercicio {
	
	
	public static void main(String[] args) throws SQLException { 
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexao Aberta!");          
		connection.close();
	}
	
	
	
	
	

}
