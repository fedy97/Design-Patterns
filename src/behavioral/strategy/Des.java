package behavioral.strategy;

public class Des implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println(message + " encrypted with Des");
    }
}
