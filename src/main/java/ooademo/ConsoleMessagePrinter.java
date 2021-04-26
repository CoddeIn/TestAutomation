package ooademo;

public class ConsoleMessagePrinter implements MessagePrinter {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
