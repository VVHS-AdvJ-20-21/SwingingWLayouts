import javax.swing.*;
import java.awt.*;

public class Main
{
  public static void main(String args[])
  {
    JFrame frm1 = new JFrame ("This frame has layouts");
    frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm1.setSize(400, 600);

    //----------Panel 1 with two buttons ---------------------
    JPanel pnl1 = new JPanel(new GridLayout(2,2, 10, 10));
    JButton btn1 = new JButton ("Click Me First");
    JButton btn2 = new JButton ("Or Else Click Me");
    JLabel lbl1 = new JLabel("Enter text");
    JTextField tf1 = new JTextField(10); //  accept up to 10 characters

    pnl1.add(btn1);
    pnl1.add(btn2);
    pnl1.add(lbl1);
    pnl1.add(tf1);


    /*-----------------Panel 2 with a text field--------------
    JPanel pnl2 = new JPanel(new BorderLayout(10, 10));
    JLabel lbl1 = new JLabel("Enter text");
    JTextField tf1 = new JTextField(10); //  accept up to 10 characters

    pnl2.add(lbl1);
    pnl2.add(tf1);

  */

    frm1.getContentPane().add(BorderLayout.NORTH, pnl1); 
    //frm1.getContentPane().add(BorderLayout.CENTER, pnl2);
    //BorderLayout uses the awt import

    frm1.setVisible(true);
  }//end main method

}//end Main class