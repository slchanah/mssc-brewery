package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Ivan")
                .build();
    }

    @Override
    public CustomerDto saveBeer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID beerId, CustomerDto customerDto) {
        log.debug("Updating Customer");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting Customer");
    }
}
