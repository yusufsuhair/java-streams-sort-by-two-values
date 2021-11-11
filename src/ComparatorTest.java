import java.util.ArrayList;
import java.util.List;

public class ComparatorTest {
  public static void main(String[] args) {
    Employee emp1 = new Employee(1, "Yusuf", "Software Engineer");
    Employee emp2 = new Employee(2, "Nuha", "Nurse");
    Employee emp4 = new Employee(4, "Maryam", "Teacher");
    Employee emp5 = new Employee(3, "Kauthar", "Suri Rumah");
    Employee emp3 = new Employee(3, "Kauthar", "Accountant");
    Employee emp6 = new Employee(3, "Kauthar", "Abcountant");

    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(emp1);
    employeeList.add(emp2);
    employeeList.add(emp3);
    employeeList.add(emp4);
    employeeList.add(emp5);
    employeeList.add(emp6);

    employeeList.forEach(System.out::println);

    employeeList.sort((o1, o2) -> {
      int comparison;
      comparison = o1.getName().compareTo(o2.getName());

      if (comparison == 0) {
        comparison = o1.getDepartment().compareTo(o2.getDepartment());
      }

      return comparison;
    });

    System.out.println("-------- After --------");

    employeeList.forEach(System.out::println);
  }
}

class Employee {
  private int id;
  private String name;
  private String department;

  public Employee(int id, String name, String department) {
    this.id = id;
    this.name = name;
    this.department = department;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", department='" + department + '\'' +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }
}