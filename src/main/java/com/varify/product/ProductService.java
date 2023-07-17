package com.varify.product;

import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    static ProductDataProvider cdp = new ProductDataProvider();
    public static ProductType createproducttype(ProductData productData) {
        ProductTypeDraft productTypeDraft = ProductTypeDraft
                .builder()
                .key(productData.getKey())
                .name(productData.getName())
                .description(productData.getDiscription())
                .build();
        return cdp.createproducttype(productTypeDraft);
    }
}

