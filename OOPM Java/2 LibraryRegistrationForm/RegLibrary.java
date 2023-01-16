import java.awt.*;
import java.awt.event.*;
public class RegLibrary extends Frame implements ActionListener {
    public static void main(String args[]){
        new RegLibrary();
    }

    Label nameLabel,emailLabel,rollnoLabel, classLabel, collegLabel, submitted;
    TextField nameField, emailField, rollnoField, classField, collegField;
    Button submit, reset;

    public RegLibrary(){
        setLayout(new FlowLayout());
        

        nameLabel = new Label("Name: ");
        emailLabel = new Label("Email: ");
        rollnoLabel = new Label("RollNo: ");
        classLabel= new Label("Class: ");
        collegLabel = new Label("College Name: ");

        submitted = new Label("Your form has been Submitted Successfull !!!");

        nameField = new TextField(20);
        emailField = new TextField(20);
        rollnoField = new TextField(20);
        classField = new TextField(20);
        collegField = new TextField(20);

        submit = new Button("Submit");
        reset = new Button("Reset");


        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(rollnoLabel);
        add(rollnoField);
        add(classLabel);
        add(classField);
        add(collegLabel);
        add(collegField);
        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);



        setSize(500,500);
        setVisible(true);
        setTitle("Library Registration Form");
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==submit) {
            System.out.println("Name: "+ nameField.getText());
            add(submitted);
            setVisible(true);
        }
        else{
            nameField.setText("");
            submitted.setVisible(false);
        }

    }
}