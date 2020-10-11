package inheritance.lab.random_array_list;

import java.util.ArrayList;
import java.util.Random;

public class  CustomArrayList<T> extends ArrayList<T> {

  public void GetRandomElement() {
      Random random = new Random();
      int randomIndex = random.nextInt(super.size());
      System.out.println(this.get(randomIndex));
      super.remove(randomIndex);
  }

}
