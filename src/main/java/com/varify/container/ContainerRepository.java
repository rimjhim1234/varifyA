package com.varify.container;

import com.commercetools.importapi.client.ProjectApiRoot;
import com.commercetools.importapi.models.importcontainers.ImportContainer;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraft;
import com.commercetools.importapi.models.importrequests.ImportResponse;
import com.commercetools.importapi.models.importrequests.PriceImportRequest;
import com.varify.config.ClientImport;
import org.springframework.stereotype.Component;

@Component
public class ContainerRepository {
    ProjectApiRoot root = ClientImport.createimportapiclient();
    public ImportContainer createimportcontainer(ImportContainerDraft importContainerDraft) {
        return root.importContainers().post(importContainerDraft).executeBlocking().getBody();
    }
    public ImportResponse importprice(PriceImportRequest priceImportRequest) {
        return root.prices().importContainers().withImportContainerKeyValue("").post(priceImportRequest).executeBlocking().getBody();
    }
}
