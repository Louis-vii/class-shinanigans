package src;

import javax.swing.*;
public class gayblackman {
    public static void main(String[] args) {
     
        String name =JOptionPane.showInputDialog
        ("  hello");
      while(name.isBlank()) 
      name = JOptionPane.showInputDialog("hello");
        
        JOptionPane.showMessageDialog
        (null, "now I tell ya what  "+ name);
        JOptionPane.showMessageDialog
        (null,"I ilke ya");
        JOptionPane.showMessageDialog
        (null, "and i want ya ");

    JOptionPane.showMessageDialog
    (null,"now we can do this the easy way ");
    JOptionPane.showMessageDialog
    (null, "or the hard way");
    JOptionPane.showMessageDialog
    (null,"the choice is yours");

   int choise = JOptionPane.showConfirmDialog(null, "so what is going to be "+name );

if (choise == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Now give me that booty  ");
}
else 
    JOptionPane.showMessageDialog(null, "i see you choosing the hard way ");
    

    }
}    

