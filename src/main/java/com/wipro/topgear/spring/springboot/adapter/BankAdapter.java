package com.wipro.topgear.spring.springboot.adapter;

import com.wipro.topgear.spring.springboot.connector.BankConnector;
import com.wipro.topgear.spring.springboot.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAdapter {

    private final BankConnector bankConnector;

    @Autowired
    public BankAdapter(BankConnector bankConnector) {
        this.bankConnector = bankConnector;
    }

    public Bank bankDetails() {
        return bankConnector.bankDetails();
    }
}
