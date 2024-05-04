import java.util.ArrayList;
import java.util.Scanner;

public class MethodsStudents
{
    Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public void addStudent()
    {
        String cnic;
        String fName;
        String lName;
        int studentID;
        int roomNo;
        RentStatus rentStatus = RentStatus.pending;
        RoomType roomType = null;

        int roomtype;
        int streetNumber;
        String area;
        String country;
        String city;
        String lineNumber;
        String email;
        int countryCode;

        System.out.print("Enter Student CNIC: ");
        cnic = input.nextLine();
        studentID = 0;
        System.out.print("Enter Student First Name: ");
        fName = input.nextLine();
        fName = fName.toUpperCase();
        System.out.print("Enter Student First Name: ");
        lName = input.nextLine();
        lName = lName.toUpperCase();
        System.out.println("Enter Student Room Type. ");
        System.out.println("Press 1 for Single Sharing.");
        System.out.println("Enter 2 for Double Sharing. ");
        roomtype = input.nextInt();
        if (roomtype == 1)
        {
            roomType = RoomType.SingleSharing;
        }
        else if (roomtype == 2)
        {
            roomType = RoomType.DoubleSharing;
        }
        System.out.print("Enter Student Room Number: ");
        roomNo = input.nextInt();

        System.out.println("Enter Student Address");

        System.out.print("Enter Student Country: ");
        country = input.nextLine();
        System.out.print("Enter Student City: ");
        city = input.nextLine();
        System.out.print("Enter Student Area: ");
        area = input.nextLine();
        System.out.println("Enter Student Street Number: ");
        streetNumber = input.nextInt();

        System.out.println("Enter Student Contact Information");

        System.out.println("Enter Student Country Code: ");
        countryCode = input.nextInt();
        System.out.print("Enter Student Line Number: ");
        lineNumber = input.nextLine();
        System.out.print("Enter Student email: ");
        email = input.nextLine();

        ContactInfo contact = new ContactInfo(countryCode, lineNumber, email);
        AddressInfo address = new AddressInfo(streetNumber, area, city, country, contact);
        Student student = new Student(cnic, fName, lName, address, studentID, roomNo, roomType);
        students.add(student);
        student.setStudentID(students.indexOf(student) + 1);

    }

    public void removeStudent()
    {
        String fName;
        System.out.print("Enter first Name of the Student you want to remove: ");
        fName = input.nextLine();
        fName = fName.toUpperCase();
        for (Student student : students) {
            if (student.getFirstName().equals(fName)) {
                students.remove(students.indexOf(student));
            }
        }
    }

    public void searchStudent()
    {
        String fName;
        int menu;
        System.out.print("Enter first Name of the Student you want to search: ");
        fName = input.nextLine();
        fName = fName.toUpperCase();
        for (Student student : students)
        {
            if (student.getFirstName().equals(fName))
            {
                System.out.println("Press 1 to Display Credentials.");
                System.out.println("Press 2 to Pay Rent by Online Payment.");
                System.out.println("Press 3 to Pay Rent by Cash Payment.");
                System.out.println("Press 4 to Update Student Entities.");

                menu = input.nextInt();
                switch (menu)
                {
                    case 1:
                    {

                        System.out.println("Student ID: " + student.getStudentID());
                        System.out.println("Student First Name: " + student.getFirstName());
                        System.out.println("Student Last Name: " + student.getLastName());
                        System.out.println("Student CNIC: " + student.getCNIC());
                        System.out.println("Student Room Number: " + student.getRoomNo());
                        System.out.println("Address Information");
                        System.out.println("Student Country: " + student.getAddressinfo().getCountry());
                        System.out.println("Student City: " + student.getAddressinfo().getCity());
                        System.out.println("Student Area: " + student.getAddressinfo().getArea());
                        System.out.println("Student Street Number: " + student.getAddressinfo().getstreetNumber());
                        System.out.println("Contact Information");
                        System.out.println("Student Country Code: " + student.getAddressinfo().getContactInfo().getCountryCode());
                        System.out.println("Student LineNumber: " + student.getAddressinfo().getContactInfo().getLineNumber());
                        System.out.println("Student Email: " + student.getAddressinfo().getContactInfo().getEmail());
                        System.out.println("Student Rent Status: " + student.getRentStatus());
                        break;
                    }
                    case 2:
                    {
                        double amount;
                        System.out.print("Enter Amount: ");
                        amount = input.nextDouble();
                        student.payRentOnline(amount);
                        System.out.println("Your Pending Rent is " + student.getRentInfo().getRentPending());
                        break;
                    }
                    case 3:
                    {

                        double amount;
                        System.out.print("Enter Amount: ");
                        amount = input.nextDouble();
                        student.payRentCash(amount);
                        System.out.println("Your Pending Rent is " + student.getRentInfo().getRentPending());
                        break;
                    }
                    case 4:
                    {
                        int menu2, menu3;
                        System.out.println("Press 1 to Upgrade Student Room Type.");
                        System.out.println("Press 2 to Change Room Number.");
                        menu2 = input.nextInt();
                        if(menu2 == 1)
                        {

                            System.out.println("Press 1 to Upgrade to Single Sharing.");
                            System.out.println("Press 2 to Degrade to Double Sharing.");
                            menu3 = input.nextInt();
                            if(menu3 == 1)
                            {
                                student.setRoomType(RoomType.SingleSharing);
                                System.out.println("Room Type successfully changed to Single Sharing.");
                            }
                            else if (menu3 == 2)
                            {
                                student.setRoomType(RoomType.DoubleSharing);
                                System.out.println("Room Type successfully changed to Double Sharing.");
                            }
                        }
                        if(menu2 == 2)
                        {
                            int roomNo;
                            System.out.print("Student's Current Room Number is " + student.getRoomNo() + ".");
                            System.out.print("Enter Student's New Room Number :");
                            roomNo = input.nextInt();
                            student.setRoomNo(roomNo);
                            System.out.println("Room Number Changed Successfully.");
                        }
                        break;
                    }
                }
            }
        }

    }
    public static void displayAllStudents()
    {
        for (Student student : students )
        {
            System.out.println("Student ID: " + student.getStudentID());
            System.out.println("Student First Name: " + student.getFirstName());
            System.out.println("Student Last Name: " + student.getLastName());
            System.out.println("Student CNIC: " + student.getCNIC());
            System.out.println("Student Room Number: " + student.getRoomNo());
            System.out.println("Address Information");
            System.out.println("Student Country: " + student.getAddressinfo().getCountry());
            System.out.println("Student City: " + student.getAddressinfo().getCity());
            System.out.println("Student Area: " + student.getAddressinfo().getArea());
            System.out.println("Student Street Number: " + student.getAddressinfo().getstreetNumber());
            System.out.println("Contact Information");
            System.out.println("Student Country Code: " + student.getAddressinfo().getContactInfo().getCountryCode());
            System.out.println("Student LineNumber: " + student.getAddressinfo().getContactInfo().getLineNumber());
            System.out.println("Student Email: " + student.getAddressinfo().getContactInfo().getEmail());
            System.out.println("Student Rent Status: " + student.getRentStatus());
            System.out.println();
        }
    }
     public void displayDefaulters()
     {
         for(Student student: students)
         {
             if(student.getRentStatus().equals(RentStatus.pending))
             {
                 System.out.println();
                 System.out.println("Student ID: " + student.getStudentID());
                 System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
                 System.out.println("Room Number: " + student.getRoomNo());
                 System.out.println("Phone Number: " + student.getAddressinfo().getContactInfo().getCountryCode() + " " + student.getAddressinfo().getContactInfo().getLineNumber());
                 System.out.println("Email: " + student.getAddressinfo().getContactInfo().getEmail());
                 System.out.println("Room Type: " + student.getRoomType());
                 System.out.println("Rent Pending: " + student.getRentInfo().getRentPending());
                 System.out.println("Rent Paid: " + student.getRentInfo().getRentPaid());
                 System.out.println();
                 System.out.println();
             }
         }
     }
}
