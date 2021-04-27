package ooademo.printer;

import ooademo.domain.message.Message;

public class ConsoleMessagePrinter implements MessagePrinter {
    @Override
    public void print(Message message) {
        System.out.println(message.getDecoratedBody());
    }
}
