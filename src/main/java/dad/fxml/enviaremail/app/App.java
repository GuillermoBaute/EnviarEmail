package dad.fxml.enviaremail.app;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

private Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new Controller();
		

	}

	public static void main(String[] args) {
		launch(args);
	}

}
