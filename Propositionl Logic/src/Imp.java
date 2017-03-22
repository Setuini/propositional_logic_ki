
// p imp q == not(p and not q)

public class Imp {

    public Imp(){}

    public static Variable of(Variable a, Variable b){
        return Not.of( And.of(a, Not.of(b)) );
    }
}
