
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
}
