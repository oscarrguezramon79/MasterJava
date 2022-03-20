package _22_JDBC;

import java.sql.*;

public class Parametros {
	public static void main(String[] args) {
		Connection conn;
		String d1 ="valor1";
		String d2 ="valor2";	
		try {			
			String url="jdbc:odbc:Ejemplo";
			String usuario="sa";
			String pass="sqlserver";
			String sql;
			PreparedStatement st;
			int resultado;
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection(url, usuario, pass);
			
			sql="INSERT INTO Categorias (NombreCategoria, Descripcion) VALUES(?, ?)";
			
			st = conn.prepareStatement(sql);
			// Pasar parámetros
			st.setString(1,d1);
			st.setString(2,d2);
			
			resultado = st.executeUpdate();
			
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

