package com.wipro.topgear.spring.springboot.connector;

import com.wipro.topgear.spring.springboot.model.Bank;
import org.springframework.stereotype.Component;

@Component
public class BankConnector {

    public Bank bankDetails() {
        return new Bank("SBI", "Bangalore");
    }
}
