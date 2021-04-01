package solid.exercises.logger.model;

import java.io.IOException;
import java.util.List;

public class Logger {

    List<Appender> appenders;

    public Logger(List<Appender> appenders) {
        this.appenders = appenders;
    }

    public void logMessage(String input) {

        String[] tokens = input.split("\\|");
        String reportLevel = tokens[0].trim();
        String time = tokens[1].trim();
        String message = tokens[2].trim();

        appenders.forEach(appender -> appender.appendMessage(reportLevel, time, message));

    }

    public void printReports() throws IOException {
        for (Appender appender : this.appenders) {
            appender.getReport();
        }
    }

    public String printAppendersInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Logger info").append(System.lineSeparator());
        this.appenders.forEach(appender -> builder.append(appender.getAppenderInfo()).append(System.lineSeparator()));
        return builder.toString().trim();
    }
}
