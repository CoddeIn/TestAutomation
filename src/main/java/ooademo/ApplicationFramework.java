package ooademo;

import ooademo.controler.Logger;
import ooademo.filter.SeverityMessageFilter;
import ooademo.message.IntMessage;
import ooademo.message.StringMessage;
import ooademo.printer.FileMessagePrinter;

public class ApplicationFramework {
    public static void main (String[] args){
        final Logger logger = new Logger(
                new SeverityMessageFilter(2),
                new FileMessagePrinter("out.log")
        );
        LoggerFacade.log(1,0);
        LoggerFacade.log("Str message", 1);
        logger.log(new IntMessage(1),0);
        logger.log(new StringMessage("Str message object"), 1);
    }

}
