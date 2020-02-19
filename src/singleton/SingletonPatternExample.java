package singleton;

final class Captain2 {
    private static Captain2 captain;
    //We make the constructor private to prevent the use of "new"
    static int numberOfInstance = 0;

    private Captain2() {
        numberOfInstance++;
        System.out.println("Number of instances at this moment=" +
                numberOfInstance);
    }

    public static Captain2 getCaptain() {
        if (captain == null) {
            synchronized (Captain2.class) {
                // Lazy initialization
                if (captain == null) {
                    captain = new Captain2();
                    System.out.println("New captain is elected for your team.");
                } else {
                    System.out.print("You already have a captain for your team.");
                    System.out.println("Send him for the toss.");
                }
            }
        }
        return captain;
    }
}

public class SingletonPatternExample {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team:");
        //Constructor is private.We cannot use "new" here.
        //Captain c3 = new Captain();//error
        Captain2 captain1 = Captain2.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain2 captain2 = Captain2.getCaptain();
        if (captain1 == captain2) {
            System.out.println("captain1 and captain2 are same instance.");
        }
    }
}
