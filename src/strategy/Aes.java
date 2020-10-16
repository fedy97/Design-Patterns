package strategy;

public class Aes implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println(message + " encrypted with Des");
    }
}
