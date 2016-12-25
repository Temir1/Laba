package twotaskstudent;

public class Main {
  /** main */
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Student st1 = new Student("Темирлан", "МО-141", 3);
    st1.info();
    Student st2 = new Student("Михаил", "МО-141", 3);
    st2.info();
  }
}
