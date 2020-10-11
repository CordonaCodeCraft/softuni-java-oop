package interfaces.exercises.telephony;

import interfaces.exercises.telephony.interfaces.Browsable;
import interfaces.exercises.telephony.interfaces.Callable;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private final List<String> numbers;
    private final List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();

        numbers.forEach(number -> appendNumberMessage(number, builder));

        return builder.toString();
    }

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();

        urls.forEach(url -> appendUrlMessage(url, builder));

        return builder.toString();
    }

    private void appendNumberMessage(String number, StringBuilder builder) {

        boolean isValidNumber = number.matches("^[0-9]*$");

        if (isValidNumber) {
            builder.append(String.format("Calling... %s", number)).append(System.lineSeparator());
        } else {
            builder.append("Invalid number!").append(System.lineSeparator());
        }

    }

    private void appendUrlMessage(String url, StringBuilder builder) {

        boolean isNotValidURL = url.matches(".*\\d+.*");

        if (isNotValidURL) {
            builder
                    .append("Invalid URL!")
                    .append(System.lineSeparator());
        } else {
            builder
                    .append(String.format("Browsing: %s!", url))
                    .append(System.lineSeparator());
        }
    }
}
