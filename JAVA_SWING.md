# Java Swing

## Dialog :
### showMessageDialog()
```java
JOptionPane.showMessageDialog(null, "This is Massage", "This is Title", JOptionPane.ERROR_MESSAGE);
```
**Icon :**

    JOptionPanel.PLANI_MASSAGE        --> IDE Value : -1  
    JOptionPanel.ERROR_MASSAGE        --> IDE Value : 0  
    JOptionPanel.INFORMATION_MASSAGE  --> IDE Value : 1  
    JOptionPanel.WORNING_MASSAGE      --> IDE Value : 2 
    JOptionPanel.QUESTION_MASSAGE     --> IDE Value : 3 

We can use IDE value : 
```java
JOptionPane.showMessageDialog(null, "This is massage", "This is title", 0);
// Output : Will show Error Icon
```
**Add Custom Icon :**


```java
// Creation a new image object
ImageIcon icon = new ImageIcon("path.jpg");
JOptionPane.showMessageDialog(null, "This is massage", "This is title", 0);
```

### showInputDialog() :

```java
String name = JOptionPane.showInputDialog(null, "Enter your inpout : ", "This is title.", JOptionPane.ERROR_MESSAGE);
// Order : Position , Massage , Title , Icon
```


### showConfirmDialog() :

```java
JOptionPane.showConfirmDialog(null, "Do you rijoan?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, 0) ;
// Order : Position , Massage , Title , Option , Icon
```
**Example :**
```java
import javax.swing.JOptionPane;

public class Input {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you rijoan?", "Confirmation", JOptionPane.YES_NO_OPTION, 0) ;  

        if(choice == JOptionPane.YES_OPTION){
            System.out.println("Thank You!");
        }
        else{
            System.out.println("Sorry , You Can't Access!");
            System.exit(0);
        }
    }
}
```


## JFrame :
```java
import javax.swing.JFrame;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();  // Creating JFrame Object
        
        frame.setVisible(true);     // Make visible this frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                      // For exit code in press cross button
        frame.setSize(600 , 600);
        frame.setResizable(false);   // Make not resizeable . Default is true
        frame.setTitle("This is Title");
    }
}
```
**Frame set in the middle :**
```java
frame.setLocationRelativeTo(null);
```
**Frame Loaction Set :**
```java
frame.setLocation(2, 200);
// 2 px in left and 200 in top.
```

**Location and Height-Width :**
```java
frame.setBonds(2,200 , 600 , 500);
// 2 px left , 200 px top ,600 px width , 500 px height 
```

**Frame create using inheritance :**
```java
import javax.swing.JFrame;

public class Frame extends JFrame{
    // Inharit JFrame into Frame
    public static void main(String[] args) {
        Frame frame = new Frame();  // Creating JFrame Object
        
        frame.setVisible(true);     // Make visible this frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                      // For exit code in press cross button
        frame.setBounds(2,200 , 600 , 600);

        frame.setResizable(false);   // Make not resizeable . Default is true
        frame.setTitle("This is Title");
    }
}
```


**Frame create using constructor :**
```java
import javax.swing.JFrame;

public class Frame extends JFrame{
    // Inharit JFrame into Frame
    Frame(){
        setVisible(true);     // Make visible this frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                      // For exit code in press cross button
        setBounds(2,200 , 600 , 600);

        setResizable(false);   // Make not resizeable . Default is true
        setTitle("This is Title");
    }


    public static void main(String[] args) {
        Frame frame = new Frame();  // Creating JFrame Object           
    }
}
```


**JFrame set Image Icon using constructor :**
```java
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class IconDemo extends JFrame{
    private ImageIcon icon; // Initializing image icon variable

    IconDemo(){
        intiComonents();    // Initializing a method

        setVisible(true);
        setDefaultCloseOperation(IconDemo.EXIT_ON_CLOSE);
        setBounds(200, 50 , 400 , 300);
    }

    public void intiComonents(){    // Method Body
        icon = new ImageIcon("icon.jpg");   // Set image on icon variable
        this.setIconImage(icon.getImage()); // Set image as icon
    }

    public static void main(String[] args) {
        IconDemo frame = new IconDemo();
    }
}
```


**JFrame Background Color :**
```java
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setBounds(100, 100, 600, 600);

Container c = frame.getContentPane();
c.setBackground(java.awt.Color.RED);
```


### JLable :
**Add Text :**
```java
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {

    private Container c;    // Declear a Container variable
    private JLabel userlabel;   // Declear a JLabel variable

    Frame(){    // Constructor
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 300);
        setTitle("Label Example");
    }

    public void init(){
        c = this.getContentPane();  // Import contant panel in c
        c.setBackground(Color.YELLOW);
        c.setLayout(null);  // Make layout null for create layout by myself

        userlabel = new JLabel();   // Assigned a JLabel variable
        // userlabel = new Jlabel("Hello I am MD Rijoan Maruf"); --> Will do same as setText();
        userlabel.setText("Hello I am MD Rijoan Maruf");
        userlabel.setBounds(10,10,220,50);  // Set this label Position, height, width


        c.add(userlabel);   // Add in container
    }
    public static void main(String[] args) {
        Frame frame = new Frame();  
    }
}
```

**Font size & Font Style :**

```java
// Declear in class
private Font myFont;

// In method :
    myFont = new Font("Arial", Font.BOLD , 15); // Initializing a method.
    // Name , Style , FontSize

    // Add in Jlabel
    myLabel.setFont(myFont);
```


**Color :**
```java
myLabel.setForeground(Color.RED);
```

**Background Color :**
```java
userLabel.setOpaque(true); // For set background Method
userLabel.setBackground(Color.YELLOW)
```


**setToolTipText :**
```java
myLabel.setToolTipText("Hi");
```

**getToolTipText :**
```java
String s1 = myLabel.getToolTipText("Hi");
// Import ToolTipText and assigned into S1
```

**getText :**
Import text from JLabel.
```java
String s2 = userLabel.getText();
// Import text from userLabel and assigned in s2
```


**ImageIcon() :**
```java
import javax.swing.*;
import java.awt.*;

public class SwingImageExample extends JFrame {
    public SwingImageExample() {
        // Set the title of the JFrame
        setTitle("Java Swing Image Example");

        // Create a JLabel to hold the image
        JLabel label = new JLabel();

        // Load the image from file (adjust the path accordingly)
        ImageIcon icon = new ImageIcon("path/to/your/image.jpg");

        // Set the icon on the JLabel
        label.setIcon(icon);

        // Add the JLabel to the JFrame
        add(label);

        // Set the layout manager to BorderLayout (or any other layout manager you prefer)
        setLayout(new BorderLayout());

        // Set default close operation and size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the JFrame on the screen

        // Make the JFrame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI code on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new SwingImageExample());
    }
}
```

### JTextField() :
```java
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

// Frame class extending JFrame for creating a GUI window
public class Frame extends JFrame{
   private JLabel myLabel;
   private Container c;
   private JTextField firstName, lastName;

   // Constructor for the Frame class
   Frame(){
      initializeComponent();
   }

   // Method to initialize and set up the components of the GUI
   public void initializeComponent(){
      // Get the content pane of the JFrame
      c = this.getContentPane();
      // Set layout to null for absolute positioning
      c.setLayout(null);
      // Set background color to gray
      c.setBackground(java.awt.Color.GRAY);

      // Create and set up the first name text field
      firstName = new JTextField();
      firstName.setBounds(20, 30, 200, 50);

      // Create and set up the last name text field with default value
      lastName = new JTextField("Md Rijoan Maruf");
      lastName.setBounds(20, 100, 200, 50);

      // Add text fields to the content pane
      c.add(firstName);
      c.add(lastName);
   }

   // Main method to test the Frame class
   public static void main(String[] args) {
      // Create an instance of the Frame class
      Frame f1 = new Frame();
      // Set default close operation, size, visibility, and title of the window
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setBounds(100, 50, 500, 500);
      f1.setVisible(true);
      f1.setTitle("Text Field Example");
   }
}
```

**Font set in the JTextField :**
```java
JTextField firstName = new JTextField();
Font myFont = new Font("Arial" , Font.BOLD , 20);
Font myFont2 = new Font("Arial" , Font.BOLD + Font.ITALIC, 20); // Italic + Bold
firstName.setFont(myFont);
```

**setForeground() , setBackground() in JTextField :**
```java
JTextField firstName = new JTextField();
firstName.setForeground(java.awt.Color.RED);    // Set font color RED
firstName.setBackground(java.awt.Color.YELLOW); // Set textField Background Color YELLOW
```

**JTextField alignment :**
```java
JTextFiled firstName = new JTextField();
firstName.setHorizontalAlignment(JTextField.RIGHT); 
// Input recived in the text field
```

**JTextField Action Listener :**

```java
JTextField firstName = new JTextField();
JTextField lastName = new JTextFirld();

firstName.addActionListener(new ActionListener() { // Create new action listner for firstname JTextField
    public void actionPerformed(ActionEvent e){  // Create action permord function
    String s1 = firstName.getText();

    // Action
    if (s1.isEmpty()) {
        JOptionPane.showMessageDialog(null, "You Didn't Enter anything.");
    }
    else{
        JOptionPane.showMessageDialog(null, "Your First Name : " + s1);
    }
    }
});

lastName.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent f){
    String s2 = lastName.getText();
    if(s2.isEmpty()){
        JOptionPane.showMessageDialog(null , "You Didn't Enter anything!");
    }

    else{
        JOptionPane.showMessageDialog(null, "Your Last Name :" + s2);
    }
    }

});
```


**JPasswordField() :**

```java
JPasswordField pass1 = new JPasswordField();
```

We can change password show type :

```java
JPasswordField pass1 = new JPasswordField();
pass1.setEchoChar('#'); // change password showtype to #
```


**JButton() :**
As like JPasswordField and JTextField.
```java
JButton btn1 = new JButton("Submit");
```



### Create cursor :
```java
JButton btn1 = new JButton("Submit");
Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
btn1.setCoursor(coursor1);
```

**Set Imaage on JButton :**
```java
ImageIcon img1 = new ImageIcon(getClass().getResource("login.jpg"));
JButton btn1 = new JButton(img1);
```

**JButton Action Listener :**
```java
// Button Action Listner
btn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        tf.setText("");
    }
});
```
**Output** : When we click clear button the text field text replace with "" . Thant means the text field will be clear.


**Example Full Code :**
```java
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Fram2 extends JFrame{
    // Declearing variable 
    private Container c;
    private JTextField tf;
    private JButton btn;

    // Default Constructor
    Fram2(){
        // Call a Method
        initializeComponent();
    }

    // Method
    public void initializeComponent(){
        // Creating Container
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        // Creating text field & add into the container
        tf = new JTextField();
        tf.setBounds(20 , 20 , 300, 30);
        c.add(tf);

        // Creating button & add into the container
        btn = new JButton("Clear");
        btn.setBounds(20,70,100,30);
        c.add(btn);

        // Button Action Listner
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("");
            }
        });
        // Output : When we click clear button the text field text replace with "" . Thant means the text field will be clear.
    }

    public static void main(String[] args) {
        // Creating Fram2 Object
        Fram2 newFrame = new Fram2();

        // Create a basic frame
        newFrame.setVisible(true);
        newFrame.setDefaultCloseOperation(Fram2.EXIT_ON_CLOSE);
        newFrame.setBounds(50 , 50 , 500 , 500);
        newFrame.setTitle("JButton Action Listner");
    }
}
```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```




```java

```



