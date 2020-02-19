package builder;

/**
 * GoF Definition:
 * Separate the construction of a complex object from its representation so that the same
 * construction processes can create different representations.
 *
 * Concept:
 * The builder pattern is useful for creating complex objects that have multiple parts.
 * The creational mechanism of an object should be independent of these parts. The
 * construction process does not care about how these parts are assembled. The same
 * construction process must allow us to create different representations of the objects.
 */
public class BuilderPatternExample {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");
        Director director = new Director();
        //this constructor creates a Product too,that has a linked list of parts
        Builder fordCar = new Car("Ford");
        Builder hondaMotorcycle = new MotorCycle("Honda");
        // Making Car
        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();
        //Making MotorCycle
        director.construct(hondaMotorcycle);
        Product p2 = hondaMotorcycle.getVehicle();
        p2.showProduct();
    }
}
