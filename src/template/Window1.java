package template;

public class Window1 extends Window {
    @Override
    protected void doWorkBefore() {
        System.out.println("window 1 doing some work before...");
    }

    @Override
    protected void doWorkAfter() {
        System.out.println("window 1 doing some work after...");
    }
}
