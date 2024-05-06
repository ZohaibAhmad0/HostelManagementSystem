public class Hostel {
    private int branchID;
    private String manager;
    private double rent;
    private double expenses;
    private double income;
    private String location;

    public Hostel(int branchID, String manager, double rent, double expenses, double income, String location) {
        this.branchID = branchID;
        this.manager = manager;
        this.rent = rent;
        this.expenses = expenses;
        this.income = income;
        this.location = location;
    }

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
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
}