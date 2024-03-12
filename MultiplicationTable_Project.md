# Multiplication Table Project
## Code :

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable extends JFrame {
    MultiplicationTable(){
        init();
    }

    public void init(){
        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);
        Color rgb = new Color(212, 209, 195);
        c.setBackground(rgb);

        // Creating Font for JLabel Title
        Font mainTitleFont = new Font("Arial", Font.BOLD, 30);


        // Creating JLabel for Title
        JLabel mainTitle = new JLabel("Multiplication Table");
        mainTitle.setBounds(85,20,400,40);
        mainTitle.setFont(mainTitleFont);
        c.add(mainTitle);

        // Creating Font for textFiledTitle
        Font textFiledTitleFont = new Font("Arial", Font.BOLD, 20);

        // Creating JTextField Title
        JLabel textFieldTitle = new JLabel("Enter Your Number :");
        textFieldTitle.setBounds(20,100,400,30);
        textFieldTitle.setFont(textFiledTitleFont);
        textFieldTitle.setForeground(Color.DARK_GRAY);
        c.add(textFieldTitle);

        // Creating Font for JTextField
        Font textFiledFont = new Font("Arial" , Font.BOLD ,25);

        // Creating JTextField
        JTextField inputField = new JTextField();
        inputField.setBounds(20,150,400,50);
        inputField.setFont(textFiledFont);
        c.add(inputField);

        // Create Clear Button
        Button clearButton = new Button("Clear");
        clearButton.setBounds(20,220,70,40);
        clearButton.setBackground(Color.BLUE);
        clearButton.setForeground(Color.WHITE);
        Font buttonFont = new Font("Arial", Font.BOLD,20);
        clearButton.setFont(buttonFont);
        c.add(clearButton);

        // Crete Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setBounds(320,220,80,40);
        submitButton.setForeground(Color.WHITE);
        submitButton.setBackground(Color.darkGray);
        submitButton.setFont(buttonFont);
        c.add(submitButton);

        // Crating Output Box Title
        JLabel outputBoxTitle = new JLabel("The Multiplication Table is : ");
        outputBoxTitle.setFont(textFiledTitleFont);
        outputBoxTitle.setBounds(20,280,400,20);
        outputBoxTitle.setBackground(Color.red);
        c.add(outputBoxTitle);


        // Creating a Output Box :
        JTextArea outputBox = new JTextArea();
        outputBox.setBounds(20,320,200,350);
        outputBox.setBackground(rgb);
        Font outputBoxFont = new Font("Arial", Font.BOLD, 25);
        outputBox.setFont(outputBoxFont);
        c.add(outputBox);

        // OutputBox Clear Button
        Button outputBoxClearButton = new Button("Clear");
        outputBoxClearButton.setBounds(340,580,70,40);
        outputBoxClearButton.setBackground(Color.BLUE);
        outputBoxClearButton.setForeground(Color.WHITE);
        outputBoxClearButton.setFont(buttonFont);
        c.add(outputBoxClearButton);

        // Clear Button Action Listener
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });

        // Output Clear Button Action Listener
        outputBoxClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputBox.setText("");
            }
        });


        // Submit Button Action Listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputNumber = Integer.parseInt(inputField.getText());
                for (int i = 1; i<=10; i++){
                    outputBox.append(Integer.toString(inputNumber) + " X " + Integer.toString(i) + " = " + Integer.toString(i*inputNumber) + "\n");
                }
            }
        });

    }

    public static void main(String[] args) {
        MultiplicationTable frame= new MultiplicationTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1000,50,500,750);
    }
}
```