package com.varify.product;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_type.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    ProductService productService;
    @PostMapping("/product")
    public ProductType createproducttype(@RequestBody ProductData productData){
        return ProductService.createproducttype(productData);
    }
}

