package pl.edu.wszib.lab1.builder;

public class Main {
    public static void main(String[] args) {
        Address address = Address.builder()
                .setCity("Krakow")
                .setHomeNo("14")
                .setPostCode("69-420")
                .setStreet("Aleja Kijowska")
                .build();
        Person person = Person.builder()
                .setAddress(address)
                .setGender("brak")
                .setFirstName("Pawel")
                .setLastName("Miskowiec")
                .build();

        System.out.println(person.toString());

    }
}
