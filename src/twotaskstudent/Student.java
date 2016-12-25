package twotaskstudent;

public class Student {
  public String name;
  public String group;
  public int curs;

  Student() {
    name = "";
    group = "";
    curs = 1;
  }

  Student(String name, String group, int curs) {
    this.name = name;
    this.group = group;
    this.curs = curs;
  }

  public void info() {
    System.out.printf("Name = %s, Group = %s, Course = %d", name, group, curs);
  }
}
