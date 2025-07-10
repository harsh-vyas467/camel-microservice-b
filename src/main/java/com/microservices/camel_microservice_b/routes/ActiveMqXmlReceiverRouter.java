package com.microservices.camel_microservice_b.routes;

import com.microservices.camel_microservice_b.pojo.CurrencyExchange;
import com.microservices.camel_microservice_b.transformer.MyCurrencyExchangeProcessor;
import com.microservices.camel_microservice_b.transformer.MyCurrencyExchangeTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqXmlReceiverRouter extends RouteBuilder {

    @Autowired
    MyCurrencyExchangeProcessor myCurrencyExchangeProcessor;

    @Autowired
    MyCurrencyExchangeTransformer myCurrencyExchangeTransformer;

    @Override
    public void configure() throws Exception {
        from("activemq:my-activemq-xml-queue")
                .unmarshal()
                .jacksonXml(CurrencyExchange.class)
                .to("log:received-message-from-active-mq");

    }
}
