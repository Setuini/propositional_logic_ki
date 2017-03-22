
public class And {

    public And(){

    }

    public static Variable of(Variable a, Variable b){
        return new Variable('x', a.getValue() && b.getValue() );
    }



}
