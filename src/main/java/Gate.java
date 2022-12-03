public class Gate {
    private Register input;

    public Gate(Register input, Register output) {
        this.input = input;
        this.output = output;
    }

    private Register output;

    public void transfer() {
        output.setValue(input.getValue());
    }
}
