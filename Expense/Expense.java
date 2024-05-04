import java.util.Scanner;
public class Expense
{
    protected static double totalExpenses;
    protected static double expnesesPaid;
    protected static double expensesPending;
    private int expenseID ;
    private String expenseType;
    private double expenseAmount;
    public Expense(int expenseID, String expenseType, double expenseAmount )
    {
        totalExpenses = calExpectedExpense();
        expnesesPaid = calExpensePaid();
        expensesPending = calExpensesPending();
        setExpenseID(expenseID);
        setExpenseAmount(expenseAmount);
        setExpenseType(expenseType);
    }

    public int getExpenseID()
    {
        return expenseID;
    }

    public void setExpenseID(int expenseID)
    {
        this.expenseID = expenseID;
    }

    public String getExpenseType()
    {
        return expenseType;
    }

    public void setExpenseType(String expenseType)
    {
        this.expenseType = expenseType;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public double getTotalExpenses()
    {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses)
    {
        this.totalExpenses = totalExpenses;
    }
    private static double calExpectedExpense()
    {
        for (Employee employee: MethodsEmployee.employees)
        {
            totalExpenses += employee.getEmployeePosition().getSalary();
        }
        return totalExpenses;
    }
    private static double calExpensesPending()
    {
        for (Employee employee: MethodsEmployee.employees)
        {
            if(employee.getPayStatus().equals(PayStatus.pending))
            {
                expensesPending += employee.getPayInfo().getPayPending();
            }
        }
        return expensesPending;
    }
    private static double calExpensePaid()
    {
        for (Employee employee: MethodsEmployee.employees)
        {
            if(employee.getPayInfo().getPayPaid() != 0 )
            {
                expnesesPaid += employee.getPayInfo().getPayPaid();
            }
        }
        return expnesesPaid;
    }

}
