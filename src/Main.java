import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Main extends Application{
	
	@Override
	public void start(Stage stage) {
		
		// layouts
		BorderPane root = new BorderPane();
		root.setStyle("-fx-background-color: linear-gradient(to bottom, blue, black,black, green);");
		root.setPadding(new Insets(30*2));
		
		VBox central = new VBox(15);
		central.setAlignment(Pos.CENTER);
		central.setSpacing(10);
		
		HBox buttons = new HBox(15);
		buttons.setAlignment(Pos.CENTER);
		buttons.setSpacing(10);
		
		HBox buttons2 = new HBox(15);
		buttons2.setAlignment(Pos.CENTER);
		buttons2.setSpacing(10);
		
		// elementos/nodos
		Label lblTitulo = new Label("TEXT BRENCRYPTER");
		lblTitulo.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 32));
		lblTitulo.setStyle("-fx-text-fill: #FFFFFF;");
        lblTitulo.setAlignment(Pos.CENTER);
		
        TextArea txtEntrada = new TextArea();
        
        Label lblError = new Label("ERROR: No se admiten caracteres especiales ni números.");
		lblError.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 16));
		lblError.setStyle("-fx-text-fill: #FF0000;");
        lblError.setAlignment(Pos.CENTER);
        lblError.setVisible(false);
        
        Button btnLimpiar = new Button("Limpiar");
        Button btnEncrypt = new Button("Encriptar");
        
        TextArea txtEncrypt = new TextArea();
        
        Button btnCopiar = new Button("Copiar a portapapeles");
        Button btnDecrypt = new Button("Desencriptar");
		
		//Adds
        buttons.getChildren().addAll(btnEncrypt,btnLimpiar);
        buttons2.getChildren().addAll(btnDecrypt,btnCopiar);
		central.getChildren().addAll(lblTitulo,txtEntrada,buttons,lblError,txtEncrypt,buttons2);
		root.setCenter(central);
		
		//eventos
		btnEncrypt.setOnAction(event -> {
			String text = txtEntrada.getText();
			if(text.isBlank()||!text.matches("^[a-zA-Z ]+$")) { //ahora si valida que solo tenga caracteres y no numeros ni simbolos ni pibles
				lblError.setVisible(true);
			}else {
				lblError.setVisible(false);
				
				txtEncrypt.setText(Encriptador.invPalabra(text).trim());
			}
		});
		
		btnDecrypt.setOnAction(event -> {
			String text = txtEncrypt.getText();
			if(text.isBlank() ||!text.matches("^[a-zA-Z ]+$")) {
				lblError.setVisible(true);
			}else {
				lblError.setVisible(false);
				
				txtEntrada.setText(Encriptador.invPalabra(text).trim());
				//TODO: PARA EL DESENCRIPTADOR CAMBIAR EL MÉTODO AL AGREGAR LAS COLAS Y HASHMAPS!!!!!111111111111111
			}
		});
		
		btnLimpiar.setOnAction(event -> {
        	txtEntrada.clear();
        	txtEncrypt.clear();
        });
		
		btnCopiar.setOnAction(event -> {
		    ClipboardContent contenido = new ClipboardContent();
		    contenido.putString(txtEncrypt.getText());
		    Clipboard.getSystemClipboard().setContent(contenido);
		});
		
		//configuraciones de escena
		
		stage.setScene(new Scene(root, 640, 480));
		stage.setTitle("Text Brencrypter");
		stage.setResizable(false);
		stage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
