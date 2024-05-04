public class Income {
    private Double totalExpectedIncome;
    private Double totalRentReceived;
    private Double totalRentPending;

    public Income(Double totalExpectedIncome, Double totalRentReceived, Double totalRentPending) {
        setTotalExpectedIncome(totalExpectedIncome);
        setTotalRentReceived(totalRentReceived);
        setTotalRentPending(totalRentPending);
    }

    public Double getTotalExpectedIncome() {
        return totalExpectedIncome;
    }

    public void setTotalExpectedIncome(Double totalExpectedIncome) {
        if (totalExpectedIncome == null) {
            throw new IllegalArgumentException("Error: Total expected income cannot be null.");
        }
        this.totalExpectedIncome = totalExpectedIncome;
    }

    public Double getTotalRentReceived() {
        return totalRentReceived;
    }

    public void setTotalRentReceived(Double totalRentReceived) {
        if (totalRentReceived == null) {
            throw new IllegalArgumentException("Error: Total rent received cannot be null.");
        }
        this.totalRentReceived = totalRentReceived;
    }

    public Double getTotalRentPending() {
        return totalRentPending;
    }

    public void setTotalRentPending(Double totalRentPending) {
        if (totalRentPending == null) {
            throw new IllegalArgumentException("Error: Total rent pending cannot be null.");
        }
        this.totalRentPending = totalRentPending;
    }
}
