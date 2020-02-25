package com.mes.demo.domain;

/**
* Created by measr on 25-2-2020
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment{

    @Builder
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentState state;

    private BigDecimal amount;
}