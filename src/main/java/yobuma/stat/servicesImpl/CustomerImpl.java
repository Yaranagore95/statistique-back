package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproCustomer;
import yobuma.stat.repositories.YobBookproCustomerRepository;
import yobuma.stat.services.ICustomer;

import java.util.List;
import java.util.Optional;

@Service("customSrc")
public class CustomerImpl implements ICustomer {

    private final YobBookproCustomerRepository repository;

    public CustomerImpl(YobBookproCustomerRepository customerRepository) {
        this.repository = customerRepository;
    }

    @Override
    public List<YobBookproCustomer> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproCustomer getOne(int id) {
        Optional<YobBookproCustomer> yobBookproCustomer = repository.findById(id);
        return yobBookproCustomer.orElse(null);
    }

    @Override
    public YobBookproCustomer findOne(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public YobBookproCustomer findByUser(int userId) {
        return repository.findByUser(userId);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
