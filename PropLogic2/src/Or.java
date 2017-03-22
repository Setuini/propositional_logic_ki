
public class Or extends Connective{

    @Override
    public Boolean eval(Boolean l, Boolean r) {
        return l || r;
    }
}
