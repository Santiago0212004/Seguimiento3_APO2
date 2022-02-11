package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button calculateBTM;

    @FXML
    private Button eightBTM;

    @FXML
    private Button fiveBTM;

    @FXML
    private Button fourBTM;

    @FXML
    private Button multiplicationBTM;

    @FXML
    private Button nineBTM;

    @FXML
    private Button oneBTM;

    @FXML
    private TextField operationTF;

    @FXML
    private TextArea recordTA;

    @FXML
    private Button restBTM;

    @FXML
    private TextArea resultTA;

    @FXML
    private Button sevenBTM;

    @FXML
    private Button sixBTM;

    @FXML
    private Button sumBTM;

    @FXML
    private Button threeBTM;

    @FXML
    private Button twoBTM;

    @FXML
    private Button zeroBTM;
    
    @FXML
    void zeroNum(ActionEvent event) {
    	operationTF.appendText("0");
    }
    
    @FXML
    void oneNum(ActionEvent event) {
    	operationTF.appendText("1");
    }
    
    @FXML
    void twoNum(ActionEvent event) {
    	operationTF.appendText("2");
    }
    
    @FXML
    void threeNum(ActionEvent event) {
    	operationTF.appendText("3");
    }
    
    @FXML
    void fourNum(ActionEvent event) {
    	operationTF.appendText("4");
    }
    
    @FXML
    void fiveNum(ActionEvent event) {
    	operationTF.appendText("5");
    }
    
    @FXML
    void sixNum(ActionEvent event) {
    	operationTF.appendText("6");
    }
    
    @FXML
    void sevenNum(ActionEvent event) {
    	operationTF.appendText("7");
    }
    
    @FXML
    void eightNum(ActionEvent event) {
    	operationTF.appendText("8");
    }
    
    @FXML
    void nineNum(ActionEvent event) {
    	operationTF.appendText("9");
    }
    
    @FXML
    void sum(ActionEvent event) {
    	operationTF.appendText("+");
    }
    
    @FXML
    void rest(ActionEvent event) {
    	operationTF.appendText("-");
    }
    
    @FXML
    void multiplication(ActionEvent event) {
    	operationTF.appendText("*");
    }

    @FXML
    void calculate(ActionEvent event) {
    	
    }

}
