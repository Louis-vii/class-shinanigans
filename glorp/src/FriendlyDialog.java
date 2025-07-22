import javax.swing.*;

public class FriendlyDialog {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Hello! What is your name?");
        JOptionPane.showMessageDialog(null, "Nice to meet you, " + name + "!");
        JOptionPane.showMessageDialog(null, "Hope you're having a great day!");

        int choice = JOptionPane.showConfirmDialog(
            null,
            "Would you like to continue our chat, " + name + "?"
        );

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Great!");
        } else {
            JOptionPane.showMessageDialog(null, "eat ball ");
}
    }
}