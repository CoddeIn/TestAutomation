package ooademo.filter;

import ooademo.domain.SeverityLevel;
import ooademo.domain.message.Message;

public interface MessageFilter {
    boolean filter(Message message, SeverityLevel severity);
}
