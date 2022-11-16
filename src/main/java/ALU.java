import java.util.Arrays;

//We decided we make abstract alu and dont worry with bits everywhere
public class ALU {
    private byte[] input1;
    private byte[] input2;
    private byte[] result;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ALU alu = (ALU) o;
        return Arrays.equals(input1, alu.input1) && Arrays.equals(input2, alu.input2) && Arrays.equals(result, alu.result);
    }

    @Override
    public int hashCode() {
        int result1 = Arrays.hashCode(input1);
        result1 = 31 * result1 + Arrays.hashCode(input2);
        result1 = 31 * result1 + Arrays.hashCode(result);
        return result1;
    }

    public ALU(byte[] input1, byte[] input2, byte[] result) {
        this.input1 = input1;
        this.input2 = input2;
        this.result = result;
    }

    public byte[] getInput1() {
        return input1;
    }

    public void setInput1(byte[] input1) {
        this.input1 = input1;
    }

    public byte[] getInput2() {
        return input2;
    }

    public void setInput2(byte[] input2) {
        this.input2 = input2;
    }

    public byte[] getResult() {
        return result;
    }

    public void setResult(byte[] result) {
        this.result = result;
    }
}
