
// Registers everywhere we need gates

import gui.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Processor {
    static int counter = 0;

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
                //ADD 1111
                //OR 1110
                //AND 1101
                switch (counter) {
                    case 0:
                        MDGUI.activateGate(MDGUI);
                        R1GUI.activateGate(R1GUI);
                        R2GUI.activateGate(R2GUI);
                        B1GUI.activateGate(B1GUI);
                        I2GUI.activateGate(I2GUI);
                        DR.setValue(new byte[]{0, 1, 1, 0, 1, 1, 1, 1});
                        DRGUI.changeValue(DR.getValue());
                        break;
                    case 1:
                        MDGUI.deactivateGate(MDGUI);
                        R1GUI.deactivateGate(R1GUI);
                        R2GUI.deactivateGate(R2GUI);
                        B1GUI.deactivateGate(B1GUI);
                        I2GUI.deactivateGate(I2GUI);

                        B2GUI.activateGate(B2GUI);
                        I1GUI.activateGate(I1GUI);
                        ALU3.setValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        IP.setValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
                        IPGUI.changeValue(IP.getValue());
                        break;
                    case 2:
                        B2GUI.deactivateGate(B2GUI);
                        I1GUI.deactivateGate(I1GUI);

                        D2GUI.activateGate(D2GUI);
                        C1GUI.activateGate(C1GUI);

                        ALU2.setValue(new byte[]{0, 1, 1, 0, 1, 1, 1, 1});
                        aluGUI.getInput2().changeValue(ALU2.getValue());
                        ALU3.setValue(new byte[]{0, 1, 1, 0, 1, 1, 1, 1});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        CR.setValue(new byte[]{0, 1, 1, 0, 1, 1, 1, 1});
                        CRGUI.changeValue(CR.getValue());
                        break;
                    case 3:
                        D2GUI.deactivateGate(D2GUI);
                        C1GUI.deactivateGate(C1GUI);

                        MDGUI.activateGate(MDGUI);
                        C2GUI.activateGate(C2GUI);
                        R1GUI.activateGate(R1GUI);
                        R2GUI.activateGate(R2GUI);

                        AR.setValue(new byte[]{0, 0, 0, 0, 1, 1, 1, 1});
                        ARGUI.changeValue(AR.getValue());
                        DR.setValue(new byte[]{1, 0, 1, 0, 1, 0, 1, 0});
                        DRGUI.changeValue(DR.getValue());

                        break;
                    case 4:
                        MDGUI.deactivateGate(MDGUI);
                        C2GUI.deactivateGate(C2GUI);
                        R1GUI.deactivateGate(R1GUI);
                        R2GUI.deactivateGate(R2GUI);

                        A1GUI.activateGate(A1GUI);
                        A2GUI.activateGate(A2GUI);
                        D2GUI.activateGate(D2GUI);

                        ALU2.setValue(new byte[]{1, 0, 1, 0, 1, 0, 1, 0});
                        aluGUI.getInput2().changeValue(ALU2.getValue());
                        ALU3.setValue(new byte[]{1, 0, 1, 0, 1, 0, 1, 0});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        AC.setValue(new byte[]{1, 0, 1, 0, 1, 0, 1, 0});
                        ACGUI.changeValue(AC.getValue());
                        break;
                    ///////////////////////////////////////////////////
                    case 5:

                        A1GUI.deactivateGate(A1GUI);
                        A2GUI.deactivateGate(A2GUI);
                        D2GUI.deactivateGate(D2GUI);

                        MDGUI.activateGate(MDGUI);
                        R1GUI.activateGate(R1GUI);
                        R2GUI.activateGate(R2GUI);
                        B1GUI.activateGate(B1GUI);
                        I2GUI.activateGate(I2GUI);
                        DR.setValue(new byte[]{0, 1, 0, 1, 1, 1, 1, 0});
                        BRGUI.changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
                        ARGUI.changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
                        aluGUI.getInput2().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
                        aluGUI.getOutput().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
                        DRGUI.changeValue(DR.getValue());
                        break;
                    case 6:
                        MDGUI.deactivateGate(MDGUI);
                        R1GUI.deactivateGate(R1GUI);
                        R2GUI.deactivateGate(R2GUI);
                        B1GUI.deactivateGate(B1GUI);
                        I2GUI.deactivateGate(I2GUI);

                        B2GUI.activateGate(B2GUI);
                        I1GUI.activateGate(I1GUI);
                        ALU3.setValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 2});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        aluGUI.getInput1().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
                        IP.setValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 2});
                        IPGUI.changeValue(IP.getValue());
                        break;
                    case 7:
                        B2GUI.deactivateGate(B2GUI);
                        I1GUI.deactivateGate(I1GUI);

                        D2GUI.activateGate(D2GUI);
                        C1GUI.activateGate(C1GUI);

                        ALU2.setValue(new byte[]{0, 1, 0, 1, 1, 1, 1, 0});
                        aluGUI.getInput2().changeValue(ALU2.getValue());
                        aluGUI.getInput1().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
                        ALU3.setValue(new byte[]{0, 1, 0, 1, 1, 1, 1, 0});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        CR.setValue(new byte[]{0, 1, 0, 1, 1, 1, 1, 0});
                        CRGUI.changeValue(CR.getValue());
                        break;
                    case 8:
                        D2GUI.deactivateGate(D2GUI);
                        C1GUI.deactivateGate(C1GUI);

                        MDGUI.activateGate(MDGUI);
                        C2GUI.activateGate(C2GUI);
                        R1GUI.activateGate(R1GUI);
                        R2GUI.activateGate(R2GUI);

                        AR.setValue(new byte[]{0, 0, 0, 0, 1, 1, 1, 0});
                        ARGUI.changeValue(AR.getValue());
                        DR.setValue(new byte[]{0, 0, 0, 0, 1, 1, 1, 1});
                        DRGUI.changeValue(DR.getValue());

                        break;
                    case 9:
                        MDGUI.deactivateGate(MDGUI);
                        C2GUI.deactivateGate(C2GUI);
                        R1GUI.deactivateGate(R1GUI);
                        R2GUI.deactivateGate(R2GUI);

                        A1GUI.activateGate(A1GUI);
                        A2GUI.activateGate(A2GUI);
                        D2GUI.activateGate(D2GUI);

                        ALU1.setValue(new byte[]{1, 0, 1, 0, 1, 0, 1, 0});
                        ALU2.setValue(new byte[]{0, 0, 0, 0, 1, 1, 1, 1});
                        aluGUI.getInput2().changeValue(ALU2.getValue());
                        aluGUI.getInput1().changeValue(new byte[]{1, 0, 1, 0, 1, 0, 1, 0});
                        ALU3.setValue(new byte[]{1, 0, 1, 0, 1, 1, 1, 1});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        AC.setValue(new byte[]{1, 0, 1, 0, 1, 1, 1, 1});
                        ACGUI.changeValue(AC.getValue());
                        break;
                    /////////////////////////////////////
                    ///////////////////////////////////////////////////
                    case 10:

                        A1GUI.deactivateGate(A1GUI);
                        A2GUI.deactivateGate(A2GUI);
                        D2GUI.deactivateGate(D2GUI);

                        MDGUI.activateGate(MDGUI);
                        R1GUI.activateGate(R1GUI);
                        R2GUI.activateGate(R2GUI);
                        B1GUI.activateGate(B1GUI);
                        I2GUI.activateGate(I2GUI);
                        DR.setValue(new byte[]{0, 1, 0, 0, 1, 1, 0, 1});
                        BRGUI.changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 2});
                        ARGUI.changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 2});
                        aluGUI.getInput2().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 2});
                        aluGUI.getInput1().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
                        aluGUI.getOutput().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 2});
                        DRGUI.changeValue(DR.getValue());
                        break;
                    case 11:
                        MDGUI.deactivateGate(MDGUI);
                        R1GUI.deactivateGate(R1GUI);
                        R2GUI.deactivateGate(R2GUI);
                        B1GUI.deactivateGate(B1GUI);
                        I2GUI.deactivateGate(I2GUI);

                        B2GUI.activateGate(B2GUI);
                        I1GUI.activateGate(I1GUI);
                        ALU3.setValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 3});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        aluGUI.getInput1().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 2});
                        aluGUI.getInput2().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
                        IP.setValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 3});
                        IPGUI.changeValue(IP.getValue());
                        break;
                    case 12:
                        B2GUI.deactivateGate(B2GUI);
                        I1GUI.deactivateGate(I1GUI);

                        D2GUI.activateGate(D2GUI);
                        C1GUI.activateGate(C1GUI);

                        ALU2.setValue(new byte[]{0, 1, 0, 0, 1, 1, 0, 1});
                        aluGUI.getInput2().changeValue(ALU2.getValue());
                        aluGUI.getInput1().changeValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
                        ALU3.setValue(new byte[]{0, 1, 0, 0, 1, 1, 0, 1});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        CR.setValue(new byte[]{0, 1, 0, 0, 1, 1, 0, 1});
                        CRGUI.changeValue(CR.getValue());
                        break;
                    case 13:
                        D2GUI.deactivateGate(D2GUI);
                        C1GUI.deactivateGate(C1GUI);

                        MDGUI.activateGate(MDGUI);
                        C2GUI.activateGate(C2GUI);
                        R1GUI.activateGate(R1GUI);
                        R2GUI.activateGate(R2GUI);

                        AR.setValue(new byte[]{0, 0, 0, 0, 1, 1, 0, 1});
                        ARGUI.changeValue(AR.getValue());
                        DR.setValue(new byte[]{1, 0, 1, 0, 0, 0, 0, 0});
                        DRGUI.changeValue(DR.getValue());

                        break;
                    case 14:
                        MDGUI.deactivateGate(MDGUI);
                        C2GUI.deactivateGate(C2GUI);
                        R1GUI.deactivateGate(R1GUI);
                        R2GUI.deactivateGate(R2GUI);

                        A1GUI.activateGate(A1GUI);
                        A2GUI.activateGate(A2GUI);
                        D2GUI.activateGate(D2GUI);

                        ALU1.setValue(new byte[]{1, 0, 1, 0, 1, 1, 1, 1});
                        ALU2.setValue(new byte[]{1, 0, 1, 0, 0, 0, 0, 0});
                        aluGUI.getInput2().changeValue(ALU2.getValue());
                        aluGUI.getInput1().changeValue(new byte[]{1, 0, 1, 0, 1, 1, 1, 1});
                        ALU3.setValue(new byte[]{1, 0, 1, 0, 0, 0, 0, 0});
                        aluGUI.getOutput().changeValue(ALU3.getValue());
                        AC.setValue(new byte[]{1, 0, 1, 0, 0, 0, 0, 0});
                        ACGUI.changeValue(AC.getValue());
                        break;
                }
                counter++;

                // Для активации гейта вызываешь метод с аргументом гейта который нужно активировать
            }
        });
        MainFrame mainFrame = new MainFrame(ACGUI, BRGUI, DRGUI, CRGUI, ARGUI, IPGUI, memoryGUI, aluGUI, A1GUI, A2GUI, B1GUI, B2GUI, C1GUI, C2GUI, D1GUI, D2GUI, MDGUI, I1GUI, I2GUI, R1GUI, R2GUI, runBtn);
        mainFrame.repaint();

        //ADD 1111
        RAM1.setValue(new byte[]{1, 1, 1, 1, 0, 0, 0, 0});
        RAM2.setValue(new byte[]{0, 1, 1, 0, 1, 1, 1, 1});
        RAM.save();

        //OR 1110
        RAM1.setValue(new byte[]{1, 1, 1, 1, 0, 0, 0, 1});
        RAM2.setValue(new byte[]{0, 1, 0, 1, 1, 1, 1, 0});
        RAM.save();

        //AND 1101
        RAM1.setValue(new byte[]{1, 1, 1, 1, 0, 0, 1, 0});
        RAM2.setValue(new byte[]{0, 1, 0, 0, 1, 1, 0, 1});
        RAM.save();

        RAM1.setValue(new byte[]{1, 1, 1, 1, 1, 1, 1, 1});
        RAM2.setValue(new byte[]{1, 0, 1, 0, 1, 0, 1, 0});
        RAM.save();
        RAM1.setValue(new byte[]{1, 1, 1, 1, 1, 1, 1, 0});
        RAM2.setValue(new byte[]{0, 0, 0, 0, 1, 1, 1, 1});
        RAM.save();
        RAM1.setValue(new byte[]{1, 1, 1, 1, 1, 1, 0, 1});
        RAM2.setValue(new byte[]{1, 0, 1, 0, 0, 0, 0, 0});
        RAM.save();

        memoryGUI.changeValues(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, RAM.memory);
    }


}
