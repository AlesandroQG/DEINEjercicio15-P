module com.alesandro.ejercicio15p {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alesandro.ejercicio15p to javafx.fxml;
    exports com.alesandro.ejercicio15p;
}