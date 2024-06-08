package cse213.tutorialprojects.studentprofilemaker;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class StudentProfileController
{
    @javafx.fxml.FXML
    private ComboBox nationalityComboBox;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private TextField lastNameTextfield;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private TextField emailTextfield;
    @javafx.fxml.FXML
    private TextField firstNameTextfield;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private RadioButton confusedRAdioButton;
    @javafx.fxml.FXML
    private TextArea displayTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        nationalityComboBox.getItems().addAll("Japanese","American","Canadian","Australian","British","Bangladeshi");
        ToggleGroup toggleGroup = new ToggleGroup();
        femaleRadioButton.setToggleGroup(toggleGroup);
        maleRadioButton.setToggleGroup(toggleGroup);
        confusedRAdioButton.setToggleGroup(toggleGroup);

    }

    @Deprecated
    public void OnClickSignUp(ActionEvent actionEvent) {
        String firstName = firstNameTextfield.getText();
        String lastName = lastNameTextfield.getText();
        String email = emailTextfield.getText();
        String dob = dobDatePicker.getValue().toString();
        String nationality = nationalityComboBox.getValue().toString();

        String gender;
        if (femaleRadioButton.isSelected()){
            gender = "Female";
        } else {
            gender = "Male";
        }

        Student student = new Student(firstName,lastName,email,gender,nationality,dob);
        displayTextArea.appendText(student.toString());
    }

    @javafx.fxml.FXML
    public void OnClickCreateProfile(ActionEvent actionEvent) {
    }
}