import javax.swing.*;
import java.awt.*;

public class Main
{
  public static void main(String args[])
  {
    JFrame frm1 = new JFrame ("This frame has layouts");
    frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm1.setSize(650, 600);

    //----------Panel 1 with two buttons, label and text field ---------------------
    JPanel pnl1 = new JPanel(new GridLayout(2,3, 20, 20));
    
    JButton btn1 = new JButton ("Click Me First");
    JButton btn2 = new JButton ("Or Else Click Me");
    JLabel lbl1 = new JLabel("Back to just some label");
    JTextField tf1 = new JTextField(10); //  accept up to 10 characters

    pnl1.add(lbl1);
    pnl1.add(btn1);
    pnl1.add(btn2);
   
    pnl1.add(tf1);


    //-----------------Panel 2 with a text field--------------
    JPanel pnl2 = new JPanel(new BorderLayout(10, 10));
    
    // JTextField tf1 = new JTextField(10); //  accept up to 10 characters
    ImageIcon duckIcon = new ImageIcon("duckicon.jpg", "a little duck in water");
    JLabel lblpic = new JLabel(duckIcon);

    pnl2.add(lblpic);
    //pnl2.add(tf1);

  

    frm1.getContentPane().add(BorderLayout.NORTH, pnl1); 
    frm1.getContentPane().add(BorderLayout.CENTER, pnl2);
    //BorderLayout uses the awt import

    frm1.setVisible(true);
  }//end main method

}//end Main class