package solid.exercises.logger;

import solid.exercises.logger.model.Appender;
import solid.exercises.logger.model.Logger;
import solid.exercises.logger.util.Factory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Scanner scanner = new Scanner(System.in);

        List<Appender> appenders = generateAppenders(scanner);

        Logger logger = new Logger(appenders);

        while (true) {
            String input = scanner.nextLine();
                  
            if (input.equals("END")) {
                break;
            } else {
                logger.logMessage(input);
            }
        }

        logger.printReports();
        System.out.println(logger.printAppendersInfo());

    }

    private static List<Appender> generateAppenders(Scanner scanner) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        List<Appender> appenders = new ArrayList<>();

        int appendersCount = Integer.parseInt(scanner.nextLine());

        while (--appendersCount >= 0) {
            String input = scanner.nextLine();
            Appender appender = Factory.constructAppender(input);
            appenders.add(appender);
        }

        return appenders;
    }

}
