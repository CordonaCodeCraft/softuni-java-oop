package encapsulation.lab.sort_by_name_and_age;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        int weight = first.compareTo(second);
        if (weight != 0)  {
            return weight;
        } else {
            return Integer.compare(first.getAge(), second.getAge());
        }
    }
}
