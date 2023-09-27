module com.example.classgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.classgui to javafx.fxml;
    exports com.example.classgui;
}