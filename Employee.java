public class Employee extends BasicCredentials

{
    private int employeeID = 0;
    private EmployeePosition employeePosition;
    private PayStatus payStatus;
    private PayInfo payInfo = new PayInfo();

    public Employee(String CNIC, String firstName, String lastName, AddressInfo address, EmployeePosition employeePosition)
    {
        super(CNIC, firstName, lastName, address);
        this.employeePosition = employeePosition;
        this.payStatus = PayStatus.pending;
        payInfo.setPayPending(employeePosition.getSalary());
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public EmployeePosition getEmployeePosition()
    {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition)
    {
        this.employeePosition = employeePosition;
    }

    public PayStatus getPayStatus()
    {
        return payStatus;
    }

    public void setPayStatus(PayStatus payStatus)
    {
        this.payStatus = payStatus;
    }

    public PayInfo getPayInfo()
    {
        return payInfo;
    }

    public void setPayInfo(PayInfo payInfo)
    {
        this.payInfo = payInfo;
    }
    public void paySalaryOnline(double amount)
    {
        payInfo.setPayPaid(payInfo.getPayPaid() + amount);
        payInfo.setPayPending(payInfo.getPayPending() - amount);
        System.out.println("Salary paid successfully by online.");
        if(payInfo.getPayPending()== 0.0)
        {
            this.payStatus = PayStatus.paid;
        }
    }

    public void paySalaryCash(double amount)
    {
        payInfo.setPayPaid(payInfo.getPayPaid() + amount);
        payInfo.setPayPending(payInfo.getPayPending() - amount);
        System.out.println("Salary paid successfully by cash.");
        if(payInfo.getPayPending()== 0.0)
        {
            this.payStatus = PayStatus.paid;
        }
    }

    public void updateSalaryInfo(double salaryPaid, double salaryPending)
    {
        payInfo.setPayPaid(salaryPaid);
        payInfo.setPayPending(salaryPending);
    }

    public void displayPayInfo()
    {
        System.out.println("Salary Paid: " + payInfo.getPayPaid());
        System.out.println("Salary Pending: " + payInfo.getPayPending());
    }

    public void checkPayStatus()
    {
        if (payStatus == PayStatus.paid)
        {
            System.out.println("No pending Salary.");
        }
        else
        {
            System.out.println("Pending Salary: " + payInfo.getPayPending());
        }
    }
}
