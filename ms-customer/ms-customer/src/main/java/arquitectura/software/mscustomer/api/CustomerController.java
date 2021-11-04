package arquitectura.software.mscustomer.api;

import arquitectura.software.mscustomer.entity.Customer;
import arquitectura.software.mscustomer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(path = "/save",
                    method = RequestMethod.POST)
    public Customer saveCustomer (@RequestBody Customer customer){

        return customerRepository.save(customer);
    }

    @RequestMapping(path = "/all",
            method = RequestMethod.GET)
    public List<Customer> getAllCustomer(){
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @RequestMapping(
            method = RequestMethod.GET)
    public Customer getCustomer(@RequestParam Integer customerId) throws Exception {
        Optional<Customer> customerOptional = customerRepository.findById(customerId);
        if(customerOptional.isPresent()){
            Customer customer = customerOptional.get();
            return customer;
        }else {
            throw new Exception("No se encuentra el usuario");

        }

    }
}
