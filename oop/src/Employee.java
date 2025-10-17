public class Employee {

  private String name;
  private int PIN;
  private float salary;

  public Employee() {
  }

  public Employee(String n, int p, float s) {
    this.name = n;
    this.PIN = p;
    this.salary = s;
  }

  public void setName(String n) {
    this.name = n;
  }

  public void setPIN(int p) {
    this.PIN = p;
  }

  public void setSalary(float s) {
    this.salary = s;
  }

  public String getName() {
    return name;
  }

  public int getPIN() {
    return PIN;
  }

  public float getSalary() {
    return salary;
  }

  public void printinfo() {

    System.out.println(name + " " + PIN + " " + salary);

  }
}
