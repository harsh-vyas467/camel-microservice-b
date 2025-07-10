package com.microservices.camel_microservice_b.transformer;

import com.microservices.camel_microservice_b.pojo.CurrencyExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyCurrencyExchangeProcessor {

    Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);

    public void processMessage(CurrencyExchange currencyExchange){
        logger.info("Do some processing with currrencyExchange.getConversionMultiple() value which is {}", currencyExchange.getConversionMultiple());
    }
}
