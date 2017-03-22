
public class Iff {

    public Iff(){}

    public static Variable of(Variable a, Variable b){
        return Not.of(Xor.of(a,b));
    }
}
