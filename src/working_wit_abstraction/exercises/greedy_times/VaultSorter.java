package working_wit_abstraction.exercises.greedy_times;

public class VaultSorter {
    private final Vault vault;
    private Integer bullionCounter;

    public VaultSorter(Vault vault) {
        this.vault = vault;
        this.bullionCounter = 0;
    }

    public void process(String input) {
        String[] tokens = input.split("\\s+");
        String item = "";

        for (String token : tokens) {
            boolean isMaterial = Character.isLetter(token.charAt(0));

            if (isMaterial) {
                item = token;
            } else {
                Long quantity = Long.parseLong(token);
                sort(item, quantity);
            }
        }
    }

    private void sort(String item, Long quantity) {

        boolean isGold = item.toLowerCase().equals("gold");
        boolean isGem = item.toLowerCase().contains("gem");
        boolean isCash = item.length() == 3;

        if (isGold) {
            this.bullionCounter++;
            String bullion = String.format("Bullion %d", bullionCounter);
            this.vault.getItems().get("<Gold>").put(bullion, quantity);
        } else if (isGem) {
            if (vault.getItems().get("<Gem>").containsKey(item)) {
                Long currentQuantity = vault.getItems().get("<Gem>").get(item);
                vault.getItems().get("<Gem>").put(item, currentQuantity + quantity);
            } else {
                vault.getItems().get("<Gem>").put(item, quantity);
            }
        } else if (isCash) {
            if (vault.getItems().get("<Cash>").containsKey(item)) {
                Long currentQuantity = vault.getItems().get("<Cash>").get(item);
                vault.getItems().get("<Cash>").put(item, currentQuantity + quantity);
            } else {
                vault.getItems().get("<Cash>").put(item, quantity);
            }
        }
    }


}
