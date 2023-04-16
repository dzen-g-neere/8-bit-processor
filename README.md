<a name="br1"></a>**Project Organization and Architecture OfComputer**

**Topic:** Design an instruction set for a limited functionality machinehaving all instructions of 8-bits fixed length only, including opcode andoperands.

**Done by students of IT2-2011 group:**

Evgeniy Kim

Dmitrii Zalevskii

**Progress report.**

**Architecture 1**

` `At the beginning we created a table in excel in order to make itconvenient for us to design an instruction set. Next we started to analyze howmany commands and memory units we could have in 8-bit architecture. First,we decided to have 8 commands and 32 memory units. The main reason wasto have the opcode described by 3 bits and the remaining 5 bits describing theaddress of a certain memory unit. With that architecture we started to designall commands necessary for our limited functional machine. Our first 8designed commands were LD, MOV, ADD, SUB, AND, OR, NOT and CLR.

**Architecture 2**

` `The second version of the instruction set design has changedsignificantly. We decided to allocate 4 bits to opcode and the remaining 4bits to address, because only 3 bits for commands were not enough forthe full performance of our machine. Additional 8 slots for commands weused for 6 conditional commands, increment and decrement. Theseconditional commands were IFE, IFB, IFL, IFN, IFP, IFV.




<a name="br2"></a>**Architecture 3**

` `Current version of instruction set design requires 4 bits for opcodeand 4 bits for operand address. In this design we saw that addresslesscommands do not have operands and occupy too many slots for addresscommands. We used one opcode for all adressless commands andstarted to use bits for operand to find an exact command from the wholelist of addressless commands. We have 15 available address commands(LD, MOV, JMP, AND, OR, ADD, SUB, IFE, IFB, IFL, IFN, IFV, 3 notoccupied opcodes, 1 opcode occupied by addressless commands) and16 available (CLA, OFF, LST, RST, INC, DEC, NOT, 9 not occupiedcodes) addressless commands. This architecture has great scalabilitypotential as we have the opportunity to add 3 additional addresscommands and 9 additional addressless commands.




<a name="br3"></a>**Appendix 1**

**Architecture 1**

Name Command Address (32 memory units)

1 LD 0 0 0

2 MOV 0 0 1

3 ADD 0 1 0

4 SUB 0 1 1

5 AND 1 0 0

6 OR 1 0 1

7 NOT 1 1 0

8 CLR 1 1 1

**Architecture 2**

Name Command Address (16 memory units)

1 LD 0 0 0 0

2 MOV 0 0 0 1

3 ADD 0 0 1 0

4 SUB 0 0 1 1

5 AND 0 1 0 0

6 OR 0 1 0 1

7 NOT 0 1 1 0

8 CLR 0 1 1 1

9 IFE 1 0 0 0

10 IFB 1 0 0 1

11 IFL 1 0 1 0

12 IFN 1 0 1 1

13 IFP 1 1 0 0

14 IFV 1 1 0 1

15 INC 1 1 1 0

16 DEC 1 1 1 1




<a name="br4"></a>**Architecture 3**

Name Command

1 CLA 0 0 0 0 0 0 0 0

2 OFF 0 0 0 0 0 0 0 1

3 LST 0 0 0 0 0 0 1 0

4 RST 0 0 0 0 0 0 1 1

5 INC 0 0 0 0 0 1 0 0

6 DEC 0 0 0 0 0 1 0 1

7 NOT 0 0 0 0 0 1 1 0

8 0 0 0 0 0 1 1 1

9 0 0 0 0 1 0 0 0

10 0 0 0 0 1 0 0 1

11 0 0 0 0 1 0 1 0

12 0 0 0 0 1 0 1 1

13 0 0 0 0 1 1 0 0

14 0 0 0 0 1 1 0 1

15 0 0 0 0 1 1 1 0

16 0 0 0 0 1 1 1 1

Name Command

1 LD 0 0 0 1

2 MOV 0 0 1 0

3 JMP 0 0 1 1

4 AND 0 1 0 0

5 OR 0 1 0 1

6 ADD 0 1 1 0

7 SUB 0 1 1 1

8 IFE 1 0 0 0

9 IFB 1 0 0 1

10 IFL 1 0 1 0

11 IFN 1 0 1 1

12 IFV 1 1 0 0

13 1 1 0 1

14 1 1 1 0

15 1 1 1 1




<a name="br5"></a>**Appendix 2**

**Final processor design**

**Units description**

**AC**

Accumulator is a register that performs the function of temporary localstorage

**DR**

Data register is used to load data from RAM and to upload data to RAM.

**CR**

Command register is used to store command code and therefore load itto the microcontroller.

**IP**

Instruction pointer is used to store a pointer to the next command weneed to execute from RAM.




<a name="br6"></a>**AR**

Address register is used to push the address to RAM to upload somedata or to download.

**BR**

Buffer register is used for some arithmetical and logical operations.

**ALU**

Performs arithmetic and logical operations. Has 4 one-bit registersrequired to perform arithmetic, logical operations and conditionalexpressions. NZVC

Negative flag

If equals 1 then the result is negative, else positive.

Zero flag

If equals 1 then the result is 0, else not zero.

oVerflow flag

If equals 1 then overflow had happened during the execution of the arithmeticoperation.

C flag

Used for arithmetic and logical operations.

**Microcontroller**

Decompiles, executes commands by turning on and off processor gates(A1, A2, B1, B2, C1, C2, D1, D2, D3, I1, I2, L1, R1, R2).

**RAM**

Stores commands and variables. Our machine cannot recognizevariables and commands by itself, only the one who uses the machinecan determine which memory unit contains a variable and whichcontains a command.




<a name="br7"></a>**Appendix 3**

**Address commands explanation**

**LD**

Loads data from RAM to AC pushing the address of the memory unitcontaining the data through the AR.

**MOV**

Moves data from AC to RAM pushing the address of the memory unit thedata through the AR.

**JMP**

Jump. Changes IP to execute another command in the next cycle.

**AND**

Performs the AND logical operation using first operand from AC andsecond operand loaded from RAM to DR.

**OR**

Performs the OR logical operation using first operand from AC andsecond operand loaded from RAM to DR.

**ADD**

Adds the second operand to the first operand in AC, which was loadedfrom RAM to DR.

**SUB**

Subtracts the second operand from the first operand in AC, which wasloaded from RAM to DR.

**IFE**

Conditional expression that checks if Z flag equals 1, and if it is, then IPwill be set to address specified in the last 4 bits, else IP did not change.




<a name="br8"></a>**IFB**

Conditional expression that checks if Z flag and N flag equals 0, and ifthey are, then IP will be set to address specified in the last 4 bits, else IPdid not change.

**IFL**

Conditional expression that checks if N flag equals 1, and if it is, then IPwill be set to address specified in the last 4 bits, else IP did not change.

**IFN**

Conditional expression that checks if N flag equals 1, and if it is, then IPwill be set to address specified in the last 4 bits, else IP did not change.

**IFV**

Conditional expression that checks if V flag equals 1, and if it is, then IPwill be set to address specified in the last 4 bits, else IP did not change.

**Addressless commands explanation**

**CLA**

Clears AC by pushing 0 to it.

**OFF**

Shut down the machine by stopping the execution cycle.

**LST**

Executes left shift binary operation.

**RST**

Executes right shift binary operation.

**INC**

Increments AC (AC = AC + 1).



<a name="br9"></a>**DEC**

Decrements AC (AC = AC + 1).

**NOT**

Executes NOT binary operation.
