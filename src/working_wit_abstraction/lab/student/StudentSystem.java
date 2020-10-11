package working_wit_abstraction.lab.student;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private final Map<String, Student> studentsRepository;

    public StudentSystem() {
        this.studentsRepository = new HashMap<>();
    }

    public void addStudentToRepository(String... arguments) {
        String name = arguments[1];
        int age = Integer.parseInt(arguments[2]);
        double grade = Double.parseDouble(arguments[3]);
        studentsRepository.putIfAbsent(name, new Student(name, age, grade));
    }

    public void printStudent(String... arguments) {
        String name = arguments[1];
        Student student = studentsRepository.get(name);
        String evaluation = studentEvaluation(name);
        System.out.printf("%s is %d years old. %s%n", student.getName(), student.getAge(), evaluation);
    }

    private String studentEvaluation(String name) {
        if (!studentsRepository.containsKey(name)) {
            double grade = studentsRepository.get(name).getGrade();
            if (grade >= 5.00) {
                return "Excellent student.";
            } else if (grade < 5.00 && grade >= 3.50) {
                return "Average student.";
            } else {
                return "Very nice person.";
            }
        } else {
            return "Missing person";
        }

    }

}
