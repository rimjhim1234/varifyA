package com.varify.product;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import com.varify.customer.Client;

public class ProductDataProvider {
    ProjectApiRoot apiRoot= Client.createApiClient();
    public ProductType createproducttype(ProductTypeDraft productTypeDraft) {
        return apiRoot.productTypes().post(productTypeDraft).executeBlocking().getBody();
    }
}
