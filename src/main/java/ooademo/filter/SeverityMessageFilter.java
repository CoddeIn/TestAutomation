package ooademo.filter;

import ooademo.message.Message;

public class SeverityMessageFilter implements MessageFilter{
    private int threshold;

    public SeverityMessageFilter (int threshold){
        this.threshold = threshold;
    }

    @Override
    public boolean filter (Message message, int severity){
        return severity < threshold;
    }

}
