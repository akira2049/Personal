package cse213.tutorialprojects.complexnooperation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ComplexNoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ComplexNoApplication.class.getResource("ComplexNo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ComplexNoOperation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}