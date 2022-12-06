package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private RegisterGUI ACGUI;
    private RegisterGUI BRGUI;
    private RegisterGUI DRGUI;
    private RegisterGUI CRGUI;
    private RegisterGUI IPGUI;
    private RegisterGUI ARGUI;
    private RAMGUI memoryGUI;
    private ALUGUI aluGUI;
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
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

        ACGUI = new RegisterGUI();
        ACGUI.setInputF('l');
        ACGUI.setOutputF('r');
        ACGUI.setLocation(150, 70);
        ACGUI.setVisible(true);
        add(ACGUI);

        BRGUI = new RegisterGUI();
        BRGUI.setInputF('l');
        BRGUI.setOutputF('r');
        BRGUI.setLocation(150, 170);
        BRGUI.setVisible(true);
        add(BRGUI);

        DRGUI = new RegisterGUI();
        DRGUI.setInputF('r');
        DRGUI.setOutputF('l');
        DRGUI.setLocation(550, 70);
        DRGUI.setVisible(true);
        add(DRGUI);

        CRGUI = new RegisterGUI();
        CRGUI.setInputF('r');
        CRGUI.setOutputF('l');
        CRGUI.setLocation(550, 170);
        CRGUI.setVisible(true);
        add(CRGUI);

        IPGUI = new RegisterGUI();
        IPGUI.setInputF('r');
        IPGUI.setOutputF('l');
        IPGUI.setLocation(550, 270);
        IPGUI.setVisible(true);
        add(IPGUI);

        ARGUI = new RegisterGUI();
        ARGUI.setInputF('l');
        ARGUI.setOutputF('r');
        ARGUI.setLocation(570, 610);
        ARGUI.setVisible(true);
        add(ARGUI);

        memoryGUI = new RAMGUI();
        memoryGUI.setLocation(800, 50);
        memoryGUI.setVisible(true);
        add(memoryGUI);

        aluGUI = new ALUGUI();
        aluGUI.setLocation(275, 350);
        aluGUI.setVisible(true);
        add(aluGUI);

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
