import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class SwingRegLib extends JFrame implements ActionListener{

    JLabel nameLabel, emailLabel, phoneLabel, rollnoLabel, classLabel, submittedLabel;
    JTextField nameField, emailField, phoneField, rollnoField, classField;
    JButton submit, reset;

    public SwingRegLib(){

    nameLabel = new JLabel("Name: ");
    emailLabel = new JLabel("Email: ");
    phoneLabel = new JLabel("Phone No: ");
    rollnoLabel = new JLabel("Roll No : ");
    classLabel = new JLabel("Class: ");

    nameField = new JTextField(20);
    emailField = new JTextField(20);
    phoneField = new JTextField(20);
    rollnoField = new JTextField(20);
    classField = new JTextField(20);

    submit = new JButton("Submit");
    reset = new JButton("Reset");

    submittedLabel = new JLabel("Your form has been submitted !!!");

    add(nameLabel);
    add(nameField);
    add(emailLabel);
    add(emailField);
    add(phoneLabel);
    add(phoneField);
    add(rollnoLabel);
    add(rollnoField);
    add(classLabel);
    add(classField);
    add(submit);
    add(reset);

    submit.addActionListener(this);
    reset.addActionListener(this);


    setLayout(new FlowLayout());
    setVisible(true);
    setSize(350,350);
    setTitle("Registration Form");

    }
    public static void main(String args[]){
        new SwingRegLib();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            System.out.println("Name: "+nameField.getText());
            System.out.println("Email: "+emailField.getText());
            System.out.println("Phone: "+phoneField.getText());
            System.out.println("RollNo : "+rollnoField.getText());
            System.out.println("Class: "+classField.getText());

            add(submittedLabel);
            setVisible(true);

        }
        else{
            System.out.println("Reset");
            nameField.setText("");
            emailField.setText("");
            phoneField.setText("");
            rollnoField.setText("");
            classField.setText("");
            submittedLabel.setVisible(false);
            }
        
    }   
}
