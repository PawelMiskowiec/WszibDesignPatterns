package pl.edu.wszib.lab1.builder.autobuilder;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Address extends Address {

  private final String city;

  private final String street;

  private final String number;

  private final String postalCode;

  private AutoValue_Address(
      String city,
      String street,
      String number,
      String postalCode) {
    this.city = city;
    this.street = street;
    this.number = number;
    this.postalCode = postalCode;
  }

  @Override
  String city() {
    return city;
  }

  @Override
  String street() {
    return street;
  }

  @Override
  String number() {
    return number;
  }

  @Override
  String postalCode() {
    return postalCode;
  }

  @Override
  public String toString() {
    return "Address{"
        + "city=" + city + ", "
        + "street=" + street + ", "
        + "number=" + number + ", "
        + "postalCode=" + postalCode
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Address) {
      Address that = (Address) o;
      return this.city.equals(that.city())
          && this.street.equals(that.street())
          && this.number.equals(that.number())
          && this.postalCode.equals(that.postalCode());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= city.hashCode();
    h$ *= 1000003;
    h$ ^= street.hashCode();
    h$ *= 1000003;
    h$ ^= number.hashCode();
    h$ *= 1000003;
    h$ ^= postalCode.hashCode();
    return h$;
  }

  static final class Builder extends Address.Builder {
    private String city;
    private String street;
    private String number;
    private String postalCode;
    Builder() {
    }
    @Override
    Address.Builder city(String city) {
      if (city == null) {
        throw new NullPointerException("Null city");
      }
      this.city = city;
      return this;
    }
    @Override
    Address.Builder street(String street) {
      if (street == null) {
        throw new NullPointerException("Null street");
      }
      this.street = street;
      return this;
    }
    @Override
    Address.Builder number(String number) {
      if (number == null) {
        throw new NullPointerException("Null number");
      }
      this.number = number;
      return this;
    }
    @Override
    Address.Builder postalCode(String postalCode) {
      if (postalCode == null) {
        throw new NullPointerException("Null postalCode");
      }
      this.postalCode = postalCode;
      return this;
    }
    @Override
    Address build() {
      if (this.city == null
          || this.street == null
          || this.number == null
          || this.postalCode == null) {
        StringBuilder missing = new StringBuilder();
        if (this.city == null) {
          missing.append(" city");
        }
        if (this.street == null) {
          missing.append(" street");
        }
        if (this.number == null) {
          missing.append(" number");
        }
        if (this.postalCode == null) {
          missing.append(" postalCode");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Address(
          this.city,
          this.street,
          this.number,
          this.postalCode);
    }
  }

}
