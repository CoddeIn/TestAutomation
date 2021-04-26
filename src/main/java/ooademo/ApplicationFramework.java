package ooademo;

public class ApplicationFramework {
    public static void main (String[] args){
        final Logger logger = new Logger(
                new SeverityMessageFilter(2),
                new FileMessagePrinter("out.log")
        );
        logger.log("Str0",0);
        logger.log("Str1",1);
        logger.log("Str2",2);
        logger.log(null,2);
        logger.log("Str1",0);
    }

}
