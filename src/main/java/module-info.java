module com.mycompany.pooproject {
    exports com.mycompany.pooproject.Classes;
    opens com.mycompany.pooproject.Classes to com.fasterxml.jackson.databind;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.pooproject to javafx.fxml;
    exports com.mycompany.pooproject;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
}
