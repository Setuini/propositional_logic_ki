import java.util.ArrayList;

public class ComplexFormula extends Formula{

    private Formula left;
    private Formula right;
    private Connective con;

    public ComplexFormula(Formula left, Connective con, Formula right){
        this.left = left;
        this.con = con;
        this.right = right;
    }

    @Override
    public Boolean eval() {
        //System.out.println("eval complex formula");
        //Recursive evaluate left and right side of the Formula
        Boolean el = this.left.eval();
        Boolean er = this.right.eval();
        return con.eval(el,er);
    }

    public Boolean checkTautologie(ComplexFormula cf, ArrayList<AtomicFormula> afl){
        // TO DO:
        // permutations of afl
        // evaluate cf with all permutations - if evaluation is false return false otherwise return true
        return null;
    }
}
