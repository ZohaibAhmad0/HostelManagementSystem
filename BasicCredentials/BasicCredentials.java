public class BasicCredentials {
    private Integer CNIC;
    private String firstName;
    private String lastName;
    private AddressInfo address;

    public BasicCredentials(Integer CNIC, String firstName, String lastName, AddressInfo address) {
        setCNIC(CNIC);
        setFirstName(firstName);
        setLastName(lastName);
        setAddressInfo(address);
    }

    public Integer getCNIC() {
        return CNIC;
    }

    public void setCNIC(Integer CNIC) {
        if (CNIC != null) {
            String cnicString = String.valueOf(CNIC); // Convert Integer to String
            if (cnicString.matches("\\d{5}-\\d{7}-\\d")) {
                this.CNIC = CNIC;
            } else {
                throw new IllegalArgumentException("Error: CNIC number should be in the format XXXXX-XXXXXXX-X");
            }
        } else {
            throw new IllegalArgumentException("Error: CNIC cannot be null");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.matches("[a-zA-Z]+")) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Error: First name should contain only alphabets and cannot be null");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.matches("[a-zA-Z]+")) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Error: Last name should contain only alphabets and cannot be null");
        }
    }

    public AddressInfo getAddressInfo() {
        return address;
    }

    public void setAddressInfo(AddressInfo address) {
        if (address != null) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Error: Address cannot be null");
        }
    }
}
