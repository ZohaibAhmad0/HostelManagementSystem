public class Income
{
    private double totalExpectedIncome;
    private double totalRentReceived;
    private double totalrentPending;

    public Income(double totalExpectedIncome, double totalRentReceived, double totalrentPending)
    {
       setTotalExpectedIncome(totalExpectedIncome);
       setTotalrentPending(totalrentPending);
       setTotalRentReceived(totalRentReceived);
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
}
