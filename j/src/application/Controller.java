package application;


import java.awt.event.ActionEvent;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable{

	private static final String AnchorPane = null;
	@FXML
	public Spinner<Integer> a;
	public Spinner<Integer> b;
	
	
	@FXML
	public Label myLabel;
	public Label myLabel2;
	
	Integer currentValue;
	Integer secondValue;
	public void initialize (URL arg0, ResourceBundle arg1) {
		
		SpinnerValueFactory<Integer> valueFactory = 
				new SpinnerValueFactory.IntegerSpinnerValueFactory(-10, 10);
		
		valueFactory.setValue(0);
		
		
		a.setValueFactory(valueFactory);
		b.setValueFactory(valueFactory);
		a.setEditable(true);
		b.setEditable(true);
		currentValue = a.getValue();
		secondValue = b.getValue();		
	}
}
	
	
