import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Main extends Application{
	
	public void start(Stage stage) {
		
		// layouts
		BorderPane root = new BorderPane();
		root.setStyle("-fx-background-color: linear-gradient(to bottom, blue, black,black, green);");
		
		VBox central = new VBox(15);
		central.setAlignment(Pos.CENTER);
		central.setSpacing(10);
		
		
		HBox buttons = new HBox(15);
		buttons.setAlignment(Pos.CENTER);
		buttons.setSpacing(10);
		
		// elementos/nodos
		Label lblTitulo = new Label("ENCRIPTADOR DE TEXTO");
		lblTitulo.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 32));
		lblTitulo.setStyle("-fx-text-fill: FFFFFF;");
        lblTitulo.setAlignment(Pos.CENTER);
		
        TextArea txtEntrada = new TextArea();
        txtEntrada.maxWidth(2);
        txtEntrada.maxHeight(3);
        
        Button btnLimpiar = new Button("Limpiar");
        Button btnEncrypt = new Button("Encriptar");
        
        
        TextArea txtEncrypt = new TextArea();
        
        Button btnCopiar = new Button("Copiar a portapapeles");
		
		//Adds
        buttons.getChildren().addAll(btnEncrypt,btnLimpiar);
		central.getChildren().addAll(lblTitulo,txtEntrada,buttons,txtEncrypt,btnCopiar);
		root.setTop(lblTitulo);
		root.setCenter(central);
		
		//eventos
		btnLimpiar.setOnAction(event -> {
        	txtEntrada.clear();
        	txtEncrypt.clear();
        });
		
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
