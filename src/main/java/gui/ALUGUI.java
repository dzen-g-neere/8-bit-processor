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
