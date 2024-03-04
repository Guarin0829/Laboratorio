module com.example.laboratorio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laboratorio to javafx.fxml;
    exports com.example.laboratorio;
    opens com.example.laboratorio.viewcontroller to javafx.fxml;
    exports com.example.laboratorio.viewcontroller;
}