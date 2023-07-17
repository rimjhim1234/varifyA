package com.varify.customer;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    CustomerService customerService;
   @PostMapping("/customer")
    public Customer Createcustomer(@RequestBody CustomerData customerData){
      return customerService.createcustomer(customerData);
    }
    @PostMapping("/customercreateemailtoken")
    public CustomerToken customercreateemailtoken(@RequestBody CustomerData customerData){
       return customerService.customercreateemailtoken(customerData);
    }
    @GetMapping("/CustomerEmailVerify")
    public Customer customerEmailVerify(@RequestBody CustomerData customerData){
       return customerService.customerEmailVerify(customerData);
    }
    @GetMapping("/varifytoken/{token}")
    public Customer customerbyemailvarifytoken(@PathVariable String token){
       return customerService.customerbyemailvarifytoken(token);
    }
}
