public class ContactInfo {
    private Integer countryCode;
    private String lineNumber;
    private String email;

    public ContactInfo(Integer countryCode, String lineNumber, String email) {
        setCountryCode(countryCode);
        setLineNumber(lineNumber);
        setEmail(email);
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {

        if (countryCode == null || String.valueOf(countryCode).matches("\\d+")) {
            this.countryCode = countryCode;
        } else {

             throw new IllegalArgumentException("Error: Country code should be a valid number");
        }
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {

        if (lineNumber == null || lineNumber.matches("\\d+")) {
            this.lineNumber = lineNumber;
        } else {
             throw new IllegalArgumentException("Error: Line number should contain only numbers");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
