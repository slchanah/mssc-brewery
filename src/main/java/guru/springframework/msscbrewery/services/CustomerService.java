package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    public CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveBeer(CustomerDto customerDto);

    void updateCustomer(UUID beerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
