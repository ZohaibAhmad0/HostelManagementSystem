public class AddressInfo
{
    private int streetNumber ;
    private String Area;
    private String city ;
    private String country ;
    private ContactInfo contactInfo ;
    public AddressInfo(int streetNumber, String Area, String city, String country, ContactInfo contactInfo )
    {
        setCity(city);
        setCountry(country);
        setContactInfo(contactInfo);
        setArea(Area);
        setstreetNumber(streetNumber);
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public int getstreetNumber ()
    {
        return streetNumber ;
    }
    public void setstreetNumber(int streetNumber)
    {
        this.streetNumber = streetNumber ;
    }
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getArea()
    {
        return Area;
    }
    public void setArea(String area)
    {
        this.Area = area;
    }
    public ContactInfo getContactInfo()
    {
        return contactInfo;
    }
    public void setContactInfo(ContactInfo contactInfo)
    {
        this.contactInfo = contactInfo;
    }

}
