package pl.edu.wszib.lab1.builder;

import pl.edu.wszib.lab1.builder.records.Product;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .setAddress(
                        Address.builder()
                                .setCity("Krakow")
                                .setHomeNo("14")
                                .setPostCode("69-420")
                                .setStreet("Aleja Kijowska")
                                .build()
                )
                .setGender("brak")
                .setFirstName("Pawel")
                .setLastName("Miskowiec")
                .build();

        Product product = new Product("Monitor hp wszib", "100000");

        System.out.println(product);

        System.out.println(person.toString());

    }
}
