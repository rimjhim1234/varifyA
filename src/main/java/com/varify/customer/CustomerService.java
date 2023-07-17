package com.varify.customer;

import com.commercetools.api.models.customer.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Configuration
public class CustomerService {
    CustomerDataProvider cdp = new CustomerDataProvider();
    public Customer createcustomer(CustomerData customerData) {
        CustomerDraft customerDraft= CustomerDraft
                .builder()
                .firstName(customerData.getFirstname())
                .lastName(customerData.getLastname())
                .password(customerData.getPassword())
                .email(customerData.getEmail())
                .build();
      return cdp.createcustomer(customerDraft);
    }
    public CustomerToken customercreateemailtoken(CustomerData customerData){
        CustomerCreateEmailToken customerCreateEmailToken=CustomerCreateEmailToken
                .builder()
                .id(customerData.getId())
                .ttlMinutes(customerData.getTtlMinutes())
                .build();
        return cdp.customercreateemailtoken(customerCreateEmailToken);
    }
    public Customer customerEmailVerify(CustomerData customerData) {
        CustomerEmailVerify customerEmailVerify= CustomerEmailVerify
                .builder()
                .tokenValue(customerData.getTokenValue())
                .build();
        return cdp.customerEmailVerify(customerEmailVerify);
    }
    public Customer customerbyemailvarifytoken(String token) {
        return cdp.customerbyemailvarifytoken(token);
    }
}
