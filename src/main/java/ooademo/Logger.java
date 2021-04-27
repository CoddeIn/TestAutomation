package ooademo;

public class Logger extends ValidatingLogger {
    private static MessageFilter filter;
    private static MessagePrinter printer;

    public Logger(SeverityMessageFilter filter, FileMessagePrinter printer) {
        this.filter = filter;
        this.printer = printer;
    }

    public void log(Message message, int severity){
        this.validate(message);
        if (filter.filter(message, severity)){
            printer.print(message);
        }
    }


}
