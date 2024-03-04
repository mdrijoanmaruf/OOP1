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



```java

```



```java

```



```java

```



```java

```


