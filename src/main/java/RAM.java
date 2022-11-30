import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RAM {
    private Register address;
    private Register value;

    public RAM(Register address, Register value) {
        this.address = address;
        this.value = value;
    }

    private ArrayList<byte[]> memory = new ArrayList<>(Collections.nCopies(16, new byte[]{0, 0, 0, 0, 0, 0, 0, 0}));

    private int convertByteToIntAddress(byte[] address) {
        int temp = 0;
        for (int i = 0; i < 4; ++i) {
            temp += (int)Math.pow(2, i) * (int) address[address.length - i - 1];
        }
        return temp;
    }

    public void save() {
        memory.set(convertByteToIntAddress(address.getValue()), value.getValue());
    }

    public void load() {
        value.setValue(memory.get(convertByteToIntAddress(address.getValue())));
    }
}
