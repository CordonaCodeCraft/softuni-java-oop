package solid.exercises.logger.model;

import solid.exercises.logger.enums.LayoutType;
import solid.exercises.logger.enums.ReportLevel;
import solid.exercises.logger.service.LayoutService;

public class ConsoleAppender extends Appender {

    public ConsoleAppender(LayoutService layoutService, LayoutType layoutType, ReportLevel reportLevel) {
        super(layoutService, layoutType, reportLevel);
    }

    @Override
    protected void getReport() {
        System.out.println(super.aggregateMessages());
    }
}
