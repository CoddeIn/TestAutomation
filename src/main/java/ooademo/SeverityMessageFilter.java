package ooademo;

public class SeverityMessageFilter implements MessageFilter{
    private int threshold;

    public SeverityMessageFilter (int threshold){
        this.threshold = threshold;
    }

    @Override
    public boolean filter (String message, int severity){
        return severity < threshold;
    }

}
