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
                this.commands = new String[]{"0 0 1 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0"};
                this.started = true;
            } else {

            }
        }
        if (cycleStatus == CycleStatus.ID) {

            if (!started) {
                this.commands = new String[]{"0 0 1 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0"};
                this.started = true;
            } else {

            }
        }
    }

}
