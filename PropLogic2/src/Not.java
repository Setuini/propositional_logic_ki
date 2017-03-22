
public class Not{

    public AtomicFormula eval(AtomicFormula af) {
        Boolean currentValue = af.getValue();
        return new AtomicFormula(!currentValue);
    }


}
