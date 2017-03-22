
public class Not {

    public Not(){}

    public static Variable of(Variable a){
        if (a.getValue() == true){
            return new Variable('x',false);
        }
        return new Variable('x',true);
    }


}
