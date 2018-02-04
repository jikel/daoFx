package application;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import minos.connection.MinosConnection;

public class Test {
	  public static void main(String[] args) {
	    try {
	      //Nous appelons quatre fois la méthode getInstance()
	      PreparedStatement prepare = MinosConnection.getInstance().prepareStatement("SELECT * FROM classe WHERE cls_nom = ?");

	      Statement state = MinosConnection.getInstance().createStatement();

	      MinosConnection.getInstance().setAutoCommit(false);

	      DatabaseMetaData meta = MinosConnection.getInstance().getMetaData();
	         
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	}