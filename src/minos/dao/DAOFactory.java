package minos.dao;

import java.sql.Connection;

import minos.connection.MinosConnection;
import minos.dao.implement.LabelTDAO;

public class DAOFactory {
	protected static final Connection conn = MinosConnection.getInstance();

	public static DAO getLabelTDAO(){
		return new LabelTDAO(conn);
	}

}
