package javagauntlet.flow;

/**
 *
 * @author brendon-boldt at https://github.com/brendon-boldt
 */
public class ControlFlow {
    public static void main(String[] args) {
        ifMethod();
        whileMethod();
        doWhileMethod();
        forMethod();
        switchMethod();
    }
    
    static void ifMethod() {
        Integer x,y,z;
        x = y = 128;
        z = -1;
        
        if(x == y) {
            System.out.println("x and y are equal");
        } else if (x == z) {
            System.out.println("x and z are equal");
        } else {
            System.out.println("x is equal neither to y nor z");
        }
    }
    
    static void whileMethod() {
        Integer x, y;
        x = 4;
        y = 27;
        
        while (x < y) {
            System.out.print(x + " ");
            x += 2;
        }
        System.out.println();
    }
    
    static void doWhileMethod() {
        Integer x, y;
        x = 16;
        y = 9;
        
        do {
            System.out.print(x + " ");
            --x;
        } while (x > y);
        System.out.println();
    }
    
    static void forMethod() {
        Integer x = 8;
        
        for(Integer i = 0; i < x; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    static void switchMethod() {
        Integer x = 1;
        
        switch (x) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("some other number");
                break;
        }
    }
}
