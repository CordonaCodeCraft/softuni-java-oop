package working_wit_abstraction.exercises.greedy_times;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Looter {
    private final Bag bag;
    private final Vault vault;
    Predicate<Long> isFreeSpaceInBag = quantity -> quantity + Looter.this.bag.getCurrentTotal() <= Looter.this.bag.getTotalCapacity();
    private int bullionCount;

    public Looter(Vault vault, Bag bag) {
        this.bag = bag;
        this.vault = vault;
        this.bullionCount = 0;
    }

    public void fillBag() {

        for (String group : this.vault.getItems().keySet()) {
            boolean isEnoughBagCapacity = bag.getCurrentTotal() < this.bag.getTotalCapacity();

            switch (group) {
                case "<Gold>":
                    sort(this.vault.getItems().get(group)).forEach(this::lootGold);
                    break;
                case "<Gem>":
                    if (isEnoughBagCapacity) {
                        sort(this.vault.getItems().get(group)).forEach(this::lootGems);
                    }
                    break;
                case "<Cash>":
                    if (isEnoughBagCapacity) {
                        sort(this.vault.getItems().get(group)).forEach(this::lootCash);
                    }
                    break;
            }
        }

    }

    private void lootGold(Map.Entry<String, Long> gold) {

        if (isFreeSpaceInBag.test(gold.getValue())) {
            this.bullionCount++;
            this.bag.getContent().get("<Gold>").put("Bullion: " + bullionCount, gold.getValue());
        }
    }

    private void lootGems(Map.Entry<String, Long> gem) {
        boolean canLootGem = true;

        if (this.bag.getGoldTotal() > 0) {
            canLootGem = gem.getValue() + this.bag.getGemTotal() <= this.bag.getGoldTotal();
        }

        if (isFreeSpaceInBag.test(gem.getValue()) && canLootGem) {
            this.bag.getContent().get("<Gem>").put(gem.getKey(), gem.getValue());
        }
    }

    private void lootCash(Map.Entry<String, Long> cash) {
        boolean canLootCash = true;

        if (this.bag.getGemTotal() > 0) {
            canLootCash = cash.getValue() + this.bag.getCashTotal() <= this.bag.getGemTotal();
        } else if (this.bag.getGoldTotal() > 0) {
            canLootCash = cash.getValue() + this.bag.getCashTotal() <= this.bag.getGoldTotal();
        }

        if (isFreeSpaceInBag.test(cash.getValue()) && canLootCash) {
            this.bag.getContent().get("<Cash>").put(cash.getKey(), cash.getValue());
        }
    }

    private Stream<Map.Entry<String, Long>> sort(Map<String, Long> group) {
        return group
                .entrySet()
                .stream()
                .sorted((first, second) -> Long.compare(second.getValue(), first.getValue()));
    }
}





