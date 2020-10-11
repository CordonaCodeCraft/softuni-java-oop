package interfaces.exercises.collection_hierarchy;

import interfaces.exercises.collection_hierarchy.collections.AddCollection;
import interfaces.exercises.collection_hierarchy.collections.AddRemoveCollection;
import interfaces.exercises.collection_hierarchy.collections.MyListImpl;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, List<List<String>>> dataAggregator = new LinkedHashMap<>();
        dataAggregator.put("Addables", new ArrayList<>());
        dataAggregator.put("Removables", new ArrayList<>());

        for (int i = 1; i <= 3; i++) {
            dataAggregator.get("Addables").add(new ArrayList<>());
        }

        for (int i = 1; i <= 2; i++) {
            dataAggregator.get("Removables").add(new ArrayList<>());
        }

        Scanner scanner = new Scanner(System.in);

        AddCollection addable = new AddCollection();
        AddRemoveCollection addableAndRemovable = new AddRemoveCollection();
        MyListImpl listImplementation = new MyListImpl();

        String[] tokens = scanner.nextLine().split("\\s+");

        for (String token : tokens) {

            int addableIndex = addable.add(token);
            dataAggregator.get("Addables").get(0).add(String.valueOf(addableIndex));

            int addableAndRemovableIndex = addableAndRemovable.add(token);
            dataAggregator.get("Addables").get(1).add(String.valueOf(addableAndRemovableIndex));

            int listImplementationIndex = listImplementation.add(token);
            dataAggregator.get("Addables").get(2).add(String.valueOf(listImplementationIndex));
        }

        int removeCount = Integer.parseInt(scanner.nextLine());

        while (--removeCount >= 0) {
            String addableAndRemovableProduct = addableAndRemovable.remove();
            dataAggregator.get("Removables").get(0).add(addableAndRemovableProduct);

            String listImplementationProduct = listImplementation.remove();
            dataAggregator.get("Removables").get(1).add(listImplementationProduct);
        }

        dataAggregator.get("Addables").forEach(Main::printList);
        dataAggregator.get("Removables").forEach(Main::printList);
    }

    private static void printList(List<String> list) {
        list.forEach(element -> System.out.print(String.format("%s ", element)));
        System.out.println();
    }

}


