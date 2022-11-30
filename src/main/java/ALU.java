public class ALU {
    private final Register input1;
    private final ALURegister input2;
    private final ALUResultRegister result;

    private boolean inc = false;
    private boolean dec = false;
    private boolean add = false;
    private boolean not = false;
    private boolean or = false;
    private boolean and = false;
    private boolean rst = false;
    private boolean lst = false;
    private boolean fl1 = false;
    private boolean fl2 = false;

    public void setInc(boolean inc) {
        this.inc = inc;
    }

    public void setDec(boolean dec) {
        this.dec = dec;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public void setNot(boolean not) {
        this.not = not;
    }

    public void setOr(boolean or) {
        this.or = or;
    }

    public void setAnd(boolean and) {
        this.and = and;
    }

    public void setRst(boolean rst) {
        this.rst = rst;
    }

    public void setLst(boolean lst) {
        this.lst = lst;
    }

    public void setFl1(boolean fl1) {
        this.fl1 = fl1;
    }

    public void setFl2(boolean fl2) {
        this.fl2 = fl2;
    }
    public ALU(Register input1, ALURegister input2, ALUResultRegister result) {
        this.input1 = input1;
        this.input2 = input2;
        this.result = result;
    }

    private void byteADD() {
        boolean carry = false;
        var input1 = this.input1.getValue();
        var input2 = this.input2.getValue();
        for (int i = 7; i >= 0; --i) {
            if (input1[i] == 1 && input2[i] == 1) {
                if (carry) {
                    result.setBit(i, (byte) 1);
                } else {
                    result.setBit(i, (byte) 0);
                }
                carry = true;
            }
            if ((input1[i] == 1 || input2[i] == 1) && input1[i] != input2[i]) {
                if (carry) {
                    result.setBit(i, (byte) 0);
                    carry = true;
                } else {
                    result.setBit(i, (byte) 1);
                }
            }
            if (input1[i] == 0 && input2[i] == 0) {
                if (carry) {
                    result.setBit(i, (byte) 1);
                    carry = false;
                } else {
                    result.setBit(i, (byte) 0);
                }
            }
            if (i == 0) {
                //Setting CF
            }
            if (i == 1) {
                //Setting OF
            }
        }
    }

    private void byteOR() {
        var input1 = this.input1.getValue();
        var input2 = this.input2.getValue();
        for (int i = 7; i >= 0; --i) {
            if (input1[i] == 1 || input2[i] == 1) {
                result.setBit(i, (byte) 1);
            } else {
                result.setBit(i, (byte) 0);
            }
        }
    }

    private void byteAND() {
        var input1 = this.input1.getValue();
        var input2 = this.input2.getValue();
        for (int i = 7; i >= 0; --i) {
            if (input1[i] == 1 && input2[i] == 1) {
                result.setBit(i, (byte) 1);
            } else {
                result.setBit(i, (byte) 0);
            }
        }
    }

    private void byteNOT() {
        var input1 = this.input1.getValue();
        for (int i = 7; i >= 0; --i) {
            if (input1[i] == 1) {
                result.setBit(i, (byte) 0);
            } else {
                result.setBit(i, (byte) 1);
            }
        }
    }

    private void byteRST() {
        var input1 = this.input1.getValue();
        for (int i = 0; i <= 6; ++i) {
            if (input1[i] == 1) {
                result.setBit(i + 1, (byte) 1);
            } else {
                result.setBit(i + 1, (byte) 0);
            }
        }
        result.setBit(0, (byte) 0);
    }

    private void byteLST() {
        var input1 = this.input1.getValue();
        for (int i = 7; i >= 1; --i) {
            if (input1[i] == 1) {
                result.setBit(i - 1, (byte) 1);
            } else {
                result.setBit(i - 1, (byte) 0);
            }
        }
        result.setBit(7, (byte) 0);
    }

    private void byteFL1() {
        result.setValue(input1.getValue());
    }

    private void byteFL2() {
        result.setValue(input2.getValue());
    }

    public void execute() {
        if (inc) {
            input2.setInc();
        }
        if (dec) {
            input2.setDec();
        }
        if (add) {
            byteADD();
        }
        if (and) {
            byteAND();
        }
        if (or) {
            byteOR();
        }
        if (not) {
            byteNOT();
        }
        if (rst) {
            byteRST();
        }
        if (lst) {
            byteLST();
        }
        if (fl1) {
            byteFL1();
        }
        if (fl2) {
            byteFL2();
        }
    }

}
