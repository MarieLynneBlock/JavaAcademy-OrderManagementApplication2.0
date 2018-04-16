package cm.marielynneblock.domain.customers;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

public class Customer {

    @Id
    @Column
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

        public static CustomerBuilder buildCustomer() {
            return new CustomerBuilder();
        }

        /* add illegal argument exeption later (providing the necessary fields set) */
    }

}
