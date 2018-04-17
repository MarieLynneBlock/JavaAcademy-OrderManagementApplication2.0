package cm.marielynneblock.domain.customers;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepository {

    public CustomerRepository() {
    }

    @PersistenceContext
    private EntityManager entityManager;

    public Customer createCustomer(Customer customer) {
        entityManager.persist(customer);
        return customer;
    }

}
