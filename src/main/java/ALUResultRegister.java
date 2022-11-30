public class ALUResultRegister extends Register{
    public void setBit(int index, byte bit){
        var temp = getValue();
        temp[index] = bit;
        setValue(temp);
    }
}
