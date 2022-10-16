package pl.edu.wszib.lab1.builder.autobuilder;

import com.google.auto.value.AutoValue;

import java.util.Optional;

@AutoValue
public abstract class Person {
    abstract String firstName();

    abstract String lastName();

    abstract Integer age();

    abstract Gender gender();

    abstract Address address();

    abstract Optional<String> breastSize();

    static Builder builder() {
        return new AutoValue_Person.Builder();
    }

    static Person create(String firstName, String lastName, Gender gender, int age){
        return Person.builder()
                .address(
                        Address.builder()
                                .city("Krakow")
                                .number("666")
                                .postalCode("21-370")
                                .street("Aleja")
                                .build()
                )
                .age(age)
                .firstName(firstName)
                .lastName(lastName)
                .breastSize(Optional.empty())
                .gender(gender)
                .build();
    }

    static Person male(){
            return Person.builder()
                .address(
                        Address.builder()
                                .city("Krakow")
                                .number("666")
                                .postalCode("21-370")
                                .street("Aleja")
                                .build()
                )
                .age(23)
                .firstName("Jan")
                .lastName("Nowak")
                .gender(Gender.MALE)
                .breastSize(Optional.empty())
                .build();
    }

    static Person female(){
        return Person.builder()
                .address(
                        Address.builder()
                                .city("Krakow")
                                .number("123")
                                .postalCode("45-678")
                                .street("Park")
                                .build()
                )
                .age(123)
                .firstName("Anna")
                .lastName("Nowak")
                .gender(Gender.FEMALE)
                .breastSize(Optional.of("400"))
                .build();
    }

    @AutoValue.Builder
    abstract static class Builder {

        public abstract Builder firstName(String firstName);

        public abstract Builder lastName(String lastName);

        public abstract Builder age(Integer age);

        public abstract Builder gender(Gender gender);

        public abstract Builder address(Address address);

        public abstract Builder breastSize(Optional<String> breastSize);

        public abstract Person build();
    }
}