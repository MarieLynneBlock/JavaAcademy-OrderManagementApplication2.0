package cm.marielynneblock.domain.customers;

import cm.marielynneblock.domain.addresses.Address;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @Column
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Embedded
    @Column(name = "ADDRESS")
    private Address address;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    private Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.firstName;
        this.lastName = customerBuilder.lastName;
        this.address = customerBuilder.address;
        this.email = customerBuilder.email;
        this.phoneNumber = customerBuilder.phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static class CustomerBuilder {
        private String firstName;
        private String lastName;
        private Address address;
        private String email;
        private String phoneNumber;

        /* add illegal argument exception later (providing the necessary fields set) */

        public static CustomerBuilder buildCustomer() {
            return new CustomerBuilder();
        }

        public CustomerBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public CustomerBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }

}