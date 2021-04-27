package ooademo.filter;

import ooademo.message.Message;

public interface MessageFilter {
    boolean filter(Message message, int severity);
}
