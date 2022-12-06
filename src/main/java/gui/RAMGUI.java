package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class RAMGUI extends JPanel {

    private RegisterGUI[] registerGUIS;
    private JLabel[] registerGUILabels;

    public RAMGUI() {
        setSize(180, 600);
        setLayout(null);
        setBorder(new LineBorder(Color.black, 1));
        registerGUIS = new RegisterGUI[17];
        registerGUILabels = new JLabel[17];

        for (int i = 0; i < 17; i++) {
            registerGUIS[i] = new RegisterGUI();
            registerGUIS[i].setLocation(50, 5 + 35 * i);
            add(registerGUIS[i]);
            if (i == 0) {
                registerGUILabels[i] = new JLabel("v");
                registerGUIS[i].registerField.setBackground(Color.getHSBColor(40, 35, 20));
            } else if (i <= 10) {
                registerGUILabels[i] = new JLabel(i - 1 + "");
            }
            switch (i) {
                case 11:
                    registerGUILabels[i] = new JLabel("A");
                    break;
                case 12:
                    registerGUILabels[i] = new JLabel("B");
                    break;
                case 13:
                    registerGUILabels[i] = new JLabel("C");
                    break;
                case 14:
                    registerGUILabels[i] = new JLabel("D");
                    break;
                case 15:
                    registerGUILabels[i] = new JLabel("E");
                    break;
                case 16:
                    registerGUILabels[i] = new JLabel("F");
                    break;
            }
            registerGUILabels[i].setSize(20, 30);
            registerGUILabels[i].setLocation(20, 5 + 35 * i);
            if (i <= 10) {
                registerGUILabels[i].setFont(new Font("SansSerif", Font.BOLD, 16));
            } else {
                registerGUILabels[i].setFont(new Font("SansSerif", Font.BOLD, 15));
            }
            registerGUILabels[i].setBorder(new LineBorder(Color.black, 1));
            add(registerGUILabels[i]);
        }
    }

    public void changeValues (byte[] value, ArrayList<byte[]> memory) {
        String temp = "";
        for (int i = 0; i < value.length; i++) {
            if (i == value.length - 1) {
                temp += value[i];
            } else {
                temp += value[i] + " ";
            }
        }
        registerGUIS[0].registerField.setText(temp);
        String temp2;
        for (int i = 0; i < memory.size(); i++) {
            temp2 = "";
            for (int j = 0; j < memory.get(i).length; j++) {
                if (j == memory.get(i).length - 1) {
                    temp2 += memory.get(i)[j];
                } else {
                    temp2 += memory.get(i)[j] + " ";
                }
            }
            registerGUIS[i + 1].registerField.setText(temp2);
        }
    }
}
