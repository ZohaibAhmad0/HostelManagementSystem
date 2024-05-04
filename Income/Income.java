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

        if (totalExpectedIncome != null && totalExpectedIncome instanceof Number) {
            this.totalExpectedIncome = totalExpectedIncome;
        } else {
            throw new IllegalArgumentException("Error: Total expected income must be a number");
        }
    }

    public Double getTotalRentReceived() {
        return totalRentReceived;
    }

    public void setTotalRentReceived(Double totalRentReceived) {

        if (totalRentReceived != null && totalRentReceived instanceof Number) {
            this.totalRentReceived = totalRentReceived;
        } else {
            throw new IllegalArgumentException("Error: Total rent received must be a number");
        }
    }

    public Double getTotalRentPending() {
        return totalRentPending;
    }

    public void setTotalRentPending(Double totalRentPending) {

        if (totalRentPending != null && totalRentPending instanceof Number) {
            this.totalRentPending = totalRentPending;
        } else {
            throw new IllegalArgumentException("Error: Total rent pending must be a number");
        }
    }
}
