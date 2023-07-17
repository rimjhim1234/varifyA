package com.varify.customer;

import com.commercetools.api.models.customer.*;
import com.varify.config.ClientImport;
import com.commercetools.api.client.ProjectApiRoot;

public class CustomerDataProvider {

    ProjectApiRoot apiRoot= Client.createApiClient();
    public Customer createcustomer(CustomerDraft customerDraft) {
        return apiRoot.customers().post(customerDraft).executeBlocking().getBody().getCustomer();
    }

    public CustomerToken customercreateemailtoken(CustomerCreateEmailToken customerCreateEmailToken) {
        return apiRoot.customers().emailToken().post(customerCreateEmailToken).executeBlocking().getBody();
    }

    public Customer customerEmailVerify(CustomerEmailVerify customerEmailVerify) {
        return apiRoot.customers().emailConfirm().post(customerEmailVerify).executeBlocking().getBody();
    }
    public Customer customerbyemailvarifytoken(String token) {
        return apiRoot.customers().withEmailToken(token).get().executeBlocking().getBody();
    }

}

