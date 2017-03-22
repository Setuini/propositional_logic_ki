
public class Main {

    public static void main(String args[]){

        AtomicFormula a = new AtomicFormula(true);
        AtomicFormula b = new AtomicFormula(false);

        Connective and = new And();
        Connective or = new Or();
        Connective imp = new Imp();
        Connective iff = new Iff();
        Not not = new Not();

        // a and b
        Formula f = new ComplexFormula(a,and,b);

        // (a and b) or b
        Formula f2 = new ComplexFormula(f,or,b);

        // a imp b
        Formula f3 = new ComplexFormula(a, imp, b);

        // (!p imp q) iff (p or q)
        AtomicFormula p = new AtomicFormula(true);
        AtomicFormula q = new AtomicFormula(true);
        Formula f4 = new ComplexFormula( new ComplexFormula(not.eval(p), imp, q), iff, new ComplexFormula(p, or, q));

        // Evaluate
        System.out.println(f.eval());
        System.out.println(f2.eval());
        System.out.println(f3.eval());
        System.out.println(f4.eval());

        // Tautology
        // evaluate the formula with all possible inputs and check if the outcome is true every time.
        // 2^n combinations
        // checkTautologie(); in ComplexFormula



    }

}
