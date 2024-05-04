public class Student extends BasicCredentials {
    private String studentID;
    private Integer roomNo;
    private RentInfo rentInfo;

    public Student(String studentID, Integer roomNo, String CNIC, String firstName, String lastName, AddressInfo address) {
        super(CNIC, firstName, lastName, address);
        setStudentID(studentID);
        setRoomNo(roomNo);
        setRentInfo(new RentInfo());
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        if (studentID == null || !studentID.matches("\\d+")) {
            throw new IllegalArgumentException("Error: Student ID must be a non-null numeric value.");
        }
        this.studentID = studentID;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        if (roomNo == null) {
            throw new IllegalArgumentException("Error: Room number cannot be null.");
        }
        this.roomNo = roomNo;
    }

    public void payRentOnline(Double amount) {
        if (amount == null) {
            throw new IllegalArgumentException("Error: Amount cannot be null.");
        }
        // Validate rentInfo is not null
        if (rentInfo == null) {
            throw new IllegalStateException("Error: Rent info is not initialized.");
        }
        rentInfo.setRentPaid(rentInfo.getRentPaid() + amount);
        rentInfo.setRentPending(rentInfo.getRentPending() - amount);
        System.out.println("Rent paid successfully by online.");
    }

    public void payRentCash(Double amount) {
        if (amount == null) {
            throw new IllegalArgumentException("Error: Amount cannot be null.");
        }
        // Validate rentInfo is not null
        if (rentInfo == null) {
            throw new IllegalStateException("Error: Rent info is not initialized.");
        }
        rentInfo.setRentPaid(rentInfo.getRentPaid() + amount);
        rentInfo.setRentPending(rentInfo.getRentPending() - amount);
        System.out.println("Rent paid successfully by cash.");
    }

    public void updateRentInfo(Double rentPaid, Double rentPending) {
        if (rentPaid == null || rentPending == null) {
            throw new IllegalArgumentException("Error: Rent paid and rent pending cannot be null.");
        }
        // Validate rentInfo is not null
        if (rentInfo == null) {
            throw new IllegalStateException("Error: Rent info is not initialized.");
        }
        rentInfo.setRentPaid(rentPaid);
        rentInfo.setRentPending(rentPending);
    }

    public void displayRentInfo() {
        // Validate rentInfo is not null
        if (rentInfo == null) {
            throw new IllegalStateException("Error: Rent info is not initialized.");
        }
        System.out.println("Rent Paid: " + rentInfo.getRentPaid());
        System.out.println("Rent Pending: " + rentInfo.getRentPending());
    }

    public void checkRentStatus() {
        if (rentInfo == null) {
            throw new IllegalStateException("Error: Rent info is not initialized.");
        }
        if (rentInfo.getRentPending() == 0) {
            System.out.println("No pending rent.");
        } else {
            System.out.println("Pending rent: " + rentInfo.getRentPending());
        }
    }

    private void setRentInfo(RentInfo rentInfo) {
        this.rentInfo = rentInfo;
    }

    private static class RentInfo {
        private Double rentPaid;
        private Double rentPending;

        public RentInfo() {
            this.rentPaid = 0.0;
            this.rentPending = 0.0;
        }

        public Double getRentPaid() {
            return rentPaid;
        }

        public void setRentPaid(Double rentPaid) {
            this.rentPaid = rentPaid;
        }

        public Double getRentPending() {
            return rentPending;
        }

        public void setRentPending(Double rentPending) {
            this.rentPending = rentPending;
        }
    }
}
