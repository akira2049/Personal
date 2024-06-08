module cse213.tutorialprojects.studentprofilemaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.tutorialprojects.studentprofilemaker to javafx.fxml;
    exports cse213.tutorialprojects.studentprofilemaker;
}