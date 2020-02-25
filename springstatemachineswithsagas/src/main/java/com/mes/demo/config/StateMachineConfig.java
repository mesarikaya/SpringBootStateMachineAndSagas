package com.mes.demo.domain;

/**
* Created by measr on 25-2-2020
*/
@Slf4j
@EnableStateMachineFactory
@Configuration
public class StateMachineConfig extends StateMachineConfigureAdapter<PaymentState,PaymentEvent> {


    public void configure(StateMachineConfigurer<PaymentState,PaymentEvent> states) throws Exception{
        
    }
}