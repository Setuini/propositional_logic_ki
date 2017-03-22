
public class Variable {

    private Character name;
    private Boolean value;

    public Variable(Character name, boolean value){
        this.name = name;
        this.value = value;
    }

    //Getter and Setter
    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
