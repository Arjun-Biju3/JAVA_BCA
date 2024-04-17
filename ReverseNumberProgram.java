import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberProgram extends JFrame implements ActionListener {

    private JTextField inputField;
    private JTextField outputField;
    private JButton reverseButton;

    public ReverseNumberProgram() {
        // Set up the frame
        setTitle("Reverse Number Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create the input field
        inputField = new JTextField(10);
        inputField.addActionListener(this);

        // Create the output field
        outputField = new JTextField(10);
        outputField.setEditable(false);

        // Create the reverse button
        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);

        // Add the components to the frame
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Enter an integer:"));
        panel.add(inputField);
        panel.add(new JLabel("Reverse integer:"));
        panel.add(outputField);
        panel.add(reverseButton);
        add(panel);

        // Show the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inputField || e.getSource() == reverseButton) {
            // Get the input value
            int inputValue = Integer.parseInt(inputField.getText());

            // Reverse the input value
            int reversedValue = 0;
            while (inputValue != 0) {
                int digit = inputValue % 10;
                reversedValue = reversedValue * 10 + digit;
                inputValue /= 10;
            }

            // Display the reversed value
            outputField.setText(Integer.toString(reversedValue));
        }
    }

    public static void main(String[] args) {
        new ReverseNumberProgram();
    }
}
