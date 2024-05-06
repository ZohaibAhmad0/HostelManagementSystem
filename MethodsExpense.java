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
        input.nextLine();
        System.out.print("Enter Expense Type: ");
        expenseType = input.nextLine().toUpperCase();
        Expense expense = new Expense(expenseID, expenseType, expenseAmount);
        expenses.add(expense);
        expense.setExpenseID(expenses.indexOf(expense)+1);

    }
    public static void removeExpense()
    {
        System.out.print("Enter Expense ID of the Custom Expense you want to remove: ");
        int branchID = input.nextInt();
        for(Expense expense: expenses)
        {
            if(expense.getExpenseID() == branchID)
            {
                expenses.remove(expense);
                break;
            }

        }
    }
    public static void updateExpense()
    {
        System.out.print("Enter Branch ID of the Custom Expense you want to update: ");
        int branchID = input.nextInt();
        input.nextLine();

        for(Expense expense: expenses)
        {
            if(expense.getExpenseID() == branchID)
            {
                int menu;
                do
                {
                    System.out.println("\nPress 1 to Update Expense Type. ");
                    System.out.println("Press 2 to Update Expense Amount. ");
                    System.out.println("Press 0 to Exit. ");
                    System.out.print("Enter your choice: ");
                    menu = input.nextInt();
                    input.nextLine();
                        if(menu == 1)
                        {
                            System.out.print("Enter Expense Type: ");
                            String expenseType = input.nextLine().toUpperCase();
                            expense.setExpenseType(expenseType);
                            break;
                        }
                        else if(menu == 2)
                        {
                            System.out.print("Enter Expense Amount: ");
                            double expenseAmount = input.nextDouble();
                            expense.setExpenseAmount(expenseAmount);
                            break;
                        }
                        else if(menu == 0)
                        {
                            System.out.println("Exiting...");
                            break;
                        }
                       else
                       {
                            System.out.println("Invalid choice. Please try again.");
                        }
                } while (true);
                break;
            }
        }

    }
    public static void displayExpenses ()
    {
        System.out.println("Total Salary Expenses: " + totalExpenses );
        System.out.println("Total Custom Expenses: " + calCustomExpenses() );
        System.out.println("Overall Expenses: " + (totalExpenses + calCustomExpenses()) );
        System.out.println("Salaries Paid: " + expensesPaid );
        System.out.println("Salaries Pending: " + expensesPending );
    }
    public static void displayCustomExpenses()
    {
        for (Expense expense: expenses)
        {
            System.out.println("Expense ID: " + expense.getExpenseID());
            System.out.println("Expense Type: " + expense.getExpenseType());
            System.out.println("Expense Amount: " + expense.getExpenseAmount());
        }
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
