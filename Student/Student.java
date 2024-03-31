public class Student extends BasicCredentials {
    private String studentID;
    private int roomNo;
    private RentInfo rentInfo;

    public Student(String studentID, int roomNo, String CNIC, String firstName, String lastName, AddressInfo address) {
        super(CNIC, firstName, lastName, address);
        setStudentID(studentID);
        setRoomNo(roomNo);
       setRentInfo(rentInfo);
    }

    private void setRentInfo(RentInfo rentInfo) {
        this.rentInfo=rentInfo;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void payRentOnline(double amount) {
        rentInfo.setRentPaid(rentInfo.getRentPaid() + amount);
        rentInfo.setRentPending(rentInfo.getRentPending() - amount);
        System.out.println("Rent paid successfully by online.");
    }

    public void payRentCash(double amount) {
        rentInfo.setRentPaid(rentInfo.getRentPaid() + amount);
        rentInfo.setRentPending(rentInfo.getRentPending() - amount);
        System.out.println("Rent paid successfully by cash.");
    }

    public void updateRentInfo(double rentPaid, double rentPending) {
        rentInfo.setRentPaid(rentPaid);
        rentInfo.setRentPending(rentPending);
    }

    public void displayRentInfo() {
        System.out.println("Rent Paid: " + rentInfo.getRentPaid());
        System.out.println("Rent Pending: " + rentInfo.getRentPending());
    }

    public void checkRentStatus() {
        if (rentInfo.getRentPending() == 0) {
            System.out.println("No pending rent.");
        } else {
            System.out.println("Pending rent: " + rentInfo.getRentPending());
        }
    }

    private static class RentInfo {
        private double rentPaid;
        private double rentPending;

        public RentInfo() {
            this.rentPaid = 0.0;
            this.rentPending = 0.0;
        }

        public double getRentPaid() {
            return rentPaid;
        }

        public void setRentPaid(double rentPaid) {
            this.rentPaid = rentPaid;
        }

        public double getRentPending() {
            return rentPending;
        }

        public void setRentPending(double rentPending) {
            this.rentPending = rentPending;
        }
    }
}
