package com.example.bmitutorial;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class Mainpage {

    @FXML
    private TextField bmiRESULTS;

    @FXML
    private Button Calbmi;

    @FXML
    private Button GoBack;

    @FXML
    private TextField Height;

    @FXML
    private TextField Remarks;

    @FXML
    private TextField Weight;

    @FXML
    private Button go;

    @FXML
    private TextField name;

    @FXML
    private Button save;






    bmi mybmi = new bmi();



    public void Calbmi(){
        double height = Double.parseDouble(Height.getText());
        double weight = Double.parseDouble(Weight.getText());

        mybmi.setHeight(height);
        mybmi.setWeight(weight);

        double bmivalues = mybmi.Calbmi();


       bmiRESULTS.setText(Double.toString(bmivalues));//BMItxt.setText(Double.toString(BMIValue));
       Remarks.setText(mybmi.remarks());


    }
    public void save() throws IOException {
        FileWriter myfile = new FileWriter("RESULT\\view.txt",true);
        myfile.write(name.getText() + " " + Weight.getText() + " " + Height.getText() + " " + Remarks.getText() + " " + bmiRESULTS.getText());
        myfile.write(System.getProperty("line.separator"));
        myfile.close();


        Alert myalert = new Alert(Alert.AlertType.CONFIRMATION);
        myalert.setTitle("Successful Saved ");
        myalert.setContentText( name.getText() + " bmi saved successfully");
        myalert.show();

        name.setText("");
        Weight.setText("");
        Height.setText("");
        bmiRESULTS.setText("");
        Remarks.setText("");



    }
public void goback() throws IOException {
    Stage stage = new Stage();

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();

    GoBack.getScene().getWindow().hide();
}
public void go() throws IOException {
        Stage stage = new Stage();
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Mainpage.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();

    GoBack.getScene().getWindow().hide();
}

}

