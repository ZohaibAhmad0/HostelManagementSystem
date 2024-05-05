public class PayInfo
{
    private double payPaid;
    private double payPending;

    public PayInfo()
    {
        this.payPaid = 0.0;
        this.payPending = 0.0;
    }

    public double getPayPaid()
    {
        return payPaid;
    }

    public void setPayPaid(double payPaid)
    {
        this.payPaid = payPaid;
    }

    public double getPayPending()
    {
        return payPending;
    }

    public void setPayPending(double payPending)
    {
        this.payPending = payPending;
    }
}
