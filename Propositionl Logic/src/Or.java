/**
 * Created by setuini on 22/03/2017.
 */
public class Or {

    public Or(){

    }

    public static Variable of(Variable a, Variable b){
        return new Variable('x',a.getValue() || b.getValue());
    }
}
