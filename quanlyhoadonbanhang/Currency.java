package quanlyhoadonbanhang;

public class Currency {
    private int value; 
    public Currency(int value){
        this.value = value; 
    }
    public int getValue(){
        return value;
    }
    public void add(Currency other){
        this.value += other.getValue();
    }
}
