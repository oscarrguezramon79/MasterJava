package _22_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pruebas {

	public static void main(String[] args) {
		
		Connection conn;
		
		try {			
			String url="jdbc:odbc:master";
			String usuario="sa";
			String pass="sql";
			String sql;
			Statement st;
			ResultSet rs;
			
			// Mirar si hay driver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// Crear la conexión
			conn = DriverManager.getConnection(url, usuario, pass);
			// Ejecutar la instrucción de sql
			sql="Select * FROM Categorias";
			st = conn.createStatement();
			// Recuperar conjunto de resultados
			rs = st.executeQuery(sql);
			
			while ( rs.next() ) {
				System.out.print( rs.getString("NombreCategoria")  + "-->"  );
				System.out.println( rs.getString("Descripcion") );
				
			}
			
			// Cerrar objetos de base de datos
			rs.close();
			st.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.print("Driver no encontrado");
		} catch (SQLException e) {
			System.out.print("SQL Error");
		}

	}

}
