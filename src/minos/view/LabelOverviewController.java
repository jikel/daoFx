package minos.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import minos.MainApp;
import minos.bean.LabelT;
import minos.dao.DAO;
import minos.dao.DAOFactory;

public class LabelOverviewController {
	@FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Button bTranslate;
    @FXML
    private Button openWindow;
    
    
    private MainApp mainApp;
    
    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public LabelOverviewController(){
    }
    
    @FXML
    private void initialize(){
    	// test avec les DAO
    	DAO<LabelT> labelT = DAOFactory.getLabelTDAO();
    	firstNameLabel.setText(labelT.find(2).getFr());
    	lastNameLabel.setText(labelT.find(3).getFr());
    	bTranslate.setText(labelT.find(1).getFr());
    	openWindow.setText(labelT.find(4).getFr());
    }
    
    /**
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp){
    	this.mainApp = mainApp;
    	
    	// ajout d'une observable list
    }
}
