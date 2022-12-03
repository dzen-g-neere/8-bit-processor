package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RegisterGUI extends JPanel {
    public JTextField registerField;
    public RegisterGUI(String registerInput) {
        setSize(100, 30);
        setLayout(null);
        registerField = new JTextField(registerInput);
        registerField.setEditable(false);
        registerField.setFont(new Font("SansSerif", Font.BOLD, 14));
        registerField.setBounds(0, 0, 150, 30);
        add(registerField);
    }
    public RegisterGUI() {
        setSize(100, 30);
        setLayout(null);
        registerField = new JTextField("0 0 0 0 0 0 0 0");
        registerField.setEditable(false);
        registerField.setLayout(null);
        registerField.setFont(new Font("SansSerif", Font.BOLD, 14));
        registerField.setBorder(new LineBorder(Color.black, 1));
        registerField.setBounds(0, 0, 100, 30);
        add(registerField);
    }
    public void changeValue(String value) {
        this.registerField.setText(value);
    }

}
