package com.wipro.topgear.spring.springboot.service;

import com.wipro.topgear.spring.springboot.adapter.BankAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    private final BankAdapter bankAdapter;

    @Autowired
    public BankService(BankAdapter bankAdapter) {
        this.bankAdapter = bankAdapter;
    }

    public String bankName() {
        return bankAdapter.bankDetails().getBankName();
    }

    public String bankAddress() {
        return bankAdapter.bankDetails().getBankAddress();
    }
}
