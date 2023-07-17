package com.varify.container;

import com.commercetools.importapi.models.importcontainers.ImportContainer;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraft;
import com.commercetools.importapi.models.importrequests.ImportResponse;
import com.commercetools.importapi.models.importrequests.PriceImportRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IService {
    @Autowired
    ContainerRepository containerRepository;
    public ImportContainer createimportcontainer(Dto dto) {
        ImportContainerDraft importContainerDraft=ImportContainerDraft
                .builder()
                .key(dto.getKey())
                .build();
        return containerRepository.createimportcontainer(importContainerDraft);
    }
    public ImportResponse importprice(Dto dto) {
        PriceImportRequest priceImportRequest=PriceImportRequest
                .builder()
                .resources()
                .build();
        return containerRepository.importprice(priceImportRequest);
    }
}
