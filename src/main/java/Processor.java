
// Registers everywhere we need gates

import java.util.Arrays;

public class Processor {
    public static void main(String[] args) {
        Register ALU1 = new Register();
        ALURegister ALU2 = new ALURegister();
        ALUResultRegister ALU3 = new ALUResultRegister();

        ALU ALU = new ALU(ALU1, ALU2, ALU3);

        Register RAM1 = new Register();
        Register RAM2 = new Register();
        RAM RAM = new RAM(RAM1, RAM2);

        Microcontroller MCR = new Microcontroller();

        Register AC = new Register();
        Register DR = new Register();
        Register CR = new Register();
        Register IP = new Register();
        Register AR = new Register();
        Register BR = new Register();

        Gate A1 = new Gate();
        Gate A2 = new Gate();
        Gate B1 = new Gate();
        Gate B2 = new Gate();
        Gate C1 = new Gate();
        Gate C2 = new Gate();
        Gate D1 = new Gate();
        Gate D2 = new Gate();
        Gate I1 = new Gate();
        Gate I2 = new Gate();
        Gate R1 = new Gate();
        Gate R2 = new Gate();
    }
}
