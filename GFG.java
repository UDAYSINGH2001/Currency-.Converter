import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GFG {
  
    // Function to convert from rupee
    // to the dollar and Japanese Yen
    // using Java Swing
    public static void converter()
    {
  
        // Creating a new frame using JFrame
        JFrame f = new JFrame("......CurrencyConverter......");
  
        // Creating two labels
        JLabel l1, l2,l3;
  
        // Creating two text fields.
        // One for rupee and one for
        // the dollar
        JTextField t1,t2,t3;
  
        // Creating three buttons
        JButton b1,b2,b3,b4;
  
        // Naming the labels and setting
        // the bounds for the labels
        l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 60, 30);
        l2 = new JLabel("Dollars:");
        l2.setBounds(260, 40, 60, 30);
        l3 = new JLabel("Japanese Yen:");
        l3.setBounds(480, 40, 60, 30);
  
        // Initializing the text fields with
        // 0 by default and setting the
        // bounds for the text fields
        t1 = new JTextField("0");
        t1.setBounds(80, 40, 120, 30);
        t2 = new JTextField("0");
        t2.setBounds(320, 40, 120, 30);
        t3 = new JTextField("0");
        t3.setBounds(560, 40, 120, 30);
  
        // Creating a button for INR,
        // one button for the dollar
        // and one button to close
        // and setting the bounds
        b1 = new JButton("INR");
        b1.setBounds(80, 80, 120, 15);
        b2 = new JButton("Dollar");
        b2.setBounds(320, 80, 120, 15);
        b4 = new JButton("Japanese Yen");
        b4.setBounds(560, 80, 120, 15);
        b3 = new JButton("Close");
        b3.setBounds(320, 320, 80, 30);
  
        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d
                    = Double.parseDouble(t1.getText());
  
                // Converting rupees to dollars
                double d1 = (d / 75.58);
                double d2 = (d*1.50);
                 
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
               String str2 = String.valueOf(d2);
  
                // Placing it in the text box
                t2.setText(str1);
t3.setText(str2);
            }
        });
  
        // Adding action listener
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                    = Double.parseDouble(t2.getText());
  
                // converting Dollars to rupees
                double d3 = (d2 * 75.58);
                double d1=(d2*115);
  
                // Getting the string value of the
                // calculated value
                String str2 = String.valueOf(d3);
String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t1.setText(str2);
t3.setText(str1);
            }
        });
b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                    = Double.parseDouble(t3.getText());
  
                // converting Dollars to rupees
                double d3 = (d2 *0.0088);
                double d1 = (d2 *0.66);

  
                // Getting the string value of the
                // calculated value
                String str2 = String.valueOf(d3);
String str3 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str2);
t1.setText(str3);
            }
        });
  
        // Action listener to close the form
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        // Adding the created objects
        // to the form
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3); 
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
  
        f.setLayout(null);
        f.setSize(800, 600);
        f.setVisible(true);
    }
  
    // Driver code
    public static void main(String args[])
    {
        converter();
    }
}