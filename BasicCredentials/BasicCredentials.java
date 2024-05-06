public class BasicCredentials
{
    private String CNIC;
    private String firstName;
    private String lastName;
    private AddressInfo address;

    public BasicCredentials(String CNIC, String firstName, String lastName, AddressInfo address)
    {
        setCNIC(CNIC);
        setAddressInfo(address);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getCNIC()
    {
        return CNIC;
    }

    public void setCNIC(String CNIC)
    {
        this.CNIC = CNIC;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public AddressInfo getAddressinfo()
    {
        return address;
    }

    public void setAddressInfo(AddressInfo address)
    {
        this.address = address;
    }
}
