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
    private GateGUI DMGUI;
    private GateGUI I1GUI;
    private GateGUI I2GUI;
    private GateGUI R1GUI;
    private GateGUI R2GUI;
    private JButton runBtn;

    public MainFrame() {
        setTitle("8-bit-processor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setResizable(false);
        getContentPane().setBackground(Color.getHSBColor(82, 100, 55));
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

        ACGUI = new RegisterGUI();
        ACGUI.setInputF('l');
        ACGUI.setOutputF('r');
        ACGUI.setLocation(150, 70);
        ACGUI.setVisible(true);
        add(ACGUI);

        ACGUILabel = new JLabel("AC");
        ACGUILabel.setSize(20, 20);
        ACGUILabel.setLocation(190, 45);
        add(ACGUILabel);


        BRGUI = new RegisterGUI();
        BRGUI.setInputF('l');
        BRGUI.setOutputF('r');
        BRGUI.setLocation(150, 170);
        BRGUI.setVisible(true);
        add(BRGUI);

        BRGUILabel = new JLabel("BR");
        BRGUILabel.setSize(20, 20);
        BRGUILabel.setLocation(190, 145);
        add(BRGUILabel);


        DRGUI = new RegisterGUI();
        DRGUI.setInputF('r');
        DRGUI.setOutputF('l');
        DRGUI.setLocation(550, 70);
        DRGUI.setVisible(true);
        add(DRGUI);

        DRGUILabel = new JLabel("DR");
        DRGUILabel.setSize(20, 20);
        DRGUILabel.setLocation(570, 45);
        add(DRGUILabel);


        CRGUI = new RegisterGUI();
        CRGUI.setInputF('r');
        CRGUI.setOutputF('l');
        CRGUI.setLocation(550, 170);
        CRGUI.setVisible(true);
        add(CRGUI);

        CRGUILabel = new JLabel("CR");
        CRGUILabel.setSize(20, 20);
        CRGUILabel.setLocation(590, 145);
        add(CRGUILabel);


        IPGUI = new RegisterGUI();
        IPGUI.setInputF('r');
        IPGUI.setOutputF('l');
        IPGUI.setLocation(550, 270);
        IPGUI.setVisible(true);
        add(IPGUI);

        IPGUILabel = new JLabel("IP");
        IPGUILabel.setSize(20, 20);
        IPGUILabel.setLocation(590, 245);
        add(IPGUILabel);


        ARGUI = new RegisterGUI();
        ARGUI.setInputF('l');
        ARGUI.setOutputF('r');
        ARGUI.setLocation(570, 610);
        ARGUI.setVisible(true);
        add(ARGUI);

        ARGUILabel = new JLabel("AR");
        ARGUILabel.setSize(20, 20);
        ARGUILabel.setLocation(610, 585);
        add(ARGUILabel);


        memoryGUI = new RAMGUI();
        memoryGUI.setLocation(800, 50);
        memoryGUI.setVisible(true);
        add(memoryGUI);

        aluGUI = new ALUGUI();
        aluGUI.setLocation(275, 350);
        aluGUI.setVisible(true);
        add(aluGUI);

        aluGUILabel = new JLabel("ALU");
        aluGUILabel.setSize(30, 20);
        aluGUILabel.setLocation(385, 325);
        add(aluGUILabel);


        A1GUI = new GateGUI(aluGUI.getOutput(), ACGUI, aluGUI);
        A1GUI.setVisible(true);
        add(A1GUI);

        A2GUI = new GateGUI(ACGUI, aluGUI.getInput1(), aluGUI);
        A2GUI.setVisible(true);
        add(A2GUI);

        B1GUI = new GateGUI(aluGUI.getOutput(), BRGUI, aluGUI);
        B1GUI.setVisible(true);
        add(B1GUI);

        B2GUI = new GateGUI(BRGUI, aluGUI.getInput1(), aluGUI);
        B2GUI.setVisible(true);
        add(B2GUI);

        C1GUI = new GateGUI(aluGUI.getOutput(), CRGUI, aluGUI);
        C1GUI.setVisible(true);
        add(C1GUI);

        C2GUI = new GateGUI(CRGUI, aluGUI.getInput2(), aluGUI);
        C2GUI.setVisible(true);
        add(C2GUI);

        D1GUI = new GateGUI(aluGUI.getOutput(), DRGUI, aluGUI);
        D1GUI.setVisible(true);
        add(D1GUI);

        D2GUI = new GateGUI(DRGUI, aluGUI.getInput2(), aluGUI);
        D2GUI.setVisible(true);
        add(D2GUI);

        I2GUI = new GateGUI(IPGUI, aluGUI.getInput2(), aluGUI);
        I2GUI.setVisible(true);
        add(I2GUI);

        R1GUI = new GateGUI(aluGUI.getOutput(), ARGUI, aluGUI);
        R1GUI.setVisible(true);
        add(R1GUI);

        R2GUI = new GateGUI(ARGUI);
        R2GUI.setVisible(true);
        add(R2GUI);

        MDGUI = new GateGUI(DRGUI);
        MDGUI.setVisible(true);
        add(MDGUI);

        runBtn = new JButton("Run");
        runBtn.setSize(150, 50);
        runBtn.setLocation(0, this.getHeight() - 85);
        runBtn.setVisible(true);
        runBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(runBtn);

    }

}
