package ooademo.controler;

import ooademo.domain.message.Message;

public abstract class ValidatingLogger {
    protected void validate(Message message){
        if (message == null){
         System.out.println("Illegal Argument");
        }
        }
    }

