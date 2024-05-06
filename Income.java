public class Income
{
    private static double totalExpectedIncome ;
    private static double totalRentReceived;
    private static double totalrentPending;


    public Income()
    {
       setTotalExpectedIncome(calExpectedRent());
       setTotalrentPending(calRentPending());
       setTotalRentReceived(calRentReceived());
    }


    public double getTotalExpectedIncome()
    {
        return totalExpectedIncome;
    }

    public void setTotalExpectedIncome(double totalExpectedIncome)
    {
        this.totalExpectedIncome = totalExpectedIncome;
    }

    public double getTotalRentReceived()
    {
        return totalRentReceived;
    }

    public void setTotalRentReceived(double totalRentReceived)
    {
        this.totalRentReceived = totalRentReceived;
    }

    public double getTotalrentPending()
    {
        return totalrentPending;
    }

    public void setTotalrentPending(double totalrentPending)
    {
        this.totalrentPending = totalrentPending;
    }
    private static double calExpectedRent()
    {
      for (Student student: MethodsStudents.students)
      {
          totalExpectedIncome += student.getRoomType().getRent();
      }
      return totalExpectedIncome;
    }
    private static double calRentPending()
    {
        for (Student student: MethodsStudents.students)
        {
            if(student.getRentStatus() == RentStatus.pending)
            {
                totalrentPending += student.getRentInfo().getRentPending();
            }
        }
        return totalrentPending;
    }
    private static double calRentReceived()
    {
        for (Student student: MethodsStudents.students)
        {
            if(student.getRentInfo().getRentPending() != 0 )
            {
                totalRentReceived += student.getRentInfo().getRentPaid();
            }
        }
        return totalRentReceived;
    }
    public static void displayExpectedIncome()
    {
        System.out.println("Total Expected Income: " + totalExpectedIncome);
    }
    public static void displayRentPending()
    {
        System.out.println("Total Rent Pending: " + totalrentPending);
    }
    public static void displayRentReceived()
    {
        System.out.println("Total Rent Paid: " + totalRentReceived);
    }

}
