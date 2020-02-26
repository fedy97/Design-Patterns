package decorator;

/**
 * GoF Definition
 * Attach additional responsibilities to an object dynamically. Decorators provide a flexible
 * alternative to subclassing for extending functionality.
 * Concept
 * This pattern says that the class must be closed for modification but open for extension;
 * that is, a new functionality can be added without disturbing existing functionalities.
 * The concept is very useful when we want to add special functionalities to a specific
 * object instead of the whole class. In this pattern, we try to use the concept of object
 * composition instead of inheritance. So, when we master this technique, we can add new
 * responsibilities to an object without affecting the underlying classes.
 */
public class DecoratorPatternExample {
    public static void main(String[] args) {
        System.out.println("***Decorator pattern Demo***\n");
        Component withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();
        System.out.println("_________________");
        //Using a decorator to add floor
        System.out.println("Using a Floor decorator now.");
        AbstractDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setTheComponent(withoutDecorator);
        floorDecorator.makeHouse();
        System.out.println("_________________");
        //Using a decorator to add floor to original house and then
        //paint it.
        System.out.println("Using a Paint decorator now.");
        AbstractDecorator paintDecorator = new PaintDecorator();
        //Adding results from floor decorator
        paintDecorator.setTheComponent(floorDecorator);
        paintDecorator.makeHouse();
        System.out.println("_________________");
    }
}
