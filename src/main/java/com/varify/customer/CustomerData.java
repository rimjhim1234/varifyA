package com.varify.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerData {
    public String firstname;
    public String lastname;
    public String password;
    public String email;
    public String id;
    public Long ttlMinutes;
    public String tokenValue;

}
