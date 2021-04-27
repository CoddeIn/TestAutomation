package ooademo.filter;

import ooademo.domain.SeverityLevel;
import ooademo.domain.message.Message;

public class SeverityMessageFilter implements MessageFilter{
    private final SeverityLevel threshold;

    public SeverityMessageFilter (SeverityLevel threshold){
        this.threshold = threshold;
    }

    @Override
    public boolean filter (Message message, SeverityLevel severity){
        return severity.compareTo(threshold) < 0;
    }

}
