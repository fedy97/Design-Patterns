package strategy;

public class Main {
    public static void main(String[] args) {
        var chatClient = new ChatClient(new Aes());

        chatClient.send("my really bad message");
    }
}
