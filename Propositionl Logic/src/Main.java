/*
 * Syntax of propositional Logic:
 *
 *  Variables: ...,x,y,z with either the value true or false
 *  Connectives: and, or, not (xor, iff)
 */

public class Main {

    public static void main(String args[]){

        Variable a = new Variable('a',true);
        Variable b = new Variable('b',false);

        System.out.println("a = "+a.getValue()+" b = "+b.getValue());

        // a and b
        System.out.println("\na and b");
        System.out.println( And.of(a,b).getValue() );

        // a or b
        System.out.println("\na or b");
        System.out.println( Or.of(a,b).getValue() );

        // a and (a or b)
        System.out.println("\na and (a or b)");
        System.out.println( And.of( a , Or.of(a,b)).getValue() );

        // not a
        System.out.println("\nnot a");
        System.out.println( Not.of(a).getValue() );

        // a imp b
        System.out.println("\na imp b");
        System.out.println( Imp.of(a,b).getValue() );

        // a xor b
        System.out.println("\na xor b");
        System.out.println( Xor.of(a,b).getValue() );

        // a iff b
        System.out.println("\na iff b");
        System.out.println( Iff.of(a,b).getValue() );

        // Example from the PDF
        Variable p = new Variable('a',true);
        Variable q = new Variable('b',false);

        // (not p imp q) iff (p or q)
        System.out.println("\n(not p imp q) iff (p or q)");
        System.out.println(Iff.of( Imp.of(Not.of(p),q) , Or.of(p,q)).getValue());





    }

}
