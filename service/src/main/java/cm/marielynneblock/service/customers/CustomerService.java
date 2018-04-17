package cm.marielynneblock.service.customers;

import cm.marielynneblock.domain.customers.Customer;
import cm.marielynneblock.domain.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Named
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createNewCustomer(Customer newCustomer) {
        customerRepository.createCustomer(newCustomer);
        return newCustomer;
    }

}
