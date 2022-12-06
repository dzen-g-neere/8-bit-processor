package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RegisterGUI extends JPanel {
    public JTextField registerField;
    private char inputF;
    private char outputF;
    private int xOffset;
    private int yOffset;
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

    public void setInputF(char inputF) {
        this.inputF = inputF;
    }

    public void setOutputF(char outputF) {
        this.outputF = outputF;
    }

    public char getInputF() {
        return inputF;
    }

    public char getOutputF() {
        return outputF;
    }

    public int getxOffset() {
        return xOffset;
    }

    public int getyOffset() {
        return yOffset;
    }

    public void setxOffset(int xOffset) {
        this.xOffset = xOffset;
    }

    public void setyOffset(int yOffset) {
        this.yOffset = yOffset;
    }

    public void setValue(String value) {
        this.registerField.setText(value);
    }

}
