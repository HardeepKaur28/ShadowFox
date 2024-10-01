package com.management.contactmanager.controllers;

import com.management.contactmanager.models.Contact;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ContactController {

    @FXML
    private ListView<Contact> contactListView;

    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField emailField;

    @FXML
    private void addContact() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        Contact newContact = new Contact(name, phone, email);
        contactListView.getItems().add(newContact);

        nameField.clear();
        phoneField.clear();
        emailField.clear();
    }

    @FXML
    private void removeContact() {
        Contact selectedContact = contactListView.getSelectionModel().getSelectedItem();
        if (selectedContact != null) {
            contactListView.getItems().remove(selectedContact);
        }
    }
}
