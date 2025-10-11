package src;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args)  {

double x; 
double y; 
double z; 

x = Double.parseDouble(JOptionPane.showInputDialog("x="));

z = Double.parseDouble(JOptionPane.showInputDialog("z="));

y = Double.parseDouble(JOptionPane.showInputDialog("y="));

if (x>y && x>z) {
    JOptionPane.showMessageDialog(null, "the largest is x= "+x);
}
else{
    if (y>x && y>z)
JOptionPane.showMessageDialog(null, "the largest is y= "+y);

else
    if (z>x && z>y)
    JOptionPane.showMessageDialog(null, "the largest is z= "+z);
}



}
}

