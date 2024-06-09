package cse213.tutorialprojects.complexnooperation;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexNoController
{
    @javafx.fxml.FXML
    private TextField imgNoFirstComplexNoTextfield;
    @javafx.fxml.FXML
    private TextField imgNoSecondComplexNoTextfield;
    @javafx.fxml.FXML
    private TextField realNoFirstComplexNoTextfield;
    @javafx.fxml.FXML
    private TextField realNoSecondComplexNoTextfield;
    @javafx.fxml.FXML
    private Label resultTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubButton(ActionEvent actionEvent) {
        String first_real = realNoFirstComplexNoTextfield.getText();
        String first_img = imgNoFirstComplexNoTextfield.getText();
        String second_real = realNoSecondComplexNoTextfield.getText();
        String second_img = imgNoSecondComplexNoTextfield.getText();
        int real_first = Integer.parseInt(first_real);
        int real_second = Integer.parseInt(second_real);
        int img_first = Integer.parseInt(first_img);
        int img_second = Integer.parseInt(second_img);

        ComplexNo firstcomplexNo = new ComplexNo(real_first,img_first);
        ComplexNo secondcomplexNo = new ComplexNo(real_second,img_second);
        ComplexNo temp = firstcomplexNo.sub(secondcomplexNo);
        resultTextfield.setText(temp.toString());
    }

    @javafx.fxml.FXML
    public void AddButton(ActionEvent actionEvent) {
        String first_real = realNoFirstComplexNoTextfield.getText();
        String first_img = imgNoFirstComplexNoTextfield.getText();
        String second_real = realNoSecondComplexNoTextfield.getText();
        String second_img = imgNoSecondComplexNoTextfield.getText();
        int real_first = Integer.parseInt(first_real);
        int real_second = Integer.parseInt(second_real);
        int img_first = Integer.parseInt(first_img);
        int img_second = Integer.parseInt(second_img);

        ComplexNo firstcomplexNo = new ComplexNo(real_first,img_first);
        ComplexNo secondcomplexNo = new ComplexNo(real_second,img_second);
        ComplexNo temp = firstcomplexNo.add(secondcomplexNo);
        resultTextfield.setText(temp.toString());
    }

    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {
        this.imgNoFirstComplexNoTextfield.clear();
        this.imgNoSecondComplexNoTextfield.clear();
        this.realNoFirstComplexNoTextfield.clear();
        this.realNoSecondComplexNoTextfield.clear();
        resultTextfield.setText("Result");
    }
}