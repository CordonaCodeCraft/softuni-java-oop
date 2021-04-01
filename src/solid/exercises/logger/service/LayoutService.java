package solid.exercises.logger.service;

public interface LayoutService {

    String useSimpleLayout(String level, String time, String message);

    String useXMLLayout(String level, String time, String message);

}
