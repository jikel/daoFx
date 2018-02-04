package application;

import minos.bean.LabelT;
import minos.dao.DAO;
import minos.dao.DAOFactory;

public class TestDAO {

	public static void main(String[] args) {
		DAO<LabelT> labelTDao = DAOFactory.getLabelTDAO();
		
		for(int i = 1; i <4 ; i++){
			LabelT labelT = labelTDao.find(i);
			System.out.println(labelT.getId() + "  fr"+ labelT.getFr() + "  nl:" + labelT.getNl());
		}
	}

}
