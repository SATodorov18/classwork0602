public class Importer {

    private String name;
    private String address  ;
    private String phoneNumber;

    public Importer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Importer() {
        this.name = "Sunkatabaaaa";
        this.address = "Sredec mn q";
        this.phoneNumber = "1717171717";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", city='" + address + '\'' +
                ", age=" + phoneNumber +
                '}';
    }
}