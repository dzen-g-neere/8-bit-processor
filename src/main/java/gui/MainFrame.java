package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private RegisterGUI ACGUI;
    private JLabel ACGUILabel;

    private RegisterGUI BRGUI;
    private JLabel BRGUILabel;

    private RegisterGUI DRGUI;
    private JLabel DRGUILabel;

    private RegisterGUI CRGUI;
    private JLabel CRGUILabel;

    private RegisterGUI IPGUI;
    private JLabel IPGUILabel;

    private RegisterGUI ARGUI;
    private JLabel ARGUILabel;

    private RAMGUI memoryGUI;

    private ALUGUI aluGUI;
    private JLabel aluGUILabel;

    private GateGUI A1GUI;
    private GateGUI A2GUI;
    private GateGUI B1GUI;
    private GateGUI B2GUI;
    private GateGUI C1GUI;
    private GateGUI C2GUI;
    private GateGUI D1GUI;
    private GateGUI D2GUI;
    private GateGUI MDGUI;
    private GateGUI I1GUI;
    private GateGUI I2GUI;
    private GateGUI R1GUI;
    private GateGUI R2GUI;
    private JButton runBtn;

    public MainFrame(RegisterGUI ac, RegisterGUI br, RegisterGUI dr, RegisterGUI cr, RegisterGUI ar, RegisterGUI ip, RAMGUI ram, ALUGUI alu, GateGUI a1, GateGUI a2, GateGUI b1, GateGUI b2, GateGUI c1, GateGUI c2, GateGUI d1, GateGUI d2, GateGUI md, GateGUI i1, GateGUI i2, GateGUI r1, GateGUI r2, JButton runButton) {
        setTitle("8-bit-processor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setResizable(false);
        getContentPane().setBackground(Color.decode("#009999"));
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

        ACGUI = ac;
        add(ACGUI);

        ACGUILabel = new JLabel("AC");
        ACGUILabel.setSize(20, 20);
        ACGUILabel.setLocation(190, 45);
        add(ACGUILabel);


        BRGUI = br;
        add(BRGUI);

        BRGUILabel = new JLabel("BR");
        BRGUILabel.setSize(20, 20);
        BRGUILabel.setLocation(190, 145);
        add(BRGUILabel);


        DRGUI = dr;
        add(DRGUI);

        DRGUILabel = new JLabel("DR");
        DRGUILabel.setSize(20, 20);
        DRGUILabel.setLocation(570, 45);
        add(DRGUILabel);


        CRGUI = cr;
        add(CRGUI);

        CRGUILabel = new JLabel("CR");
        CRGUILabel.setSize(20, 20);
        CRGUILabel.setLocation(590, 145);
        add(CRGUILabel);


        IPGUI = ip;
        add(IPGUI);

        IPGUILabel = new JLabel("IP");
        IPGUILabel.setSize(20, 20);
        IPGUILabel.setLocation(590, 245);
        add(IPGUILabel);


        ARGUI = ar;
        add(ARGUI);

        ARGUILabel = new JLabel("AR");
        ARGUILabel.setSize(20, 20);
        ARGUILabel.setLocation(610, 585);
        add(ARGUILabel);


        memoryGUI = ram;
        add(memoryGUI);

        aluGUI = alu;
        add(aluGUI);

        aluGUILabel = new JLabel("ALU");
        aluGUILabel.setSize(30, 20);
        aluGUILabel.setLocation(385, 325);
        add(aluGUILabel);


        A1GUI = a1;
        A1GUI.setVisible(true);
        add(A1GUI);

        A2GUI = a2;
        A2GUI.setVisible(true);
        add(A2GUI);

        B1GUI = b1;
        B1GUI.setVisible(true);
        add(B1GUI);

        B2GUI = b2;
        B2GUI.setVisible(true);
        add(B2GUI);

        C1GUI = c1;
        C1GUI.setVisible(true);
        add(C1GUI);

        C2GUI = c2;
        C2GUI.setVisible(true);
        add(C2GUI);

        D1GUI = d1;
        D1GUI.setVisible(true);
        add(D1GUI);

        D2GUI = d2;
        D2GUI.setVisible(true);
        add(D2GUI);

        I1GUI = i1;
        I1GUI.setVisible(true);
        add(I1GUI);

        I2GUI = i2;
        I2GUI.setVisible(true);
        add(I2GUI);

        R1GUI = r1;
        R1GUI.setVisible(true);
        add(R1GUI);

        R2GUI = r2;
        R2GUI.setVisible(true);
        add(R2GUI);

        MDGUI = md;
        MDGUI.setVisible(true);
        add(MDGUI);

        runBtn = runButton;
        add(runBtn);

    }

}
