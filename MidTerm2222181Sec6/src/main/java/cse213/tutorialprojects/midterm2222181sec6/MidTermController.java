package cse213.tutorialprojects.midterm2222181sec6;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MidTermController
{
    @javafx.fxml.FXML
    private CheckBox hasGpuheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> brandComboBox;
    @javafx.fxml.FXML
    private TableColumn<Computer, String> brandCol;
    @javafx.fxml.FXML
    private TextField noOfGpuTextfield;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TableView<Computer> tableView;
    @javafx.fxml.FXML
    private TextField serialNotextfField;
    @javafx.fxml.FXML
    private TableColumn<Computer, String> modelCol;
    @javafx.fxml.FXML
    private ComboBox<String> modelComboBox;
    @javafx.fxml.FXML
    private TableColumn<Computer, Float> priceCol;
    ArrayList<Computer> computerlist = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<Computer,Integer> serialCol;
    @javafx.fxml.FXML
    private ComboBox<String> brandComboBox1;
    @javafx.fxml.FXML
    private ComboBox<String> modelComboBox1;

    @javafx.fxml.FXML
    public void initialize() {
        brandComboBox.getItems().addAll("HP","APPLE","ASUS","Dell","Lenovo");
        modelComboBox.getItems().addAll("Macbook Pro", "IdeaPad","ThinkPad","Rog");
        serialCol.setCellValueFactory(new PropertyValueFactory<>("serialNo"));
        brandCol.setCellValueFactory(new PropertyValueFactory<>("brand"));
        modelCol.setCellValueFactory(new PropertyValueFactory<>("model"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        brandComboBox1.getItems().addAll("HP","APPLE","ASUS","Dell","Lenovo");
        modelComboBox1.getItems().addAll("Macbook Pro", "IdeaPad","ThinkPad","Rog","Inspiron");


    }

    @javafx.fxml.FXML
    public void searchAndshowButton(ActionEvent actionEvent) {
        tableView.getItems().clear();
        String brand = brandComboBox1.getValue();
        String model = modelComboBox1.getValue();

        for (Computer computer : computerlist) {
            if (brand.equals(computer.getBrand()) || model.equals(computer.getModel())) {
                tableView.getItems().add(computer.updateWithVat());

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText(computer.getBrand() + " " + computer.getModel() + " is not found!");
            }
        }
    }

    @javafx.fxml.FXML
    public void AddNewComputerButton(ActionEvent actionEvent) {
        int gpuNo;
        if (!hasGpuheckBox.isSelected()) {
            gpuNo = 0;
        } else {
            if (Integer.parseInt(noOfGpuTextfield.getText()) %2 == 0) {
                gpuNo = Integer.parseInt(noOfGpuTextfield.getText());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("GPU cannot be odd!");
                alert.showAndWait();
            }
        }
        Computer computer = new Computer(Integer.parseInt(serialNotextfField.getText()), brandComboBox.getValue(),modelComboBox.getValue(), Float.parseFloat(priceTextField.getText(),hasGpuheckBox.isSelected(),gpuNo);
        computerlist.add(computer);
        if (computerlist.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Failed to add computer!");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Successfully added computer!");
            alert.showAndWait();

        }
    }
}