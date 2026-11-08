import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start(Stage stage) {
		
		VBox root = new VBox(15);
		Label lblTitulo = new Label("ENCRIPTADOR DE TEXTO");
		lblTitulo.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 16));
        lblTitulo.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: linear-gradient(to bottom, blue, black,black, green);");
		
		//Adds
		root.getChildren().add(lblTitulo);
		
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
