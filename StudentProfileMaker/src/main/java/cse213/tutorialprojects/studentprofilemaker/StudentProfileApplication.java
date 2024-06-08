package cse213.tutorialprojects.studentprofilemaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentProfileApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StudentProfileApplication.class.getResource("StudentProfile.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Student Profile Maker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}