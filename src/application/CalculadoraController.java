package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController implements Initializable {
	@FXML
	private TextField TelaCalculadora;
	@FXML
	private Button bt8;
	@FXML
	private Button btparentesesD;
	@FXML
	private Button btApagar;
	@FXML
	private Button bt4;
	@FXML
	private Button btPorsentagem;
	@FXML
	private Button btDivisao;
	@FXML
	private Button bt9;
	@FXML
	private Button btParentesesE;
	@FXML
	private Button bt7;
	@FXML
	private Button bt5;
	@FXML
	private Button bt6;
	@FXML
	private Button btVeses;
	@FXML
	private Button bt1;
	@FXML
	private Button bt2;
	@FXML
	private Button bt3;
	@FXML
	private Button btMenos;
	@FXML
	private Button bt0;
	@FXML
	private Button btPonto;
	@FXML
	private Button btIgual;
	@FXML
	private Button btMais;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		this.bt7.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override // dentro do metodo handle vai a ação que o botão devera fazer
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				TelaCalculadora.setText("1");
				
			}
		});
		
	}
	
	
	
	

}
