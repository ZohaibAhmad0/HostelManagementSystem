import java.util.Scanner;

public class Expense {
    protected static Double totalExpenses = 0.0;
    protected static Double expensesPaid = 0.0;
    protected static Double expensesPending = 0.0;
    private Integer expenseID;
    private String expenseType;
    private Double expenseAmount;

    public Expense(Integer expenseID, String expenseType, Double expenseAmount) {
        setExpenseID(expenseID);
        setExpenseAmount(expenseAmount);
        setExpenseType(expenseType);
    }

    public Integer getExpenseID() {
        return expenseID;
    }

    public void setExpenseID(Integer expenseID) {

        if (expenseID == null || expenseID < 0) {
            throw new IllegalArgumentException("Error: Expense ID must be a non-negative number.");
        }
        this.expenseID = expenseID;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {

        if (expenseType == null || !expenseType.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Error: Expense type must contain only letters.");
        }
        this.expenseType = expenseType;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Double expenseAmount) {

        if (expenseAmount == null || expenseAmount < 0) {
            throw new IllegalArgumentException("Error: Expense amount must be a non-negative number.");
        }
        this.expenseAmount = expenseAmount;
    }

    public static Double getTotalExpenses() {
        return totalExpenses;
    }

    public static void setTotalExpenses(Double totalExpenses) {

        if (totalExpenses == null || totalExpenses < 0) {
            throw new IllegalArgumentException("Error: Total expenses must be a non-negative number.");
        }
        Expense.totalExpenses = totalExpenses;
    }

    private static Double calExpectedExpense() {
        for (Employee employee : MethodsEmployee.employees) {
            totalExpenses += employee.getEmployeePosition().getSalary();
        }
        return totalExpenses;
    }

    private static Double calExpensesPending() {
        for (Employee employee : MethodsEmployee.employees) {
            if (employee.getPayStatus().equals(PayStatus.pending)) {
                expensesPending += employee.getPayInfo().getPayPending();
            }
        }
        return expensesPending;
    }

    private static Double calExpensePaid() {
        for (Employee employee : MethodsEmployee.employees) {
            if (employee.getPayInfo().getPayPaid() != 0) {
                expensesPaid += employee.getPayInfo().getPayPaid();
            }
        }
        return expensesPaid;
    }
}
