public class Run {
  public static void main(String[] args) {

    Employee e1 = new Employee();
    Employee e2 = new Employee("ahmed", 99376, 3500.0f);

    e1.setName("Ali");
    e1.setPIN(22376);
    e1.setSalary(5000.0f);

    e1.printinfo();
    e2.printinfo();

  }
}
