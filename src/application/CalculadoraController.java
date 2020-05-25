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

	
	
	public TextField getTelaCalculadora() {
		return TelaCalculadora;
	}



	public void setTelaCalculadora(TextField telaCalculadora) {
		TelaCalculadora = telaCalculadora;
	}



	public Button getBt8() {
		return bt8;
	}



	public void setBt8(Button bt8) {
		this.bt8 = bt8;
	}



	public Button getBtparentesesD() {
		return btparentesesD;
	}



	public void setBtparentesesD(Button btparentesesD) {
		this.btparentesesD = btparentesesD;
	}



	public Button getBtApagar() {
		return btApagar;
	}



	public void setBtApagar(Button btApagar) {
		this.btApagar = btApagar;
	}



	public Button getBt4() {
		return bt4;
	}



	public void setBt4(Button bt4) {
		this.bt4 = bt4;
	}



	public Button getBtPorsentagem() {
		return btPorsentagem;
	}



	public void setBtPorsentagem(Button btPorsentagem) {
		this.btPorsentagem = btPorsentagem;
	}



	public Button getBtDivisao() {
		return btDivisao;
	}



	public void setBtDivisao(Button btDivisao) {
		this.btDivisao = btDivisao;
	}



	public Button getBt9() {
		return bt9;
	}



	public void setBt9(Button bt9) {
		this.bt9 = bt9;
	}



	public Button getBtParentesesE() {
		return btParentesesE;
	}



	public void setBtParentesesE(Button btParentesesE) {
		this.btParentesesE = btParentesesE;
	}



	public Button getBt7() {
		return bt7;
	}



	public void setBt7(Button bt7) {
		this.bt7 = bt7;
	}



	public Button getBt5() {
		return bt5;
	}



	public void setBt5(Button bt5) {
		this.bt5 = bt5;
	}



	public Button getBt6() {
		return bt6;
	}



	public void setBt6(Button bt6) {
		this.bt6 = bt6;
	}



	public Button getBtVeses() {
		return btVeses;
	}



	public void setBtVeses(Button btVeses) {
		this.btVeses = btVeses;
	}



	public Button getBt1() {
		return bt1;
	}



	public void setBt1(Button bt1) {
		this.bt1 = bt1;
	}



	public Button getBt2() {
		return bt2;
	}



	public void setBt2(Button bt2) {
		this.bt2 = bt2;
	}



	public Button getBt3() {
		return bt3;
	}



	public void setBt3(Button bt3) {
		this.bt3 = bt3;
	}



	public Button getBtMenos() {
		return btMenos;
	}



	public void setBtMenos(Button btMenos) {
		this.btMenos = btMenos;
	}



	public Button getBt0() {
		return bt0;
	}



	public void setBt0(Button bt0) {
		this.bt0 = bt0;
	}



	public Button getBtPonto() {
		return btPonto;
	}



	public void setBtPonto(Button btPonto) {
		this.btPonto = btPonto;
	}



	public Button getBtIgual() {
		return btIgual;
	}



	public void setBtIgual(Button btIgual) {
		this.btIgual = btIgual;
	}



	public Button getBtMais() {
		return btMais;
	}



	public void setBtMais(Button btMais) {
		this.btMais = btMais;
	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		this.getBt7().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override // dentro do metodo handle vai a ação que o botão devera fazer
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				
				System.out.println("teu cu");
				//getTelaCalculadora().setText("7");
				
			}
		});
		
	}
	
	
	
	

}
