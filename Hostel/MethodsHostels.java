import java.util.ArrayList;
import java.util.Scanner;

public class MethodsHostels {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Hostel> hostelList = new ArrayList<>();

    public static void addHostel() {
        System.out.println("Enter Hostel Details:");
        System.out.print("Enter the branch ID for the hostel: ");
        int branchID = input.nextInt();
        input.nextLine();
        System.out.print("Enter the manager of the hostel: ");
        String manager = input.nextLine();
        System.out.print("Enter the rent for the hostel: ");
        double rent = input.nextDouble();
        System.out.print("Enter the expenses: ");
        double expenses = input.nextDouble();
        System.out.print("Enter the income : ");
        double income = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the location of the hostel: ");
        String location = input.nextLine();

        Hostel hostel = new Hostel(branchID, manager, rent, expenses, income, location);
        hostelList.add(hostel);
        System.out.println("Hostel added successfully!");
    }

    public static void updateHostel() {
        System.out.print("Enter Branch ID of the Hostel you want to update: ");
        int branchID = input.nextInt();
        input.nextLine();

        Hostel hostel = findHostel(branchID);
        if (hostel != null) {
            System.out.println("Select what you want to update:");
            System.out.println("1. Manager");
            System.out.println("2. Rent");
            System.out.println("3. Expenses");
            System.out.println("4. Income");
            System.out.println("5. Location");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter updated Manager: ");
                    hostel.setManager(input.nextLine());
                    break;
                case 2:
                    System.out.print("Enter updated Rent: ");
                    hostel.setRent(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter updated Expenses: ");
                    hostel.setExpenses(input.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter updated Income: ");
                    hostel.setIncome(input.nextDouble());
                    break;
                case 5:
                    System.out.print("Enter updated Location: ");
                    hostel.setLocation(input.nextLine());
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("Hostel details updated successfully!");
        } else {
            System.out.println("Hostel with Branch ID " + branchID + " not found.");
        }
    }

    public static void removeHostel() {
        System.out.print("Enter Branch ID of the Hostel you want to remove: ");
        int branchID = input.nextInt();
        input.nextLine();

        Hostel hostel = findHostel(branchID);
        if (hostel != null) {
            hostelList.remove(hostel);
            System.out.println("Hostel removed successfully!");
        } else {
            System.out.println("Hostel with Branch ID " + branchID + " not found.");
        }
    }

    public static void displayAllHostels() {
        if (hostelList.isEmpty()) {
            System.out.println("No hostels to display.");
        } else {
            System.out.println("All Hostels:");
            for (Hostel hostel : hostelList) {
                System.out.println("Branch ID of Hostel: " + hostel.getBranchID());
                System.out.println("Manager of Hostel: " + hostel.getManager());
                System.out.println("Rent of Hostel: " + hostel.getRent());
                System.out.println("Expenses of Hostel: " + hostel.getExpenses());
                System.out.println("Income of Hostel: " + hostel.getIncome());
                System.out.println("Location of Hostel: " + hostel.getLocation());
                System.out.println();
            }
        }
    }

    private static Hostel findHostel(int branchID) {
        for (Hostel hostel : hostelList) {
            if (hostel.getBranchID() == branchID) {
                return hostel;
            }
        }
        return null;
    }
}
