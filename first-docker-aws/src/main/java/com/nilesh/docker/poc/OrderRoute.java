package com.nilesh.docker.poc;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OrderRoute extends RouteBuilder {

    @Bean(name = "jsonProvider")
    public JacksonJsonProvider jsonProvider() {
        return new JacksonJsonProvider();
    }

    @Override
    public void configure() throws Exception {

    	from("cxfrs:bean:cxfEndpoint?bindingStyle=SimpleConsumer")
            .toD("direct:${header.operationName}");

        from("direct:createOrder")
            .bean("orderService", "createOrder");

        from("direct:getOrder")
            .bean("orderService", "getOrder(${header.id})");

        from("direct:updateOrder")
            .bean("orderService", "updateOrder");

        from("direct:cancelOrder")
            .bean("orderService", "cancelOrder(${header.id})");
    }
}