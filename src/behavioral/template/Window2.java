package behavioral.template;

public class Window2 extends Window {
    @Override
    protected void doWorkBefore() {
        System.out.println("window 2 doing some work before...");
    }

    @Override
    protected void doWorkAfter() {
        System.out.println("window 2 doing some work after...");
    }
}
