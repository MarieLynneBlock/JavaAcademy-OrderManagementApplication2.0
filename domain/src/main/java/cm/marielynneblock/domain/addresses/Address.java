package cm.marielynneblock.domain.addresses;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {

    @Column(name = "STREET")
    private String street;

    @Column(name = "HOUSENUMBER")
    private String housenumber;

    @Embedded
    private Zipcode zipcode;

    @Column(name = "COUNTRY")
    private String country;

    private Address(AddressBuilder addressBuilder) {
        this.street = addressBuilder.street;
        this.housenumber = addressBuilder.housenumber;
        this.zipcode = addressBuilder.zipcode;
        this.country = addressBuilder.country;
    }


    public Address() {
    }


    public String getStreet() {
        return street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public Zipcode getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", housenumber='" + housenumber + '\'' +
                ", zipcode=" + zipcode +
                ", country='" + country + '\'' +
                '}';
    }


    public static class AddressBuilder {
        private String street;
        private String housenumber;
        private Zipcode zipcode;
        private String country;

        public static AddressBuilder buildAddress() {
            return new AddressBuilder();
        }

        public Address build() {
            if (allFieldsSet()) {
                return new Address(this);
            } else {
                throw new IllegalArgumentException("Please provide all the necessary arguments for the Address.");
            }
        }


        private boolean allFieldsSet() {
            return street != null && housenumber != null;
        }

        public AddressBuilder withHousenumber(String housenumber) {
            this.housenumber = housenumber;
            return this;
        }

        public AddressBuilder withStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder withZipcode(Zipcode zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        public AddressBuilder withCountry(String country) {
            this.country = country;
            return this;
        }
    }

}
