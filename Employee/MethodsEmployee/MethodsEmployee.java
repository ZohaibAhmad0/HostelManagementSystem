import java.util.ArrayList;
import java.util.Scanner;

public class MethodsEmployee
{
    public static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public void  addEmployee()
    {

        String cnic;
        String fName;
        String lName;
        EmployeePosition employeePosition = null;
        int position;

        System.out.print("Enter Employee CNIC: ");
        cnic = input.nextLine();
        System.out.print("Enter Employee First Name: ");
        fName = input.nextLine();
        fName = fName.toUpperCase();
        System.out.print("Enter Employee Last Name: ");
        lName = input.nextLine();
        lName = lName.toUpperCase();
        System.out.println("Choose Employee Position. ");
        System.out.println("Press 1 for Admin Post. ");
        System.out.println("Press 2 for Worker Post. ");
        System.out.println("Press 3 for Guard Post. ");
        position = input.nextInt();
        switch (position)
        {
            case 1:
            {
                employeePosition = EmployeePosition.ADMIN;
                break;
            }
            case 2:
            {
                employeePosition = EmployeePosition.WORKER;
                break;
            }
            case 3:
            {
                employeePosition = EmployeePosition.GUARD;
                break;
            }
        }
        AddressInfo address = getAddressInfo(input);

        Employee employee = new Employee(cnic, fName, lName, address, employeePosition);
        employees.add(employee);
    }

    public void removeEmployee()
    {
        System.out.print("Enter first Name of the Employee you want to remove: ");
        String fName = input.nextLine().toUpperCase();

        for (Employee employee : employees)
        {
            if (employee.getFirstName().equals(fName))
            {
                employees.remove(employee);
                break;
            }
        }
    }

    public static void searchEmployee()
    {
        String fName;
        int menu;
        System.out.print("Enter first Name of the Employee you want to search: ");
        fName = input.nextLine();
        fName = fName.toUpperCase();
        for (Employee employee : employees)
        {
            if (employee.getFirstName().equals(fName))
            {
                System.out.println("Press 1 to Display Credentials.");
                System.out.println("Press 2 to Pay Rent by Online Payment.");
                System.out.println("Press 3 to Pay Rent by Cash Payment.");
                System.out.println("Press 4 to promote/demote Employee.");
                menu = input.nextInt();
                switch (menu)
                {
                    case 1:
                    {

                        System.out.println("Employee CNIC: " + employee.getCNIC());
                        System.out.println("Employee First Name: " + employee.getFirstName());
                        System.out.println("Employee Last Name: " + employee.getLastName());
                        System.out.println("Employee Position: " + employee.getEmployeePosition());
                        System.out.println("Employee Salary: " + employee.getEmployeePosition().getSalary());
                        System.out.println("Address Information:");
                        System.out.println("Employee Country: " + employee.getAddressinfo().getCountry());
                        System.out.println("Employee City: " + employee.getAddressinfo().getCity());
                        System.out.println("Employee Area: " + employee.getAddressinfo().getArea());
                        System.out.println("Employee Street Number: " + employee.getAddressinfo().getstreetNumber());
                        System.out.println("Contact Information:");
                        System.out.println("Employee Country Code: " + employee.getAddressinfo().getContactInfo().getCountryCode());
                        System.out.println("Employee LineNumber: " + employee.getAddressinfo().getContactInfo().getLineNumber());
                        System.out.println("Employee Email: " + employee.getAddressinfo().getContactInfo().getEmail());
                        break;
                    }
                    case 2:
                    {
                        double amount;
                        System.out.print("Enter Amount: ");
                        amount = input.nextDouble();
                        employee.paySalaryOnline(amount);
                        System.out.println( "Pending Salary of " + employee.getFirstName() + " " + employee.getLastName() + " is " + employee.getPayInfo().getPayPending());
                        break;
                    }
                    case 3:
                    {

                        double amount;
                        System.out.print("Enter Amount: ");
                        amount = input.nextDouble();
                        employee.paySalaryCash(amount);
                        System.out.println( "Pending Salary of " + employee.getFirstName() + " " + employee.getLastName() + " is " + employee.getPayInfo().getPayPending());
                        break;
                    }
                    case 4:
                    {
                        int menu2;
                        if(employee.getEmployeePosition().equals(EmployeePosition.WORKER))
                            System.out.println("Press 1 to Upgrade to Admin Post.");
                        else if(employee.getEmployeePosition().equals(EmployeePosition.ADMIN))
                            System.out.println("Press 2 to Degrade to Worker.");
                        menu2 = input.nextInt();
                        if(menu2 == 1)
                        {
                            employee.setEmployeePosition(EmployeePosition.ADMIN);
                            System.out.println("Employee successfully Promoted to Admin Post.");
                        }
                        else if (menu2 == 2)
                        {
                            employee.setEmployeePosition(EmployeePosition.WORKER);
                            System.out.println("Employee successfully Demoted to Worker Post.");
                        }
                        break;
                    }
                }
            }
        }

    }

    public static void displayAllEmployees()
    {
        for (Employee employee : employees)
        {
            System.out.println("Employee CNIC: " + employee.getCNIC());
            System.out.println("Employee First Name: " + employee.getFirstName());
            System.out.println("Employee Last Name: " + employee.getLastName());
            System.out.println("Employee Position: " + employee.getEmployeePosition());
            System.out.println("Employee Salary: " + employee.getEmployeePosition().getSalary());
            System.out.println("Address Information:");
            System.out.println("Employee Country: " + employee.getAddressinfo().getCountry());
            System.out.println("Employee City: " + employee.getAddressinfo().getCity());
            System.out.println("Employee Area: " + employee.getAddressinfo().getArea());
            System.out.println("Employee Street Number: " + employee.getAddressinfo().getstreetNumber());
            System.out.println("Contact Information:");
            System.out.println("Employee Country Code: " + employee.getAddressinfo().getContactInfo().getCountryCode());
            System.out.println("Employee LineNumber: " + employee.getAddressinfo().getContactInfo().getLineNumber());
            System.out.println("Employee Email: " + employee.getAddressinfo().getContactInfo().getEmail());
            System.out.println();
        }
    }
    public void displayEmployeesWithPendingSalary()
    {
        for(Employee employee: employees)
        {
            if(employee.getPayStatus().equals(PayStatus.pending))
            {
                System.out.println();
                System.out.println("Employee ID: " + employee.getEmployeeID());
                System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
                System.out.println("Phone Number: " + employee.getAddressinfo().getContactInfo().getCountryCode() + " " + employee.getAddressinfo().getContactInfo().getLineNumber());
                System.out.println("Email: " + employee.getAddressinfo().getContactInfo().getEmail());
                System.out.println("Salary Pending: " + employee.getPayInfo().getPayPending());
                System.out.println("Salary Paid: " + employee.getPayInfo().getPayPaid());
                System.out.println();
                System.out.println();
            }
        }
    }

    private static AddressInfo getAddressInfo(Scanner input)
    {
        int streetNumber;
        String area;
        String country;
        String city;
        String lineNumber;
        String email;
        int countryCode;

        System.out.println("Enter Employee Address");

        System.out.print("Enter Employee Country: ");
        country = input.nextLine();
        System.out.print("Enter Employee City: ");
        city = input.nextLine();
        System.out.print("Enter Employee Area: ");
        area = input.nextLine();
        System.out.println("Enter Employee Street Number: ");
        streetNumber = input.nextInt();

        System.out.println("Enter Employee Contact Information");

        System.out.println("Enter Employee Country Code: ");
        countryCode = input.nextInt();
        System.out.print("Enter Employee Line Number: ");
        lineNumber = input.nextLine();
        lineNumber = input.nextLine();
        System.out.print("Enter Employee Email: ");
        email = input.nextLine();

        ContactInfo contact = new ContactInfo(countryCode, lineNumber, email);
        AddressInfo address = new AddressInfo(streetNumber, area, city, country, contact);
        return address;
    }
}
