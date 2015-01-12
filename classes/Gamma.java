package javagauntlet.classes;

/**
 *
 * @author brendon-boldt at https://github.com/brendon-boldt
 */
public class Gamma extends Beta {

    public static void g() {
        System.out.println("overriding method");
    }

    public void h() {
        System.out.println("subclass member method");
    }
}
