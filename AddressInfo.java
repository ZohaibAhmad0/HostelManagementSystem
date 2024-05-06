public class AddressInfo {
    private Integer streetNumber;
    private String area;
    private String city;
    private String country;
    private ContactInfo contactInfo;

    public AddressInfo(Integer streetNumber, String area, String city, String country, ContactInfo contactInfo) {
        setStreetNumber(streetNumber);
        setArea(area);
        setCity(city);
        setCountry(country);
        setContactInfo(contactInfo);
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        if (String.valueOf(streetNumber).matches("\\d+")) {
            this.streetNumber = streetNumber;
        } else {
            System.out.println("Error: Street number should be a valid number");
            throw new IllegalArgumentException("Error: Street number should be a valid number");
        }
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        // Validate city (only alphabets)
        if (city.matches("[a-zA-Z]+")) {
            this.city = city;
        } else {
             throw new IllegalArgumentException("Error: City name should contain only alphabets");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {

        if (country.matches("[a-zA-Z]+")) {
            this.country = country;
        } else {
             throw new IllegalArgumentException("Error: Country name should contain only alphabets");
        }
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {

        if (String.valueOf(contactInfo).matches("\\d{11}")) {
            this.contactInfo = contactInfo;
        } else {
             throw new IllegalArgumentException("Error: Contact info should be an 11-digit number");
        }
    }
}
