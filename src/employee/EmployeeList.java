package employee;
import employee.Employee;
import java.util.Random;

public class EmployeeList {
    private String[] random_names = {"Bob", "Michael", "Grigory"};
    private String[] random_companies = {"Apple", "Freightliner", "Google", "Samsung", "Burger King"};
    private Employee[] employeeList;
    public EmployeeList(int count) {
        this.employeeList = new Employee[count];

        Random random = new Random();
        for (int i=0; i<count; i++) {
            this.employeeList[i] = new Employee(random_names[random.nextInt(random_names.length)], random_companies[random.nextInt(random_companies.length)], 20000 + random.nextInt(100000), 21 + random.nextInt(60-21));
        }
    }

    public void print() {
        for (int i = 0; i < employeeList.length; i++) {
            employeeList[i].displayInfo();
        }
    }
}
