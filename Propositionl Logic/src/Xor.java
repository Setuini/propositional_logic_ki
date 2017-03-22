// a xor b == (not a and b) or (a and not b)
public class Xor {

    public Xor(){}

    public static Variable of (Variable a, Variable b){
        return Or.of(And.of(Not.of(a),b), And.of(a,Not.of(b)));
    }




}
