public class Income {
    private static Double totalExpectedIncome;
    private static Double totalRentReceived;
    private static Double totalRentPending;

    public Income() {
        setTotalExpectedIncome(calExpectedRent());
        setTotalRentPending(calRentPending());
        setTotalRentReceived(calRentReceived());
    }

    public Double getTotalExpectedIncome() {
        return totalExpectedIncome;
    }

    public void setTotalExpectedIncome(Double totalExpectedIncome) {
        // Check if the input is a valid number
        if (totalExpectedIncome == null) {
            throw new IllegalArgumentException("Total expected income cannot be null.");
        }
        this.totalExpectedIncome = totalExpectedIncome;
    }

    public Double getTotalRentReceived() {
        return totalRentReceived;
    }

    public void setTotalRentReceived(Double totalRentReceived) {
        // Check if the input is a valid number
        if (totalRentReceived == null) {
            throw new IllegalArgumentException("Total rent received cannot be null.");
        }
        this.totalRentReceived = totalRentReceived;
    }

    public Double getTotalRentPending() {
        return totalRentPending;
    }

    public void setTotalRentPending(Double totalRentPending) {
        // Check if the input is a valid number
        if (totalRentPending == null) {
            throw new IllegalArgumentException("Total rent pending cannot be null.");
        }
        this.totalRentPending = totalRentPending;
    }

    private static Double calExpectedRent() {
        Double expectedIncome = 0.0;
        for (Student student : MethodsStudents.students) {
            expectedIncome += student.getRoomType().getRent();
        }
        return expectedIncome;
    }

    private static Double calRentPending() {
        Double rentPending = 0.0;
        for (Student student : MethodsStudents.students) {
            if(student.getRentStatus() == RentStatus.pending) {
                rentPending += student.getRentInfo().getRentPending();
            }
        }
        return rentPending;
    }

    private static Double calRentReceived() {
        Double rentReceived = 0.0;
        for (Student student : MethodsStudents.students) {
            if(student.getRentInfo().getRentPending() != 0 ) {
                rentReceived += student.getRentInfo().getRentPaid();
            }
        }
        return rentReceived;
    }

    public static void displayExpectedIncome() {
        System.out.println("Total Expected Income: " + totalExpectedIncome);
    }

    public static void displayRentPending() {
        System.out.println("Total Rent Pending: " + totalRentPending);
    }

    public static void displayRentReceived() {
        System.out.println("Total Rent Paid: " + totalRentReceived);
    }
}
