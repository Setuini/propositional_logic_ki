
public class AtomicFormula extends Formula{

    private Boolean value;

    public AtomicFormula(Boolean value){
        this.value = value;
    }

    @Override
    public Boolean eval() {
        //System.out.println("eval atomic formula");
        return this.value;
    }

    //Getter and Setter
    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
