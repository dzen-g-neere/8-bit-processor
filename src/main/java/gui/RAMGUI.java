package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
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
            registerGUIS[i].setLocation(50, 5 + 35 * (i + 1));
            add(registerGUIS[i]);
            if (i == 0) {
                registerGUILabels[i] = new JLabel("v");
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
            registerGUILabels[i].setLocation(20, 5 + 35 * (i + 1));
            if (i <= 10) {
                registerGUILabels[i].setFont(new Font("SansSerif", Font.BOLD, 16));
            } else {
                registerGUILabels[i].setFont(new Font("SansSerif", Font.BOLD, 15));
            }
            registerGUILabels[i].setBorder(new LineBorder(Color.black, 1));
            add(registerGUILabels[i]);
        }
    }
}
