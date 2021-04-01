package solid.exercises.logger;

import solid.exercises.logger.model.Appender;
import solid.exercises.logger.model.ConsoleAppender;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        String name = ConsoleAppender.class.getName();

        Class testClass = Class.forName(name);

        System.out.println(name);



    }
    


}
