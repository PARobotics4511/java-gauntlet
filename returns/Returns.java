package javagauntlet.returns;

/**
 *
 * @author brendon-boldt at https://github.com/brendon-boldt
 */
public class Returns {

    public static void main(String[] args) {
        Integer x = returnsInteger();
        System.out.println(x);

        System.out.println(returnsString());

        Auxiliary auxObject = new Auxiliary();
        Double d = auxObject.returnsDouble();
        System.out.println(d);

        if (auxObject.returnsBoolean()) {
            System.out.println("Method evaluated to true.");
        } else {
            System.out.println("Method evaluated to false.");
        }

    }

    static Integer returnsInteger() {
        return 343;
    }

    static String returnsString() {
        return "random";
    }
}
