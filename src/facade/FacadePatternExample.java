package facade;

/**
 * GoF Definition:
 * Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-­
 * level interface that makes the subsystem easier to use.
 * Concept:
 * Facades make a client’s life easier. Suppose that there is a complex system where
 * multiple objects need to perform a series of tasks, and you need to interact with the
 * system. In a situation like this, facade can provide you a simplified interface that takes
 * care of everything (the creation of those objects, providing the correct sequence of tasks,
 * etc.). As a result, instead of interacting with multiple objects in a complicated way, you
 * just interact with a single object.
 * It is one of those patterns that supports loose coupling. Here you emphasize the
 * abstraction and hide the complex details by exposing a simple interface. As a result, the
 * code becomes clearer and more attractive.
 */
public class FacadePatternExample {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***\n");
        //Creating Robots
        RobotFacade milanoRobotFacade = new RobotFacade();
        milanoRobotFacade.constructMilanoRobot();
        RobotFacade robonautRobotFacade = new RobotFacade();
        robonautRobotFacade.constructRobonautRobot();
        //Destroying robots
        milanoRobotFacade.destroyMilanoRobot();
        robonautRobotFacade.destroyRobonautRobot();
    }
}
