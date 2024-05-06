public enum EmployeePosition {
    ADMIN(20000.0),
    WORKER(15000.0),
    GUARD(15000.0),
    NULL(0.0);

    private Double salary; // Changed to wrapper class

    EmployeePosition(Double salary) {
        if (salary == null) {
            throw new IllegalArgumentException("Error: Salary cannot be null.");
        }
        // Validate salary is a non-negative number
        if (salary < 0) {
            throw new IllegalArgumentException("Error: Salary must be a non-negative number.");
        }
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}
