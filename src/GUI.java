import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Hello! Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
        JOptionPane.showMessageDialog(null,age);

    }
}
