package database;

public class Location {
    private String city;
    private String address;
    private String country;

    public Location(String country, String city, String address){
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\n\tcity " + city + "\n\taddress " + address + "\n\tcountry " + country;
    }
}
