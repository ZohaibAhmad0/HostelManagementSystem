public class PayInfo {
    private Double payPaid;
    private Double payPending;

    public PayInfo() {
        this.payPaid = 0.0;
        this.payPending = 0.0;
    }

    public Double getPayPaid() {
        return payPaid;
    }

    public void setPayPaid(Double payPaid) {

        if (payPaid == null || payPaid < 0) {
            throw new IllegalArgumentException("Error: PayPaid must be a non-negative number.");
        }
        this.payPaid = payPaid;
    }

    public Double getPayPending() {
        return payPending;
    }

    public void setPayPending(Double payPending) {

        if (payPending == null || payPending < 0) {
            throw new IllegalArgumentException("Error: PayPending must be a non-negative number.");
        }
        this.payPending = payPending;
    }
}
