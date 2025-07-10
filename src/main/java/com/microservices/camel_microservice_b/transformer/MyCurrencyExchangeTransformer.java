package com.microservices.camel_microservice_b.transformer;

import com.microservices.camel_microservice_b.pojo.CurrencyExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class MyCurrencyExchangeTransformer {

    Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);

    public CurrencyExchange processMessage(CurrencyExchange currencyExchange){
        currencyExchange.setConversionMultiple(currencyExchange.getConversionMultiple().multiply(BigDecimal.TEN));
        logger.info("Do some processing with currrencyExchange.getConversionMultiple() value which is {}", currencyExchange.getConversionMultiple());
        return currencyExchange;
    }
}
