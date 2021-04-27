package ooademo.controler;

import ooademo.domain.SeverityLevel;
import ooademo.filter.MessageFilter;
import ooademo.filter.SeverityMessageFilter;
import ooademo.domain.message.Message;
import ooademo.printer.FileMessagePrinter;
import ooademo.printer.MessagePrinter;

public class Logger extends ValidatingLogger {
    private static MessageFilter filter;
    private static MessagePrinter printer;

    public Logger(SeverityMessageFilter filter, FileMessagePrinter printer) {
        this.filter = filter;
        this.printer = printer;
    }

    public void log(Message message, SeverityLevel severity){
        this.validate(message);
        if (filter.filter(message, severity)){
            printer.print(message);
        }
    }


}
