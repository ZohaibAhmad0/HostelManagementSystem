import java.util.Scanner;
import java.util.ArrayList;
public class MethodsExpense extends Expense
{
    public MethodsExpense(int expenseID, String expenseType, double expenseAmount)
    {
        super(expenseID, expenseType, expenseAmount);
    }
    static Scanner input = new Scanner(System.in);
    static ArrayList<Expense> expenses = new ArrayList<>();
    public static void addExpense()
    {
        int expenseID = 0 ;
        String expenseType;
        double expenseAmount;
        System.out.print("Enter Expense Amount: ");
        expenseAmount = input.nextDouble();
        System.out.print("Enter Expense Type: ");
        expenseType = input.nextLine().toUpperCase();
        Expense expense = new Expense(expenseID, expenseType, expenseAmount);
        expenses.add(expense);
        expenseID = expenses.indexOf(expense) + 1 ;

    }
    public static void displayExpenses ()
    {
        System.out.println("Total Salary Expenses: " + totalExpenses );
        System.out.println("Total Custom Expenses: " + calCustomExpenses() );
        System.out.println("Overall Expenses: " + (totalExpenses + calCustomExpenses()) );
        System.out.println("Salaries Paid: " + expnesesPaid );
        System.out.println("Salaries Pending: " + expensesPending );
    }
    private static double calCustomExpenses()
    {
        double customExpenses = 0.0;
        for(Expense expense: expenses)
        {
            customExpenses += expense.getExpenseAmount();
        }
        return customExpenses;
    }
}
