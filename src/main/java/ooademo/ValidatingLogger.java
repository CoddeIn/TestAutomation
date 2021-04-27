package ooademo;

public abstract class ValidatingLogger {
    protected void validate(Message message){
        if (message == null){
         System.out.println("Illegal Arggument");
        }
        }
    }

