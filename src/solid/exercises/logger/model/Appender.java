package solid.exercises.logger.model;

import solid.exercises.logger.enums.LayoutType;
import solid.exercises.logger.enums.ReportLevel;
import solid.exercises.logger.service.LayoutService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Appender {

    LayoutService layoutService;
    LayoutType layoutType;
    ReportLevel reportLevel;
    List<String> messages;

    public Appender(LayoutService layoutService, LayoutType layoutType, ReportLevel reportLevel) {
        this.layoutService = layoutService;
        this.layoutType = layoutType;
        this.reportLevel = reportLevel;
        this.messages = new ArrayList<>();
    }

    protected void appendMessage(String reportLevel, String time, String message) {
        int threshold = this.reportLevel.ordinal();
        int messageLevel = ReportLevel.valueOf(reportLevel).ordinal();

        if (messageLevel >= threshold) {
            if (layoutType.equals(LayoutType.SIMPLE)) {
                String loggedMessage = layoutService.useSimpleLayout(reportLevel, time, message);
                this.messages.add(loggedMessage);
            } else if (layoutType.equals(LayoutType.XML)) {
                String loggedMessage = layoutService.useXMLLayout(reportLevel, time, message);
                this.messages.add(loggedMessage);
            }
        }
    }

    protected abstract void getReport() throws IOException;

    protected String aggregateMessages() {

        StringBuilder builder = new StringBuilder();

        this.messages
                .forEach(message -> builder.append(message).append(System.lineSeparator()));

        return builder.toString().trim();
    }


    public String getAppenderInfo() {

        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                this.getClass().getSimpleName(),
                this.layoutType.getName(),
                this.reportLevel,
                this.messages.size());
    }

}
