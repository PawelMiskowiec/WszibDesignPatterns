package pl.edu.wszib.lab1.builder.autobuilder;

import java.util.Optional;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Person extends Person {

  private final String firstName;

  private final String lastName;

  private final Integer age;

  private final Gender gender;

  private final Address address;

  private final Optional<String> breastSize;

  private AutoValue_Person(
      String firstName,
      String lastName,
      Integer age,
      Gender gender,
      Address address,
      Optional<String> breastSize) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.address = address;
    this.breastSize = breastSize;
  }

  @Override
  String firstName() {
    return firstName;
  }

  @Override
  String lastName() {
    return lastName;
  }

  @Override
  Integer age() {
    return age;
  }

  @Override
  Gender gender() {
    return gender;
  }

  @Override
  Address address() {
    return address;
  }

  @Override
  Optional<String> breastSize() {
    return breastSize;
  }

  @Override
  public String toString() {
    return "Person{"
        + "firstName=" + firstName + ", "
        + "lastName=" + lastName + ", "
        + "age=" + age + ", "
        + "gender=" + gender + ", "
        + "address=" + address + ", "
        + "breastSize=" + breastSize
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Person) {
      Person that = (Person) o;
      return this.firstName.equals(that.firstName())
          && this.lastName.equals(that.lastName())
          && this.age.equals(that.age())
          && this.gender.equals(that.gender())
          && this.address.equals(that.address())
          && this.breastSize.equals(that.breastSize());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= firstName.hashCode();
    h$ *= 1000003;
    h$ ^= lastName.hashCode();
    h$ *= 1000003;
    h$ ^= age.hashCode();
    h$ *= 1000003;
    h$ ^= gender.hashCode();
    h$ *= 1000003;
    h$ ^= address.hashCode();
    h$ *= 1000003;
    h$ ^= breastSize.hashCode();
    return h$;
  }

  static final class Builder extends Person.Builder {
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private Address address;
    private Optional<String> breastSize = Optional.empty();
    Builder() {
    }
    @Override
    public Person.Builder firstName(String firstName) {
      if (firstName == null) {
        throw new NullPointerException("Null firstName");
      }
      this.firstName = firstName;
      return this;
    }
    @Override
    public Person.Builder lastName(String lastName) {
      if (lastName == null) {
        throw new NullPointerException("Null lastName");
      }
      this.lastName = lastName;
      return this;
    }
    @Override
    public Person.Builder age(Integer age) {
      if (age == null) {
        throw new NullPointerException("Null age");
      }
      this.age = age;
      return this;
    }
    @Override
    public Person.Builder gender(Gender gender) {
      if (gender == null) {
        throw new NullPointerException("Null gender");
      }
      this.gender = gender;
      return this;
    }
    @Override
    public Person.Builder address(Address address) {
      if (address == null) {
        throw new NullPointerException("Null address");
      }
      this.address = address;
      return this;
    }
    @Override
    public Person.Builder breastSize(Optional<String> breastSize) {
      if (breastSize == null) {
        throw new NullPointerException("Null breastSize");
      }
      this.breastSize = breastSize;
      return this;
    }
    @Override
    public Person build() {
      if (this.firstName == null
          || this.lastName == null
          || this.age == null
          || this.gender == null
          || this.address == null) {
        StringBuilder missing = new StringBuilder();
        if (this.firstName == null) {
          missing.append(" firstName");
        }
        if (this.lastName == null) {
          missing.append(" lastName");
        }
        if (this.age == null) {
          missing.append(" age");
        }
        if (this.gender == null) {
          missing.append(" gender");
        }
        if (this.address == null) {
          missing.append(" address");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Person(
          this.firstName,
          this.lastName,
          this.age,
          this.gender,
          this.address,
          this.breastSize);
    }
  }

}
