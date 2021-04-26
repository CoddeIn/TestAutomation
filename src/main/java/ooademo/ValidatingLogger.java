package ooademo;

public abstract class ValidatingLogger {
    protected void validate(String message){
        if (message == null){
         System.out.println("Illegal Arggument");
        }
        }
    }

