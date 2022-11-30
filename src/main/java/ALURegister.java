public class ALURegister extends Register {
    //Special register for ALU. Can set itself to 1 and -1.
    public void setInc() {
        setValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
    }

    public void setDec() {
        setValue(new byte[]{1, 1, 1, 1, 1, 1, 1, 1});
    }
}
