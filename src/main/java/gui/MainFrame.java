package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private RegisterGUI ACGUI;
    private RegisterGUI BRGUI;
    private RegisterGUI DRGUI;
    private RegisterGUI CRGUI;
    private RegisterGUI IPGUI;
    private RegisterGUI ARGUI;
    private RAMGUI memoryGUI;
    public MainFrame() {
        setTitle("8-bit-processor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

        ACGUI = new RegisterGUI();
        ACGUI.setLocation(150, 70);
        ACGUI.setVisible(true);
        add(ACGUI);

        BRGUI = new RegisterGUI();
        BRGUI.setLocation(150, 170);
        BRGUI.setVisible(true);
        add(BRGUI);

        DRGUI = new RegisterGUI();
        DRGUI.setLocation(550, 70);
        DRGUI.setVisible(true);
        add(DRGUI);

        CRGUI = new RegisterGUI();
        CRGUI.setLocation(550, 170);
        CRGUI.setVisible(true);
        add(CRGUI);

        IPGUI = new RegisterGUI();
        IPGUI.setLocation(550, 270);
        IPGUI.setVisible(true);
        add(IPGUI);

        ARGUI = new RegisterGUI();
        ARGUI.setLocation(570, 400);
        ARGUI.setVisible(true);
        add(ARGUI);

        memoryGUI = new RAMGUI();
        memoryGUI.setLocation(800, 50);
        memoryGUI.setVisible(true);
        add(memoryGUI);
    }

}
