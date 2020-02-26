package abstract_factory;

/**
 * Concept:
 * This is basically a factory of factories that provides one level of higher abstraction
 * than the factory method pattern. This pattern helps us to interchange specific
 * implementations without changing the code that uses them, even at runtime.
 * This pattern provides a way to encapsulate a group of individual factories that have a
 * common theme. Here a class does not create the objects directly; instead, it delegates the
 * task to a factory object.
 * The simple factory method pattern creates a set of related objects. In a similar way,
 * since an abstract factory is basically a factory of factories,
 * it returns factories that create a
 * set of related objects.
 */
public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AnimalFactory myAnimalFactory;
        Dog myDog;
        Tiger myTiger;
        System.out.println("***Abstract Factory Pattern Demo***\n");
        //Making a wild dog through WildAnimalFactory
        myAnimalFactory = new WildAnimalFactory();
        myDog = myAnimalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();
        //Making a wild tiger through WildAnimalFactory
        myTiger = myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();
        System.out.println("******************");
        //Making a pet dog through PetAnimalFactory
        myAnimalFactory = new PetAnimalFactory();
        myDog = myAnimalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();
        //Making a pet tiger through PetAnimalFactory
        myTiger = myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();
    }
}
