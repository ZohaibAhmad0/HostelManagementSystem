import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodsHostels {
    static Scanner input = new Scanner(System.in);
    private static List<Hostel> hostelList = new ArrayList<>();

    public static void addHostel() {
        System.out.println("Enter Hostel Details:");
        System.out.print("Branch ID: ");
        int branchID = input.nextInt();
        input.nextLine();
        System.out.print("Manager: ");
        String manager = input.nextLine();
        System.out.print("Rent: ");
        double rent = input.nextDouble();
        System.out.print("Expenses: ");
        double expenses = input.nextDouble();
        System.out.print("Income: ");
        double income = input.nextDouble();
        input.nextLine();
        System.out.print("Location: ");
        String location = input.nextLine();

        Hostel hostel = new Hostel(branchID, manager, rent, expenses, income, location);
        hostelList.add(hostel);
    }

    public static void removeHostel() {
        System.out.print("Enter Branch ID of the Hostel you want to remove: ");
        int branchID = input.nextInt();
        hostelList.removeIf(hostel -> hostel.getBranchID() == branchID);
    }

    public static void updateHostel() {
        System.out.print("Enter Branch ID of the Hostel you want to update: ");
        int branchID = input.nextInt();
        input.nextLine();

        for (Hostel hostel : hostelList) {
            if (hostel.getBranchID() == branchID) {
                System.out.println("Enter Updated Details:");
                System.out.print("Manager: ");
                String manager = input.nextLine();
                System.out.print("Rent: ");
                double rent = input.nextDouble();
                System.out.print("Expenses: ");
                double expenses = input.nextDouble();
                System.out.print("Income: ");
                double income = input.nextDouble();
                input.nextLine();
                System.out.print("Location: ");
                String location = input.nextLine();

                hostel.setManager(manager);
                hostel.setRent(rent);
                hostel.setExpenses(expenses);
                hostel.setIncome(income);
                hostel.setLocation(location);
                break;
            }
        }
    }

    public static void displayAllHostels() {
        System.out.println("All Hostels:");
        for (Hostel hostel : hostelList) {
            hostel.displayHostelInfo();
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Add Hostel");
            System.out.println("2. Remove Hostel");
            System.out.println("3. Update Hostel");
            System.out.println("4. Display All Hostels");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addHostel();
                    break;
                case 2:
                    removeHostel();
                    break;
                case 3:
                    updateHostel();
                    break;
                case 4:
                    displayAllHostels();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
}
