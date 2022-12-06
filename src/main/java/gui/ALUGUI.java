package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ALUGUI extends JPanel {
    private RegisterGUI input1;
    private RegisterGUI input2;
    private RegisterGUI output;

    public ALUGUI () {
        setSize(250, 100);
        setLayout(null);
        setBorder(new LineBorder(Color.black, 1));
        input1 = new RegisterGUI();
        input1.setInputF('t');
        input1.setLocation(10, 10);
        add(input1);

        input2 = new RegisterGUI();
        input2.setInputF('t');
        input2.setLocation(140, 10);
        add(input2);

        output = new RegisterGUI();
        output.setOutputF('b');
        output.setLocation(75, 60);
        add(output);
    }
    // 275 300
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.drawLine(275, 300, 525, 300);
        g2.drawLine(325, 100, 425, 100);
        g2.drawLine(275, 300, 325, 400);
        g2.drawLine(525, 300, 425, 400);
    }

    public RegisterGUI getInput1() {
        return input1;
    }

    public RegisterGUI getInput2() {
        return input2;
    }

    public RegisterGUI getOutput() {
        return output;
    }
}
