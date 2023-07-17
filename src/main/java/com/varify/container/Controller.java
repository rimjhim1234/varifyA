package com.varify.container;

import com.commercetools.importapi.client.ProjectApiRoot;
import com.commercetools.importapi.models.importcontainers.ImportContainer;
import com.commercetools.importapi.models.importrequests.ImportResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ProjectApiRoot root;
    @Autowired
    IService service;
    @PostMapping("/import-containers2")
    public ImportContainer createimportcontainer(@RequestBody Dto dto){
          return service.createimportcontainer(dto);
    }
    @PostMapping("/price")
    public ImportResponse importprice(@RequestBody Dto dto){
        return service.importprice(dto);
    }
}
