
// Registers everywhere we need gates

import gui.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Processor {
    public static void main(String[] args) {
        Register ALU1 = new Register();
        ALURegister ALU2 = new ALURegister();
        ALUResultRegister ALU3 = new ALUResultRegister();

        ALU ALU = new ALU(ALU1, ALU2, ALU3);

        Register RAM1 = new Register();
        Register RAM2 = new Register();
        RAM RAM = new RAM(RAM1, RAM2);

        Register AC = new Register();
        Register DR = new Register();
        Register CR = new Register();
        Register IP = new Register();
        Register AR = new Register();
        Register BR = new Register();


        Gate A1 = new Gate(ALU3, AC);
        Gate A2 = new Gate(AC, ALU1);
        Gate B1 = new Gate(ALU3, BR);
        Gate B2 = new Gate(BR, ALU1);
        Gate C1 = new Gate(ALU3, CR);
        Gate C2 = new Gate(CR, ALU2);
        Gate D1 = new Gate(ALU3, DR);
        Gate D2 = new Gate(DR, ALU2);
        Gate MD = new Gate(RAM1, DR);
        Gate DM = new Gate(DR, RAM1);
        Gate M1 = new Gate(null, null); //Memory save
        Gate M2 = new Gate(null, null); //Memory load
        Gate I1 = new Gate(ALU3, IP);
        Gate I2 = new Gate(IP, ALU2);
        Gate R1 = new Gate(ALU3, AR);
        Gate R2 = new Gate(AR, RAM2);

        Microcontroller MCR = new Microcontroller(null);

        RegisterGUI ACGUI = new RegisterGUI();
        RegisterGUI BRGUI = new RegisterGUI();
        RegisterGUI DRGUI = new RegisterGUI();
        RegisterGUI CRGUI = new RegisterGUI();
        RegisterGUI IPGUI = new RegisterGUI();
        RegisterGUI ARGUI = new RegisterGUI();
        RAMGUI memoryGUI = new RAMGUI();
        ALUGUI aluGUI = new ALUGUI();
        GateGUI A1GUI;
        GateGUI A2GUI;
        GateGUI B1GUI;
        GateGUI B2GUI;
        GateGUI C1GUI;
        GateGUI C2GUI;
        GateGUI D1GUI;
        GateGUI D2GUI;
        GateGUI MDGUI;
        GateGUI I1GUI;
        GateGUI I2GUI;
        GateGUI R1GUI;
        GateGUI R2GUI;
        JButton runBtn;


        ACGUI.setInputF('l');
        ACGUI.setOutputF('r');
        ACGUI.setLocation(150, 70);
        ACGUI.setVisible(true);
        ACGUI.setxOffset(0);
        ACGUI.setyOffset(0);


        BRGUI.setInputF('l');
        BRGUI.setOutputF('r');
        BRGUI.setLocation(150, 170);
        BRGUI.setVisible(true);
        BRGUI.setxOffset(-5);
        BRGUI.setyOffset(-5);

        DRGUI.setInputF('r');
        DRGUI.setOutputF('l');
        DRGUI.setLocation(550, 70);
        DRGUI.setVisible(true);
        DRGUI.setxOffset(5);
        DRGUI.setyOffset(5);

        CRGUI.setInputF('r');
        CRGUI.setOutputF('l');
        CRGUI.setLocation(550, 170);
        CRGUI.setVisible(true);
        CRGUI.setxOffset(10);
        CRGUI.setyOffset(10);

        IPGUI.setInputF('r');
        IPGUI.setOutputF('l');
        IPGUI.setLocation(550, 270);
        IPGUI.setVisible(true);
        IPGUI.setxOffset(15);
        IPGUI.setyOffset(15);

        ARGUI.setInputF('l');
        ARGUI.setOutputF('r');
        ARGUI.setLocation(570, 610);
        ARGUI.setVisible(true);
        ARGUI.setxOffset(20);
        ARGUI.setyOffset(20);

        memoryGUI.setLocation(800, 50);
        memoryGUI.setVisible(true);

        aluGUI.setLocation(275, 350);
        aluGUI.setVisible(true);

        A1GUI = new GateGUI(aluGUI.getOutput(), ACGUI, aluGUI);
        A1GUI.setVisible(true);

        A2GUI = new GateGUI(ACGUI, aluGUI.getInput1(), aluGUI);
        A2GUI.setVisible(true);

        B1GUI = new GateGUI(aluGUI.getOutput(), BRGUI, aluGUI);
        B1GUI.setVisible(true);

        B2GUI = new GateGUI(BRGUI, aluGUI.getInput1(), aluGUI);
        B2GUI.setVisible(true);

        C1GUI = new GateGUI(aluGUI.getOutput(), CRGUI, aluGUI);
        C1GUI.setVisible(true);

        C2GUI = new GateGUI(CRGUI, aluGUI.getInput2(), aluGUI);
        C2GUI.setVisible(true);

        D1GUI = new GateGUI(aluGUI.getOutput(), DRGUI, aluGUI);
        D1GUI.setVisible(true);

        D2GUI = new GateGUI(DRGUI, aluGUI.getInput2(), aluGUI);
        D2GUI.setVisible(true);

        I1GUI = new GateGUI(aluGUI.getOutput(), IPGUI, aluGUI);
        I1GUI.setVisible(true);

        I2GUI = new GateGUI(IPGUI, aluGUI.getInput2(), aluGUI);
        I2GUI.setVisible(true);

        R1GUI = new GateGUI(aluGUI.getOutput(), ARGUI, aluGUI);
        R1GUI.setVisible(true);

        R2GUI = new GateGUI(ARGUI);
        R2GUI.setVisible(true);

        MDGUI = new GateGUI(DRGUI);
        MDGUI.setVisible(true);

        runBtn = new JButton("Run");
        runBtn.setSize(150, 50);
        runBtn.setLocation(0, 615);
        runBtn.setVisible(true);
        runBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GateGUI.activateGate(C1GUI);
                // Для активации гейта вызываешь метод с аргументом гейта который нужно активировать
            }
        });

        MainFrame mainFrame = new MainFrame(ACGUI, BRGUI, DRGUI, CRGUI, ARGUI, IPGUI, memoryGUI, aluGUI, A1GUI, A2GUI, B1GUI, B2GUI, C1GUI, C2GUI, D1GUI, D2GUI, MDGUI, I1GUI, I2GUI, R1GUI, R2GUI, runBtn);
        mainFrame.repaint();
    }

}
