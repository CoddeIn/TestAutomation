package ooademo;

public class LoggerFacade {
    private static Logger logger = new Logger(
            new SeverityMessageFilter(2),
            new FileMessagePrinter("log.txt")
    );

    public static void log (int message, int severity){
     logger.log(new IntMessage(message), severity);
    }
    public static void log (String message, int severity){
        logger.log(new StringMessage(message), severity);
    }
}