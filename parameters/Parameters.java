package javagauntlet.parameters;

/**
 *
 * @author brendon-boldt at https://github.com/brendon-boldt
 */
public class Parameters {
    
    public static void main(String[] args) {
        zeroParams();
        oneParam(27);
        twoParams(1024,2401);
        overloaded(25);
        overloaded(16,9);
        overloaded(6.2831853064);
    }
    
    static void zeroParams() {
        System.out.println("This method has no parameters.");
    }
    
    static void oneParam(Integer x) {
        System.out.println("Argument: " + x);
    }
    
    static void twoParams(Integer x, Integer y) {
        System.out.println("Arguments: " + x + " and " + y);
    }
    
    static void overloaded(Integer x) {
        System.out.println("Argument: " + x);
    }
    
    static void overloaded(Integer x, Integer y) {
        System.out.println("Arguments: " + x + " and " + y);
    }
    
    static void overloaded(Double x) {
        System.out.println("Double Argument: " + x);
    }
}
