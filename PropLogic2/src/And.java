
public class And extends Connective{

    @Override
    public Boolean eval(Boolean l, Boolean r) {
        //System.out.println("eval and");
        return l && r;
    }
}
