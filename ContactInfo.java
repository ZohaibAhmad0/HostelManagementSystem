public class ContactInfo
{
    private int countryCode ;
    private String lineNumber ;
    private String email;
    public ContactInfo ( int countryCode,  String lineNumber, String email )
    {
        setCountryCode(countryCode);
        setLineNumber(lineNumber);
        setEmail(email);
    }
    public int getCountryCode()
    {
        return countryCode;
    }
    public void setCountryCode(int countryCode)
    {
        this.countryCode = countryCode;
    }
    public String getLineNumber()
    {
        return lineNumber;
    }
    public void setLineNumber(String lineNumber)
    {
        this.lineNumber = lineNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}