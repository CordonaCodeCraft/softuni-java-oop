package solid.exercises.logger.util;

import solid.exercises.logger.enums.LayoutType;
import solid.exercises.logger.enums.ReportLevel;
import solid.exercises.logger.model.Appender;
import solid.exercises.logger.service.LayoutService;
import solid.exercises.logger.service.impl.LayoutServiceImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public abstract class Factory {

    private static final LayoutService LAYOUT_SERVICE = new LayoutServiceImpl();

    public static Appender constructAppender(String input)
            throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String[] tokens = input.split("\\s+");

        String appenderType = tokens[0];
        LayoutType layoutType = setLayoutType(tokens[1]);
        ReportLevel reportLevel = setReportLevel(tokens);
        String modelPath = Appender.class.getPackageName() + "." + appenderType;
        Class<?> newInstance = Class.forName(modelPath);
        Constructor<?> modelConstructor = newInstance.getConstructor(LayoutService.class, LayoutType.class, ReportLevel.class);
        System.out.println();

        return (Appender) modelConstructor.newInstance(LAYOUT_SERVICE, layoutType, reportLevel);

    }

    private static LayoutType setLayoutType(String token) {

        String type = token.substring(0, token.indexOf("L")).toUpperCase();

        return Arrays
                .stream(LayoutType.values())
                .filter(e -> e.toString().contains(type))
                .findFirst()
                .orElseThrow();

    }

    private static ReportLevel setReportLevel(String[] tokens) {

        if (tokens.length == 2) {
            return ReportLevel.INFO;
        } else {
            return ReportLevel.valueOf(tokens[2]);
        }
    }

}
