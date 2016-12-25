package threetaskcollection;

public class StudentCollection {
  private String lastName;
  private String name;
  private String group;
  private boolean marrierd;
  private int age;

  StudentCollection(String lname, String name1, String gr, boolean cr, int a) {
    lastName = lname;
    name = name1;
    group = gr;
    marrierd = cr;
    age = a;
  }

  String getLastname() {
    return lastName;
  }

  void setLastname(String last) {
    lastName = last;
  }

  String getName() {
    return name;
  }

  void setName(String name1) {
    name = name1;
  }

  String getGroup() {
    return group;
  }

  void setGroup(String gr) {
    group = gr;
  }

  boolean getMar() {
    return marrierd;
  }

  void setMar(boolean marr) {
    marrierd = marr;
  }

  int getAge() {
    return age;
  }

  void setAge(int age) {
    age = age;
  }
}
