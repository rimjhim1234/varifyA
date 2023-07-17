package com.varify.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductData {
    public String key;
    public String name;
    public String discription;
    public String value;
    public String sortOrder;
    public String isActive;

}
