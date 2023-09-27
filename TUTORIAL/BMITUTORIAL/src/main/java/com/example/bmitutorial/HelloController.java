package com.example.bmitutorial;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button cancel;

    @FXML
    private Button login;

    @FXML
    private TextField pass;

    @FXML
    private TextField user;

    Alert alert = new Alert(Alert.AlertType.WARNING);


    public void login() throws IOException {
        String Username = user.getText();
        String Password = pass.getText();

        if (Username.equals("Rich") && Password.equals("1234")) {
            Stage stage = new Stage();
            display(stage);
            login.getScene().getWindow().hide();
        } else {
            alert.setTitle(" Unsuccessful Log in");
            alert.setContentText(user + " Wrong Credentials");




        }


        user.setText("");
        pass.setText("");


    }


    public void Cancel() {
        Platform.exit();

    }

    public void display(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Mainpage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Calculate Your BMI");
        stage.setScene(scene);
        stage.show();
    }
}

