public class Student extends BasicCredentials {
    private Integer studentID;
    private Integer roomNo;
    private RentInfo rentInfo = new RentInfo();
    private RentStatus rentStatus;
    private RoomType roomType;

    public Student(String CNIC, String firstName, String lastName, AddressInfo address, Integer studentID, Integer roomNo, RoomType roomType) {
        super(CNIC, firstName, lastName, address);
        this.studentID = studentID;
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.rentStatus = RentStatus.pending;
        rentInfo.setRentPending(roomType.getRent());
    }

    public RentInfo getRentInfo() {
        return rentInfo;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RentStatus getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(RentStatus rentStatus) {
        this.rentStatus = rentStatus;
    }

    private void setRentInfo(RentInfo rentInfo) {
        this.rentInfo = rentInfo;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        // Validate studentID is not null and is a non-negative number
        if (studentID == null || studentID < 0) {
            throw new IllegalArgumentException("Error: StudentID must be a non-negative number.");
        }
        this.studentID = studentID;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        // Validate roomNo is not null and is a non-negative number
        if (roomNo == null || roomNo < 0) {
            throw new IllegalArgumentException("Error: RoomNo must be a non-negative number.");
        }
        this.roomNo = roomNo;
    }

    public void payRentOnline(double amount) {
        rentInfo.setRentPaid(rentInfo.getRentPaid() + amount);
        rentInfo.setRentPending(rentInfo.getRentPending() - amount);
        System.out.println("Rent paid successfully by online.");
        if (rentInfo.getRentPending() == 0.0) {
            this.rentStatus = RentStatus.paid;
        }
    }

    public void payRentCash(double amount) {
        rentInfo.setRentPaid(rentInfo.getRentPaid() + amount);
        rentInfo.setRentPending(rentInfo.getRentPending() - amount);
        System.out.println("Rent paid successfully by cash.");
        if (rentInfo.getRentPending() == 0.0) {
            this.rentStatus = RentStatus.paid;
        }
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
        if (rentStatus == RentStatus.paid) {
            System.out.println("No pending rent.");
        } else {
            System.out.println("Pending rent: " + rentInfo.getRentPending());
        }
    }

    public class RentInfo {
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
