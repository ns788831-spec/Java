import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentRegisterationForm {
    public static void main(String[] args){
        JFrame frame = new JFrame("Student Registration Form");
        frame.setLayout(new GridLayout(4, 1, 10, 10));
        JLabel label = new JLabel("Welcome to Student Registration!", JLabel.CENTER);

        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField(20);


        frame.add(label);
        frame.add(nameLabel);
        frame.add(nameField);

        frame.setSize(1000, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}