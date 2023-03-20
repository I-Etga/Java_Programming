package sundays_live_sessions.week6;

public class Address {

    public String street = "";
    public String city = "";
    public String state = "";
    public String zipCode = "";
    public String country = "";

    public void setInfo(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String toString() {
        return "Address\n\t" +
                street + "\n\t" +
                city  + ", " + state + ", " + zipCode + "\n\t" +
                country ;
    }
}

