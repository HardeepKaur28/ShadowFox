module com.management.contactmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.management.contactmanager to javafx.fxml;
    exports com.management.contactmanager;
    exports com.management.contactmanager.controllers;
    opens com.management.contactmanager.controllers to javafx.fxml;
}
