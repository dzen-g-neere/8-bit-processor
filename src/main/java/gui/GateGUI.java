package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class GateGUI extends JPanel {
    private RegisterGUI inputRegisterGUI;
    private RegisterGUI outputRegisterGUI;
    private ALUGUI aluGUI;
    private double leftXInput;
    private double leftYInput;
    private double rightXInput;
    private double rightYInput;
    private double topXInput;
    private double topYInput;
    private double botXInput;
    private double botYInput;
    private double leftXOutput;
    private double leftYOutput;
    private double rightXOutput;
    private double rightYOutput;
    private double topXOutput;
    private double topYOutput;
    private double botXOutput;
    private double botYOutput;

    public GateGUI (RegisterGUI input, RegisterGUI output, ALUGUI alu) {
        setSize(1000, 700);
        setOpaque(false);
        setLayout(null);

        inputRegisterGUI = input;
        outputRegisterGUI = output;
        aluGUI = alu;

        if (input.equals(alu.getOutput())) {
            topXInput = input.getX() + (double)input.getWidth() / 2 + alu.getLocation().x;
            topYInput = input.getY() + alu.getLocation().y;
            botXInput = input.getX() + (double)input.getWidth() / 2 + alu.getLocation().x;
            botYInput = input.getY() + input.getHeight() + alu.getLocation().y;
        } else {
            leftXInput  = input.getX();
            leftYInput  = input.getY() + (double)input.getHeight() / 2;
            rightXInput = input.getX() + input.getWidth();
            rightYInput = input.getY() + (double)input.getHeight() / 2;
            topXInput = input.getX() + (double)input.getWidth() / 2;
            topYInput = input.getY();
            botXInput = input.getX() + (double)input.getWidth() / 2;
            botYInput = input.getY() + input.getHeight();
        }

        if (output.equals(alu.getInput1()) || output.equals(alu.getInput2())) {
            topXOutput = output.getX() + (double)output.getWidth() / 2 + alu.getLocation().x;
            topYOutput = output.getY() + alu.getLocation().y;
            botXOutput = output.getX() + (double)output.getWidth() / 2 + alu.getLocation().x;
            botYOutput = output.getY() + output.getHeight() + alu.getLocation().y;
        } else {
            leftXOutput = output.getX();
            leftYOutput = output.getY() + (double)output.getHeight() / 2;
            rightXOutput = output.getX() + output.getWidth();
            rightYOutput = output.getY() + (double)output.getHeight() / 2;
            topXOutput = output.getX() + (double)output.getWidth() / 2;
            topYOutput = output.getY();
            botXOutput = output.getX() + (double)output.getWidth() / 2;
            botYOutput = output.getY() + output.getHeight();
        }
    }

    public GateGUI (RegisterGUI input) {
        setSize(1000, 700);
        setOpaque(false);
        setLayout(null);

        inputRegisterGUI = input;

        rightXInput = input.getX() + input.getWidth();
        rightYInput = input.getY() + (double)input.getHeight() / 2;
        topXInput = input.getX() + (double)input.getWidth() / 2;
        topYInput = input.getY();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(4));
        char inputRegisterOFlag = inputRegisterGUI.getOutputF();
        char outputRegisterIFlag;
        if (outputRegisterGUI != null) {
            outputRegisterIFlag = outputRegisterGUI.getInputF();
            if (inputRegisterOFlag == 'r' && outputRegisterIFlag == 't') {
                g2.draw(new Line2D.Double(rightXInput, rightYInput, topXOutput, rightYInput));
                g2.draw(new Line2D.Double(topXOutput, rightYInput, topXOutput, topYOutput));
            }

            if (inputRegisterOFlag == 'l' && outputRegisterIFlag == 't') {
                g2.draw(new Line2D.Double(leftXInput, leftYInput, topXOutput, leftYInput));
                g2.draw(new Line2D.Double(topXOutput, leftYInput, topXOutput, topYOutput));
            }

            if (inputRegisterOFlag == 'b' && outputRegisterIFlag == 'l') {
                g2.draw(new Line2D.Double(botXInput, botYInput, botXInput, botYInput + 50));
                g2.draw(new Line2D.Double(botXInput, botYInput + 50, leftXOutput - 30, botYInput + 50));
                g2.draw(new Line2D.Double(leftXOutput - 30, botYInput + 50, leftXOutput - 30, leftYOutput));
                g2.draw(new Line2D.Double(leftXOutput - 30, leftYOutput, leftXOutput, leftYOutput));
            }

            if (inputRegisterOFlag == 'b' && outputRegisterIFlag == 'r') {
                g2.draw(new Line2D.Double(botXInput, botYInput, botXInput, botYInput + 50));
                g2.draw(new Line2D.Double(botXInput, botYInput + 50, rightXOutput + 30, botYInput + 50));
                g2.draw(new Line2D.Double(rightXOutput + 30, botYInput + 50, rightXOutput + 30, leftYOutput));
                g2.draw(new Line2D.Double(rightXOutput + 30, rightYOutput, rightXOutput, rightYOutput));
            }
        }

        if (inputRegisterOFlag == 'r' && outputRegisterGUI == null) {
            g2.draw(new Line2D.Double(rightXInput, rightYInput, rightXInput + 130, rightYInput));
        }

        if (inputRegisterOFlag == 'l' && outputRegisterGUI == null) {
            g2.draw(new Line2D.Double(topXInput, topYInput, topXInput, topYInput - 50));
            g2.draw(new Line2D.Double(topXInput, topYInput - 50, topXInput + 290, topYInput - 50));
            g2.draw(new Line2D.Double(topXInput + 290, topYInput - 50, topXInput + 290, topYInput - 20));
        }
    }

    public void activateGate () {

    }
}
