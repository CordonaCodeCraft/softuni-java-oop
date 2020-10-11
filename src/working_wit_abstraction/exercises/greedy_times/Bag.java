package working_wit_abstraction.exercises.greedy_times;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
    private final Long capacity;
    private final Map<String, Map<String, Long>> content;

    public Bag(String input) {
        this.capacity = Long.parseLong(input);
        this.content = new LinkedHashMap<>();
        content.put("<Gold>", new HashMap<>());
        content.put("<Gem>", new HashMap<>());
        content.put("<Cash>", new HashMap<>());
    }

    public Long getGoldTotal() {
        return calculateTotal("<Gold>");

    }

    public Long getGemTotal() {
        return calculateTotal("<Gem>");

    }

    public Long getCashTotal() {
        return calculateTotal("<Cash>");

    }

    public Long getTotalCapacity() {
        return this.capacity;
    }

    public Map<String, Map<String, Long>> getContent() {
        return this.content;

    }

    public Long getCurrentTotal() {
        return getGoldTotal() + getGemTotal() + getCashTotal();

    }

    private Long calculateTotal(String type) {
        return this.content
                .get(type)
                .values()
                .stream()
                .reduce(0L, Long::sum);
    }
}
