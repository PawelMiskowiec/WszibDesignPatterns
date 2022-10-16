package pl.edu.wszib.lab1.builder;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private Address address;

    public Person(){}

    private Person(String firstName, String lastName, String gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public String toString() {
        return "Person(name=" + this.firstName + ", surname=" + this.lastName + ", gender=" + this.gender + ", address=" + this.address.toString() + ")";
    }

    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String gender;
        private Address address;

        public PersonBuilder(){}

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(firstName, lastName, gender, address);
        }
    }
}
