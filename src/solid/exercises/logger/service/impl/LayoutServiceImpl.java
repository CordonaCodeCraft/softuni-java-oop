package solid.exercises.logger.service.impl;

import solid.exercises.logger.service.LayoutService;

public class LayoutServiceImpl implements LayoutService {

    @Override
    public String useSimpleLayout(String level, String time, String message) {
        return String.format("%s - %s - %s", time, level, message);
    }

    @Override
    public String useXMLLayout(String level, String time, String message) {

        StringBuilder builder = new StringBuilder();

        builder.append("<log>").append(System.lineSeparator());
        builder.append(String.format("<date>%s</date>",time)).append(System.lineSeparator());
        builder.append(String.format("<level>%s</level>", level)).append(System.lineSeparator());
        builder.append(String.format("<message>%s</message>", message)).append(System.lineSeparator());
        builder.append("<log>").append(System.lineSeparator());

        return builder.toString();

    }
}
