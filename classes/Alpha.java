package javagauntlet.classes;

/**
 *
 * @author brendon-boldt at https://github.com/brendon-boldt
 */
public class Alpha {
    public static void main(String[] args) {
        Beta betaObject = new Beta();
        betaObject.f();
        Beta.g();
        
        Gamma gammaObject = new Gamma();
        gammaObject.f();
        Gamma.g();
        gammaObject.h();
        
        Delta deltaObject = new Delta();
        deltaObject.publicMethod();
//      Private methods can only be called from within the class
//        deltatObject.privateMethod();
        
        Epsilon epsilonObject = new Epsilon(2401);
        System.out.println(epsilonObject.finalVariable);
        
        gammaObject = new Gamma();
        betaObject = new Beta();
        gammaObject.f();
        betaObject.f();
        gammaObject.h();
//      h() is defined in Gamma and not in Beta
//      An instance of Beta cannot use h() even if we give it a Gamma object
//        betaObject.h();
    }
}
