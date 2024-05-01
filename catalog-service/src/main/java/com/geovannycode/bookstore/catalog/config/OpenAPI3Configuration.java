package com.geovannycode.bookstore.catalog.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPI3Configuration {

    @Value("${swagger.api-gateway-url}")
    String apiGatewayUrl;

    @Bean
    OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Catalog Service APIs")
                        .description("BookStore Catalog Service APIs")
                        .version("v1.0.0")
                        .contact(new Contact().name("GeovannyCode").email("me@geovannycode.com")))
                .servers(List.of(new Server().url(apiGatewayUrl)));
    }
}
