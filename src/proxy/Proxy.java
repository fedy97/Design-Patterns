package proxy;

/**
 * Proxy Class: It will try to invoke the doSomeWork()
 * of a ConcreteSubject instance
 */
public class Proxy extends Subject {
    static Subject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now...");
        //Lazy initialization: We'll not instantiate until the method is
        //called
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
