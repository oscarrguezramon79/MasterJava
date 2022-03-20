package _22_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertar {

	public static void main(String[] args) {
		Connection conn;
		
		try {			
			String url="jdbc:odbc:Ejemplo";
			String usuario="sa";
			String pass="sql";
			String sql;
			Statement st;
			int resultado;
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection(url, usuario, pass);
			
			sql="INSERT INTO Categorias VALUES('Valor1', 'valor2')";
			
			st = conn.createStatement();
			resultado = st.executeUpdate(sql);
			
			System.out.print(resultado );
			
			// Cerrar objetos de base de datos
			st.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.print("Driver no encontrado");
		} catch (SQLException e) {
			System.out.print("SQL Error");
		}

	}

}
