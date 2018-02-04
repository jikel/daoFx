package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

//CTRL + SHIFT + O pour g�n�rer les imports
public class Connect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver O.K.");

			String url = "jdbc:mysql://localhost/daofx";
			String user = "root";
			String passwd = "MerRouge7964";

			Connection conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connexion effective !");

			// Cr�ation d'un objet Statement
			Statement state = conn.createStatement();
			// L'objet ResultSet contient le r�sultat de la requ�te SQL
			ResultSet result = state.executeQuery("SELECT * FROM labelt");
			// On r�cup�re les MetaData
			ResultSetMetaData resultMeta = result.getMetaData();

			System.out.println("\n**********************************");
			// On affiche le nom des colonnes
			for (int i = 1; i <= resultMeta.getColumnCount(); i++)
				System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

			System.out.println("\n**********************************");

			while (result.next()) {
				for (int i = 1; i <= resultMeta.getColumnCount(); i++)
					System.out.print("\t" + result.getObject(i).toString() + "\t |");

				System.out.println("\n---------------------------------");

			}

			result.close();
			state.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}