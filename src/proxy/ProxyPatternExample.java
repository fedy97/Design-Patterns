package proxy;

/**
 * GoF Definition
 * Provide a surrogate or placeholder for another object to control access to it.
 * like RMI
 * Concept
 * A proxy is basically a substitute for an intended object. Access to the original object is not
 * always possible due to many factors. For example, it is expensive to create, it is in need
 * of being secured, it resides in a remote location, and so forth. The proxy design pattern
 * helps us in similar contexts. When a client deals with a proxy object, it assumes that it
 * is talking to the actual object. So, in this pattern, you may want to use a class that can
 * perform as an interface to something else.
 * <p>
 * The client is talking to a ConcreteSubject instance
 * through a proxy method.
 */
public class ProxyPatternExample {
    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy px = new Proxy();
        px.doSomeWork();
        //this second time cs is not null
        px.doSomeWork();
    }
}
