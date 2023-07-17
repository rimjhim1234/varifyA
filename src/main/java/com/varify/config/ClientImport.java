package com.varify.config;

import com.commercetools.importapi.client.ProjectApiRoot;
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class ClientImport {
    @Bean
    public static ProjectApiRoot createimportapiclient() {
        final ProjectApiRoot root = ImportApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                                .withClientId("Aw7ytyQoNnCXVG-JXELclAit")
                                .withClientSecret("1MO7HoT_P4g5ukobUAkusRAH1JdzqpT6")
                                .build(), ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1)
                .build("myntra-copy");
        return root;
    }
}
