//p imp q == not(p and not q)
public class Imp extends Connective{

    @Override
    public Boolean eval(Boolean l, Boolean r) {
        return !(l && !r);
    }
}
