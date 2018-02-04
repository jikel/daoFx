package minos.dao.implement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import minos.bean.LabelT;
import minos.dao.DAO;

public class LabelTDAO extends DAO<LabelT>{
	public LabelTDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(LabelT obj) {
		return false;
	}

	@Override
	public boolean delete(LabelT obj) {
		return false;
	}

	@Override
	public boolean update(LabelT obj) {
		return false;
	}

	@Override
	public LabelT find(int id) {
		LabelT labelT = new LabelT();
		
	    try {
	        ResultSet result = this.connect.createStatement(
	          ResultSet.TYPE_SCROLL_INSENSITIVE,
	          ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM labelt WHERE id = " + id);
	        if(result.first())
	          labelT = new LabelT(
	            id,
	            result.getString("fr"),
	            result.getString("nl"
	          ));         
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
		return labelT;
	}

}
