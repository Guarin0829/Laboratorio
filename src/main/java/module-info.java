module com.example.laboratorio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laboratorio to javafx.fxml;
    exports com.example.laboratorio;
}