package pl.edu.wszib.lab1.builder.autobuilder;

public class Application {

    public static void main(String[] args) {
        Address address = Address.builder()
                .street("Street")
                .city("Pawlowice")
                .number("1")
                .postalCode("43-250")
                .build();
        Person person = Person.builder()
                .firstName("Pawel")
                .lastName("Pustelnik")
                .age(28)
                .gender(Gender.MALE)
                .address(address)
                .build();
        System.out.println(person);

        Person ja = Person.create("Pawel", "Miskowiec", Gender.MALE, 23);

        System.out.println(Person.female());
        System.out.println(Person.male());
        System.out.println(ja);

    }
}