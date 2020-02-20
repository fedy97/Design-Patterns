package simple_factory;

import java.util.Scanner;

public class SimpleFactory {
    public Animal createAnimal() {
        Animal intendedAnimal = null;
        System.out.println("Enter your choice( 0 for Dog, 1 for Tiger)");
        /* To suppress the warning message:Resource leak:'input' is never
closed. So,the following line is optional in this case*/
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("You have entered :" + choice);
        switch (choice) {
            case 0:
                intendedAnimal = new Dog();
                break;
            case 1:
                intendedAnimal = new Tiger();
                break;
            default:
                System.out.println("You must enter either 0 or 1");
                //We'll throw a runtime exception for any other choices.
                throw new IllegalArgumentException(" Your choice tries to create an unknown Animal");
        }
        return intendedAnimal;
    }
}
