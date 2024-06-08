package cse213.tutorialprojects.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @javafx.fxml.FXML
    private TextField textFieldOne;
    @javafx.fxml.FXML
    private TextField textFieldTwo;
    @javafx.fxml.FXML
    private Label answerLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddOnClick(ActionEvent actionEvent) {
        String numOne = textFieldOne.getText();
        String numTwo = textFieldTwo.getText();

        float numOneFloat = Float.parseFloat(numOne);
        float numTwoFloat = Float.parseFloat(numTwo);
        float sum = numOneFloat + numTwoFloat;

        String answer = Float.toString(sum);
        answerLabel.setText(answer);
    }

    @javafx.fxml.FXML
    public void SubOnClick(ActionEvent actionEvent) {
        String numOne = textFieldOne.getText();
        String numTwo = textFieldTwo.getText();

        float numOneFloat = Float.parseFloat(numOne);
        float numTwoFloat = Float.parseFloat(numTwo);
        float sum = numOneFloat - numTwoFloat;

        String answer = Float.toString(sum);
        answerLabel.setText(answer);
    }

    @javafx.fxml.FXML
    public void MulOnClick(ActionEvent actionEvent) {
        String numOne = textFieldOne.getText();
        String numTwo = textFieldTwo.getText();

        float numOneFloat = Float.parseFloat(numOne);
        float numTwoFloat = Float.parseFloat(numTwo);
        float sum = numOneFloat * numTwoFloat;

        String answer = Float.toString(sum);
        answerLabel.setText(answer);
    }

    @javafx.fxml.FXML
    public void DivideOnClick(ActionEvent actionEvent) {
        String numOne = textFieldOne.getText();
        String numTwo = textFieldTwo.getText();

        float numOneFloat = Float.parseFloat(numOne);
        float numTwoFloat = Float.parseFloat(numTwo);
        if (numTwoFloat == 0) {
            answerLabel.setText("Infinity");
        }
        else{
            float sum = numOneFloat / numTwoFloat;
            String answer = Float.toString(sum);
            answerLabel.setText(answer);
        }
    }

    @javafx.fxml.FXML
    public void ClearOnClick(ActionEvent actionEvent) {
        textFieldOne.clear();
        textFieldTwo.clear();
        answerLabel.setText("");
    }
}