package threetaskcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Stream;

public class MainCooll {
  /** main */
  public static void main(String[] args) {
    ArrayList<String> mactype = new ArrayList<String>();
    mactype.add("Ghibli");
    mactype.add("Quatroporte");
    mactype.add("Gran Turismo");
    System.out.println("В списке элемента: " + mactype.size());
    System.out.println();
    for (String mac : mactype) {
      System.out.println(mac);
    }
    System.out.println();
    if (mactype.contains("Ghibli")) {
      System.out.println("Have type Macerati Ghibli");
    }
    System.out.println();
    System.out.println("Удален Quatroporte из списка");
    mactype.remove(1);
    Object[] ob = mactype.toArray();
    for (Object o : ob) {
      System.out.println(o);
    }
    LinkedList<StudentCollection> stud = new LinkedList<StudentCollection>();
    stud.add(new StudentCollection("Denisov", "Nikolay", "MO-141", true, 21));
    stud.add(new StudentCollection("Mamro", "Micail", "MO-141", false, 20));
    stud.add(new StudentCollection("Ismagulov", "Temirlan", "MO-141", false, 19));
    stud.add(new StudentCollection("Ivanov", "Ivan", "MO-141", false, 17));
    stud.add(new StudentCollection("Ivanov", "Andrey", "MO-141", true, 19));
    System.out.println();
    for (StudentCollection st : stud) {
      System.out.print("Student: ");
      System.out.println(st.getLastname()
              + " " + st.getName()
              + " " + st.getGroup()
              + " " + st.getMar()
              + " курс " + st.getAge() + "лет");
    }
    Stream<StudentCollection> myStream =
            stud.stream().filter(n -> n.getAge() > 18).filter(n -> !n.getMar());
    System.out.println("Список кто годен в армию: ");
    myStream.forEach(n -> System.out.println(n.getName()));
    Stream<StudentCollection> myStr = stud.stream().filter(n -> n.getAge() < 18);
    System.out.println("Список кто нЕ годен в армию: ");
    myStr.forEach(n -> System.out.println(n.getName()));
  }
}
