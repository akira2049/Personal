module cse213.tutorialprojects.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.tutorialprojects.calculator to javafx.fxml;
    exports cse213.tutorialprojects.calculator;
}