import java.io.File;
import java.util.ArrayList;
import java.util.Deque;

public class Microcontroller {
    private ArrayList<Gate> gates;

    private CycleStatus cycleStatus;

    private boolean started;
    private String[] commands;

    public Microcontroller(ArrayList<Gate> gates) {
        this.gates = gates;
        this.commands = null;
        this.cycleStatus = CycleStatus.IF;
        this.started = false;
    }

    public void executeCycle() {
        if (cycleStatus == CycleStatus.IF) {
            if (!started) {
                this.commands = new String[]{"1111110001101001"};
            }
        }
    }


    public void executeAll() {

    }
}
