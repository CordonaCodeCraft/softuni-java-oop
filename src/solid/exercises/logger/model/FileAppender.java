package solid.exercises.logger.model;

import solid.exercises.logger.enums.LayoutType;
import solid.exercises.logger.enums.ReportLevel;
import solid.exercises.logger.service.LayoutService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileAppender extends Appender {
    File file;
    Integer size;

    public FileAppender(LayoutService layoutService, LayoutType layoutType, ReportLevel reportLevel) {
        super(layoutService, layoutType, reportLevel);
        this.file = new File("D:\\Gdrive\\Inbox\\report.txt");
        this.size = 0;
    }

    @Override
    protected void getReport() throws IOException {
        String summary = super.aggregateMessages();
        Writer writer = new FileWriter(file);
        writer.write(summary);
        writer.flush();

        calculateFileSize(summary);
    }

    private void calculateFileSize(String summary) {
        for (int i = 0; i < summary.length(); i++) {

            char character = summary.charAt(i);

            if (Character.isLetter(summary.charAt(i))) {
                this.size += character;
            }

        }
    }

    @Override
    public String getAppenderInfo() {
        return super.getAppenderInfo() + String.format(", File size: %d", this.size);
    }
}
