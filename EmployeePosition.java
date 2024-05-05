public enum EmployeePosition
{
    ADMIN(20000.0),
    WORKER(15000.0),
    GUARD(15000.0),
    NULL( 0.0);

    private double salary;

    EmployeePosition(Double salary)
    {
       setSalary(salary);
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
