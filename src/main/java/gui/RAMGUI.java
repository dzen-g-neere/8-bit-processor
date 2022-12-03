package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RAMGUI extends JPanel {
    private RegisterGUI value;
    private JLabel valueLabel;

    private RegisterGUI mem0;
    private JLabel mem0Label;

    private RegisterGUI mem1;
    private JLabel mem1Label;

    private RegisterGUI mem2;
    private JLabel mem2Label;

    private RegisterGUI mem3;
    private JLabel mem3Label;

    private RegisterGUI mem4;
    private JLabel mem4Label;

    private RegisterGUI mem5;
    private JLabel mem5Label;

    private RegisterGUI mem6;
    private JLabel mem6Label;

    private RegisterGUI mem7;
    private JLabel mem7Label;

    private RegisterGUI mem8;
    private JLabel mem8Label;

    private RegisterGUI mem9;
    private JLabel mem9Label;

    private RegisterGUI mem10;
    private JLabel mem10Label;

    private RegisterGUI mem11;
    private JLabel mem11Label;

    private RegisterGUI mem12;
    private JLabel mem12Label;

    private RegisterGUI mem13;
    private JLabel mem13Label;

    private RegisterGUI mem14;
    private JLabel mem14Label;

    private RegisterGUI mem15;
    private JLabel mem15Label;
    public RAMGUI() {
        setSize(180, 600);
        setLayout(null);
        setBorder(new LineBorder(Color.black, 1));

        value = new RegisterGUI();
        value.setLocation(50, 5);
        add(value);
        valueLabel = new JLabel(" v");
        valueLabel.setSize(20, 30);
        valueLabel.setLocation(20, 5);
        valueLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        valueLabel.setBorder(new LineBorder(Color.black, 1));
        add(valueLabel);

        mem0 = new RegisterGUI();
        mem0.setLocation(50, 40);
        add(mem0);
        mem0Label = new JLabel(" 0");
        mem0Label.setSize(20, 30);
        mem0Label.setLocation(20, 40);
        mem0Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem0Label.setBorder(new LineBorder(Color.black, 1));

        add(mem0Label);

        mem1 = new RegisterGUI();
        mem1.setLocation(50, 75);
        add(mem1);
        mem1Label = new JLabel(" 1");
        mem1Label.setSize(20, 30);
        mem1Label.setLocation(20, 75);
        mem1Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem1Label.setBorder(new LineBorder(Color.black, 1));
        add(mem1Label);

        mem2 = new RegisterGUI();
        mem2.setLocation(50, 110);
        add(mem2);
        mem2Label = new JLabel(" 2");
        mem2Label.setSize(20, 30);
        mem2Label.setLocation(20, 110);
        mem2Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem2Label.setBorder(new LineBorder(Color.black, 1));
        add(mem2Label);

        mem3 = new RegisterGUI();
        mem3.setLocation(50, 145);
        add(mem3);
        mem3Label = new JLabel(" 3");
        mem3Label.setSize(20, 30);
        mem3Label.setLocation(20, 145);
        mem3Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem3Label.setBorder(new LineBorder(Color.black, 1));
        add(mem3Label);

        mem4 = new RegisterGUI();
        mem4.setLocation(50, 180);
        add(mem4);
        mem4Label = new JLabel(" 4");
        mem4Label.setSize(20, 30);
        mem4Label.setLocation(20, 180);
        mem4Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem4Label.setBorder(new LineBorder(Color.black, 1));
        add(mem4Label);

        mem5 = new RegisterGUI();
        mem5.setLocation(50, 215);
        add(mem5);
        mem5Label = new JLabel(" 5");
        mem5Label.setSize(20, 30);
        mem5Label.setLocation(20, 215);
        mem5Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem5Label.setBorder(new LineBorder(Color.black, 1));
        add(mem5Label);

        mem6 = new RegisterGUI();
        mem6.setLocation(50, 250);
        add(mem6);
        mem6Label = new JLabel(" 6");
        mem6Label.setSize(20, 30);
        mem6Label.setLocation(20, 250);
        mem6Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem6Label.setBorder(new LineBorder(Color.black, 1));
        add(mem6Label);

        mem7 = new RegisterGUI();
        mem7.setLocation(50, 285);
        add(mem7);
        mem7Label = new JLabel(" 7");
        mem7Label.setSize(20, 30);
        mem7Label.setLocation(20, 285);
        mem7Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem7Label.setBorder(new LineBorder(Color.black, 1));
        add(mem7Label);

        mem8 = new RegisterGUI();
        mem8.setLocation(50, 320);
        add(mem8);
        mem8Label = new JLabel(" 8");
        mem8Label.setSize(20, 30);
        mem8Label.setLocation(20, 320);
        mem8Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem8Label.setBorder(new LineBorder(Color.black, 1));
        add(mem8Label);

        mem9 = new RegisterGUI();
        mem9.setLocation(50, 355);
        add(mem9);
        mem9Label = new JLabel(" 9");
        mem9Label.setSize(20, 30);
        mem9Label.setLocation(20, 355);
        mem9Label.setFont(new Font("SansSerif", Font.BOLD, 16));
        mem9Label.setBorder(new LineBorder(Color.black, 1));
        add(mem9Label);

        mem10 = new RegisterGUI();
        mem10.setLocation(50, 390);
        add(mem10);
        mem10Label = new JLabel(" A");
        mem10Label.setSize(20, 30);
        mem10Label.setLocation(20, 390);
        mem10Label.setFont(new Font("SansSerif", Font.BOLD, 15));
        mem10Label.setBorder(new LineBorder(Color.black, 1));
        add(mem10Label);

        mem11 = new RegisterGUI();
        mem11.setLocation(50, 425);
        add(mem11);
        mem11Label = new JLabel(" B");
        mem11Label.setSize(20, 30);
        mem11Label.setLocation(20, 425);
        mem11Label.setFont(new Font("SansSerif", Font.BOLD, 15));
        mem11Label.setBorder(new LineBorder(Color.black, 1));
        add(mem11Label);

        mem12 = new RegisterGUI();
        mem12.setLocation(50, 460);
        add(mem12);
        mem12Label = new JLabel(" C");
        mem12Label.setSize(20, 30);
        mem12Label.setLocation(20, 460);
        mem12Label.setFont(new Font("SansSerif", Font.BOLD, 15));
        mem12Label.setBorder(new LineBorder(Color.black, 1));
        add(mem12Label);

        mem13 = new RegisterGUI();
        mem13.setLocation(50, 495);
        add(mem13);
        mem13Label = new JLabel(" D");
        mem13Label.setSize(20, 30);
        mem13Label.setLocation(20, 495);
        mem13Label.setFont(new Font("SansSerif", Font.BOLD, 15));
        mem13Label.setBorder(new LineBorder(Color.black, 1));
        add(mem13Label);

        mem14 = new RegisterGUI();
        mem14.setLocation(50, 530);
        add(mem14);
        mem14Label = new JLabel(" E");
        mem14Label.setSize(20, 30);
        mem14Label.setLocation(20, 530);
        mem14Label.setFont(new Font("SansSerif", Font.BOLD, 15));
        mem14Label.setBorder(new LineBorder(Color.black, 1));
        add(mem14Label);

        mem15 = new RegisterGUI();
        mem15.setLocation(50, 565);
        add(mem15);
        mem15Label = new JLabel(" F");
        mem15Label.setSize(20, 30);
        mem15Label.setLocation(20, 565);
        mem15Label.setFont(new Font("SansSerif", Font.BOLD, 15));
        mem15Label.setBorder(new LineBorder(Color.black, 1));
        add(mem15Label);
    }
}
