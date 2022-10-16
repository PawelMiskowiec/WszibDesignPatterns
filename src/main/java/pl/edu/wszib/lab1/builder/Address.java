package pl.edu.wszib.lab1.builder;

public class Address {
    private String city;
    private String street;
    private String homeNo;
    private String postCode;

    private Address(String city, String street, String homeNo, String postCode) {
        this.city = city;
        this.street = street;
        this.homeNo = homeNo;
        this.postCode = postCode;
    }

    public static AddressBuilder builder(){
        return new AddressBuilder();
    }

    public String toString() {
        return "Address(city=" + this.city + ", street=" + this.street + ", homeNo=" + this.homeNo + ", postCode=" + this.postCode + ")";
    }

    public static class AddressBuilder{
        private String city;
        private String street;
        private String homeNo;
        private String postCode;

        public AddressBuilder(){}

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder setHomeNo(String homeNo) {
            this.homeNo = homeNo;
            return this;
        }

        public AddressBuilder setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public Address build(){
            return new Address(city, street, homeNo, postCode);
        }
    }
}
