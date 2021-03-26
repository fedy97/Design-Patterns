package template;

/**
 * used when there is common task between classes to execute
 * but then classes can add something else before or after
 * that task is executed, in this case the closing tab task.
 */
public abstract class Window {

    protected abstract void doWorkBefore();
    protected abstract void doWorkAfter();

    public void close() {
        doWorkBefore();
        System.out.println("Removing the window from the screen");
        doWorkAfter();
    }
}
