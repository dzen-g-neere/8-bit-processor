
// Registers everywhere we need gates

import gui.MainFrame;

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
        MainFrame mainFrame = new MainFrame();
        mainFrame.repaint();
    }

}
