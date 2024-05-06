import java.util.ArrayList;
import java.util.List;

public class Hostel {
    private Integer branchID;
    private String manager;
    private Double rent;
    private Double expenses;
    private Double income;
    private String location;

    private static List<Hostel> hostelList = new ArrayList<>();

    public Hostel(Integer branchID, String manager, Double rent, Double expenses, Double income, String location) {
        setBranchID(branchID);
        setManager(manager);
        setRent(rent);
        setExpenses(expenses);
        setIncome(income);
        setLocation(location);
    }

    public Integer getBranchID() {
        return branchID;
    }

    public void setBranchID(Integer branchID) {

        if (branchID == null || branchID < 0) {
            throw new IllegalArgumentException("Error: Branch ID must be a non-negative number.");
        }
        this.branchID = branchID;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {

        if (rent == null || rent < 0) {
            throw new IllegalArgumentException("Error: Rent must be a non-negative number.");
        }
        this.rent = rent;
    }

    public Double getExpenses() {
        return expenses;
    }

    public void setExpenses(Double expenses) {

        if (expenses == null || expenses < 0) {
            throw new IllegalArgumentException("Error: Expenses must be a non-negative number.");
        }
        this.expenses = expenses;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {

        if (income == null || income < 0) {
            throw new IllegalArgumentException("Error: Income must be a non-negative number.");
        }
        this.income = income;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayHostelInfo() {
        System.out.println("Hostel Information:");
        System.out.println("Branch ID: " + branchID);
        System.out.println("Manager: " + manager);
        System.out.println("Location: " + location);
        System.out.println("Rent: " + rent);
        System.out.println("Expenses: " + expenses);
        System.out.println("Income: " + income);
    }

    public static void addHostel(Hostel hostel) {
        hostelList.add(hostel);
    }

    public static void removeHostel(Integer branchID) {
        Hostel hostelToRemove = null;
        for (Hostel hostel : hostelList) {
            if (hostel.getBranchID().equals(branchID)) {
                hostelToRemove = hostel;
                break;
            }
        }
        if (hostelToRemove != null) {
            hostelList.remove(hostelToRemove);
        }
    }

    public static void updateHostel(Integer branchID, String manager, Double rent, Double expenses, Double income, String location) {
        for (Hostel hostel : hostelList) {
            if (hostel.getBranchID().equals(branchID)) {
                hostel.setManager(manager);
                hostel.setRent(rent);
                hostel.setExpenses(expenses);
                hostel.setIncome(income);
                hostel.setLocation(location);
                break;
            }
        }
    }
}
