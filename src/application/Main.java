package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
  public static final int BOARD_X_DIMENSION = 1200;
  public static final int BOARD_Y_DIMENSION = 900;
	@Override
	public void start(Stage primaryStage) {
		try {
		  // create root node
			BorderPane root = new BorderPane();
			
			// example of displaying munchkin board as toggle button
			VBox vbox1 = new VBox();
			ToggleButton board = new ToggleButton();
			board.setId("munchkin_board");
			
			// init scene with nodes
			vbox1.getChildren().add(board);
			root.setLeft(vbox1);
			Scene scene = new Scene(root,BOARD_X_DIMENSION,BOARD_Y_DIMENSION);
			
			// load .css file
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// init stage nodes
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
