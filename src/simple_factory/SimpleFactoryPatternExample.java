package simple_factory;

/**
 * Intent:
 * Create an object without exposing the instantiation logic to the client.
 * <p>
 * Concept:
 * In object-oriented programming, a factory is a special kind of object that can create
 * other objects. A factory can be invoked in many ways, but most often, it uses a method
 * that can return objects with varying prototypes. Any subroutine that can help create
 * these new objects is considered a factory. The ultimate purpose of using a factory
 * method is to abstract the object creational mechanism (or process) from the consumers
 * of the application.
 */
//A client is interested to get an animal who can speak and perform an
//action.
public class SimpleFactoryPatternExample {
    public static void main(String[] args) {
        System.out.println("*** Simple Factory Pattern Demo***\n");
        Animal preferredType = null;
        SimpleFactory simpleFactory = new SimpleFactory();
        // The code that will vary based on users preference.
        preferredType = simpleFactory.createAnimal();
        //The codes that do not change frequently.
        //These animals can speak and prefer to do some specific actions.
        preferredType.speak();
        preferredType.preferredAction();
    }

}
