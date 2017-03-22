
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
}
