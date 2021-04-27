package ooademo;

import ooademo.controler.Logger;
import ooademo.domain.SeverityLevel;
import ooademo.filter.SeverityMessageFilter;
import ooademo.domain.message.IntMessage;
import ooademo.domain.message.StringMessage;
import ooademo.printer.FileMessagePrinter;

import static ooademo.domain.SeverityLevel.*;

public class ApplicationFramework {
    public static void main (String[] args){
        final Logger logger = new Logger(
                new SeverityMessageFilter(ERROR),
                new FileMessagePrinter("out.log")
        );
        LoggerFacade.log(1, 1);
        LoggerFacade.log("Str message", 2);
        logger.log(new IntMessage(1), DEBUG);
        logger.log(new StringMessage("Str message object"), ERROR);
    }

}
