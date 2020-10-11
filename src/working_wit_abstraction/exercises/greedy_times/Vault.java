package working_wit_abstraction.exercises.greedy_times;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Vault {
    private final Map<String, Map<String, Long>> items;

    public Vault() {
        this.items = new LinkedHashMap<>();
        this.items.put("<Gold>", new HashMap<>());
        this.items.put("<Gem>", new HashMap<>());
        this.items.put("<Cash>", new HashMap<>());
    }


    public Long getGoldTotal() {
        return calculateTotal("Gold");

    }

    public Long getGemTotal() {
        return calculateTotal("Gems");

    }

    public Long getCashTotal() {
        return calculateTotal("Cash");

    }

    private Long calculateTotal(String type) {
        return this.items
                .get(type)
                .values()
                .stream()
                .reduce(0L, Long::sum);
    }


    public Map<String, Map<String, Long>> getItems() {
        return this.items;

    }
}
