
public class Iff extends Connective{

    @Override
    public Boolean eval(Boolean l, Boolean r) {
        return !(l^r);
    }
}
