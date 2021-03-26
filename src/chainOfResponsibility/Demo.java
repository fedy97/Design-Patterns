package chainOfResponsibility;

/**
 * try every program until we find the one we need.
 * stop as soon as we find it.
 */
public class Demo {
    public static void show() {
        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");
    }
}
