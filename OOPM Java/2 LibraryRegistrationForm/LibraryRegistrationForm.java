import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class LibraryRegistrationForm extends Applet implements ActionListener {

    Label nameLabel, emailLabel, phoneLabel, addressLabel, cityLabel, stateLabel, zipLabel;
    TextField nameField, emailField, phoneField, addressField, cityField, stateField, zipField;
    Button submitButton, resetButton;

    public void init() {
        setLayout(new GridLayout(8, 2));

        nameLabel = new Label("Name:");
        add(nameLabel);
        nameField = new TextField(20);
        add(nameField);

        emailLabel = new Label("Email:");
        add(emailLabel);
        emailField = new TextField(20);
        add(emailField);

        phoneLabel = new Label("Phone:");
        add(phoneLabel);
        phoneField = new TextField(20);
        add(phoneField);

        addressLabel = new Label("Address:");
        add(addressLabel);
        addressField = new TextField(20);
        add(addressField);

        cityLabel = new Label("City:");
        add(cityLabel);
        cityField = new TextField(20);
        add(cityField);

        stateLabel = new Label("State:");
        add(stateLabel);
        stateField = new TextField(20);
        add(stateField);

        zipLabel = new Label("Zip Code:");
        add(zipLabel);
        zipField = new TextField(20);
        add(zipField);

        submitButton = new Button("Submit");
        add(submitButton);
        submitButton.addActionListener(this);

        resetButton = new Button("Reset");
        add(resetButton);
        resetButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Code to handle submit button click
        } else if (e.getSource() == resetButton) {
            // Code to handle reset button click
        }
    }
}
