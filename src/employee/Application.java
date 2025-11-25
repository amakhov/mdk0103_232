package employee;
import employee.EmployeeList;

public class Application {
    public static void main(String[] args) {
//        Employee employee1 = new Employee("arthur", "yandex", 20);
//        Employee employee2 = new Employee("vasya", "google", 2000, 25 );
//        Employee employee3 = new Employee("petya", "ozon", 20);
//
//        employee3.displaySalary();
        EmployeeList employeeList = new EmployeeList(10);
        employeeList.print();


    }
}
