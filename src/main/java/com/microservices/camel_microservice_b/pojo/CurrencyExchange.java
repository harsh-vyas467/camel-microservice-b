package com.microservices.camel_microservice_b.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CurrencyExchange {
    private int id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
}
