package ooademo;

public interface MessageFilter {
    boolean filter(Message message, int severity);
}
