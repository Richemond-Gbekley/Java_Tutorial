module com.example.bmitutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bmitutorial to javafx.fxml;
    exports com.example.bmitutorial;
}