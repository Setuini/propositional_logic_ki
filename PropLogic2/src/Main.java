
public class Main {

    public static void main(String args[]){

        AtomicFormula a = new AtomicFormula(false);
        AtomicFormula b = new AtomicFormula(true);
        Connective and = new And();
        Connective or = new Or();

        // a and b
        Formula f = new ComplexFormula(a,and,b);

        // (a and b) or b
        Formula f2 = new ComplexFormula(f,or,b);

        System.out.println(f.eval());
        System.out.println(f2.eval());

    }

}
