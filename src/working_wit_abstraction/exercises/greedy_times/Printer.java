package working_wit_abstraction.exercises.greedy_times;

import java.util.Map;

public class Printer {
    private final Vault vault;
    private final Bag bag;
    private final StringBuilder builder;

    public Printer(Vault vault, Bag bag) {
        this.vault = vault;
        this.bag = bag;
        this.builder = new StringBuilder();

    }

    public void print() {

        for (String group : this.bag.getContent().keySet()) {

            Long thisGroupBagTotal = calculateTotal(group, this.bag.getContent());

            Long thisGroupVaultTotal = calculateTotal(group, this.vault.getItems());

            buildGroupHeader(group, thisGroupBagTotal, thisGroupVaultTotal);

            buildGroup(group, thisGroupBagTotal, thisGroupVaultTotal);

        }

        System.out.print(this.builder.toString());

    }

    private void buildGroupHeader(String group, Long thisGroupBagTotal, Long thisGroupVaultTotal) {

        if (thisGroupBagTotal > 0 && thisGroupVaultTotal > 0) {
            builder
                    .append(String.format("%s $%d", group, thisGroupBagTotal))
                    .append(System.lineSeparator());

        } else if (thisGroupVaultTotal == 0) {
            builder
                    .append(String.format("%s $%d", group, 0))
                    .append(System.lineSeparator());
        }

    }

    private void buildGroup(String group, Long thisGroupBagTotal, Long thisGroupVaultTotal) {

        if ((thisGroupBagTotal > 0 && thisGroupVaultTotal > 0)) {
            if (group.contains("Gold")) {
                this.builder
                        .append(String.format("##Gold - %d", this.bag.getGoldTotal()))
                        .append(System.lineSeparator());
            } else {
                this.bag.getContent()
                        .get(group)
                        .entrySet()
                        .stream()
                        .sorted(this::sort)
                        .forEach(item -> this.builder.append(String.format("##%s - %d", item.getKey(), item.getValue())).append(System.lineSeparator()));
            }
        }  else if (thisGroupVaultTotal == 0) {

            for (String item : this.bag.getContent().get(group).keySet()) {
                if (group.equals("<Gold>")) {
                    builder.append(String.format("##Gold - %d", 0)).append(System.lineSeparator());
                    break;
                } else {
                    builder.append(String.format("##%s - %d", item, 0)).append(System.lineSeparator());
                }
            }
        }
    }

    private int sort(Map.Entry<String, Long> first, Map.Entry<String, Long> second) {
        int weight = second.getKey().compareTo(first.getKey());
        if (weight != 0) {
            return weight;
        } else {
            return Long.compare(second.getValue(), first.getValue());
        }

    }


    public Long calculateTotal(String group, Map<String, Map<String, Long>> content) {
        return content.get(group)
                .values()
                .stream()
                .reduce(0L, Long::sum);
    }
}
