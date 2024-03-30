public class Expense
{
    private double totalExpenses;
    private int expenseID;
    private String expenseType;
    private double expenseAmount;

    public Expense(double totalExpenses, int expenseID, String expenseType, double expenseAmount)
    {
        setExpenseID(expenseID);
        setExpenseAmount(expenseAmount);
        setExpenseType(expenseType);
        setTotalExpenses(totalExpenses);
    }

    public double getTotalExpenses()
    {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses)
    {
        this.totalExpenses = totalExpenses;
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

    public double getExpenseAmount()
    {
        return expenseAmount;
    }

    public void setExpenseAmount(double expenseAmount)
    {
        this.expenseAmount = expenseAmount;
    }
}
