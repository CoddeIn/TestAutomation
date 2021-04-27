package ooademo;

import ooademo.controler.Logger;
import ooademo.domain.SeverityLevel;
import ooademo.filter.SeverityMessageFilter;
import ooademo.domain.message.IntMessage;
import ooademo.domain.message.StringMessage;
import ooademo.printer.FileMessagePrinter;

public class LoggerFacade {
    private static Logger logger = new Logger(
            new SeverityMessageFilter(SeverityLevel.WARNING),
            new FileMessagePrinter("log.txt")
    );

    //TODO: FIX severity level by int 1 -> ERROR, 2-> DEBUG, now it's hardcoded
    public static void log (int message, int severity){
     logger.log(new IntMessage(message), SeverityLevel.WARNING);
    }
    public static void log (String message, int severity){
        logger.log(new StringMessage(message), SeverityLevel.WARNING);
    }
}
