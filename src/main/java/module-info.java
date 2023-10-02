module com.mycompany.pooproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.pooproject to javafx.fxml;
    exports com.mycompany.pooproject;
}
