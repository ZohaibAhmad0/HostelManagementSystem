import java.util.ArrayList;
import java.util.List;

public class Employee extends BasicCredentials {
    private static List<Employee> employees = new ArrayList<>();
    private String position;

    public Employee(String CNIC, String firstName, String lastName, AddressInfo address, String position) {
        super(CNIC, firstName, lastName, address);
        //this.position = position;
        setPosition(position);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    public static List<Employee> getEmployees() {
        return employees;
    }
}
