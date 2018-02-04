package application;

import minos.bean.LabelT;
import minos.connection.MinosConnection;
import minos.dao.DAO;
import minos.dao.implement.LabelTDAO;

public class FirstTest {

	public static void main(String[] args) {
		// testons les label
		DAO <LabelT> labelTDAO = new LabelTDAO(MinosConnection.getInstance());
		for(int i = 1; i < 4;i++){
			LabelT labelT = labelTDAO.find(i);
			System.out.println(labelT.getId() + "  fr"+ labelT.getFr() + "  nl:" + labelT.getNl());
		}
	}
}
