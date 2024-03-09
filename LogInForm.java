import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInForm extends JFrame{

    private Container c;
    private ImageIcon aiubIcon;
    private JTextField name, id;
    private JPasswordField pass;
    private JButton submitBtn , clearBtn;
    private JLabel title , nameLabel , idLabel ,passwordLabel;
    private Font titleFont , inputFont , buttonFont;
    
    LogInForm(){
        initialization();
    }

    public void initialization(){
        // Set Title Icon
        aiubIcon = new ImageIcon(getClass().getResource("aiub.png"));
        setIconImage(aiubIcon.getImage());

        // Creating Container
        c = this.getContentPane();
        c.setLayout(null);

        // Creating font
        titleFont = new Font("Arial" , Font.BOLD , 30);
        inputFont = new Font("Arial" , Font.BOLD , 20);
        buttonFont = new Font("Arial" , Font.BOLD, 16);

        // Creating Jlabel for Title
        title = new JLabel();
        title.setBounds(20,20,600,60);
        title.setText("Please Enter Your Details.");
        title.setFont(titleFont);
        title.setForeground(Color.BLUE);
        c.add(title);

        // Name Label
        nameLabel = new JLabel();
        nameLabel.setBounds(20,100,300,20);
        nameLabel.setText("Enter Your Name :");
        c.add(nameLabel);

        // Creating Name TextField
        name = new JTextField("Md Rijoan Maruf");
        name.setBounds(20,130, 400,40);
        name.setFont(inputFont);
        c.add(name);

        // ID Label
        idLabel = new JLabel();
        idLabel.setBounds(20,190,400,20);
        idLabel.setText("Enter Your Student ID :");
        c.add(idLabel);

        // Creating ID TextField
        id = new JTextField("23-53347-3");
        id.setBounds(20,220,400,40);
        id.setFont(inputFont);
        c.add(id);

        // Creating Password Label
        passwordLabel = new JLabel();
        passwordLabel.setBounds(20,280,400,20);
        passwordLabel.setText("Enter Your Passowrd :");
        c.add(passwordLabel);

        // Creating Password Field
        pass = new JPasswordField("saifsaif");
        pass.setBounds(20,310,400,40);
        pass.setFont(inputFont);
        c.add(pass);

        // Creating Clear Field
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(20, 370,90,35);
        clearBtn.setBackground(Color.BLUE);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setFont(buttonFont);
        c.add(clearBtn);

        // Creating Submit Field
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(330, 370,90,35);
        submitBtn.setBackground(Color.BLUE);
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setFont(buttonFont);
        c.add(submitBtn);

        // Clear Button Action Listenter 
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                name.setText("");
                id.setText("");
                pass.setText("");
            }
        });

        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String inputUserName = name.getText();
                String inputId = id.getText();
                String inputPassword = pass.getText();

                if (inputUserName.equals("Md Rijoan Maruf") && inputId.equals("23-53347-3") && inputPassword.equals("saifsaif")) {
                    JOptionPane.showMessageDialog(null, "Log In Successfull");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Input!");
                }
            }
        });      
    }

    public static void main(String[] args) {
        // Creationg a LogInForm Class Object
        LogInForm form = new LogInForm();

        // Creating a fream
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setSize(700,500);
        form.setLocationRelativeTo(null);
        form.setTitle("AIUB Student Login Form");


    }
}
