module com.alesandro.ejercicio15p {
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.alesandro.ejercicio15o;


    opens com.alesandro.ejercicio15p to javafx.fxml;
    exports com.alesandro.ejercicio15p;
}