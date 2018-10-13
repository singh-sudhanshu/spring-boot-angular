package com.wipro.topgear.spring.springboot.controller;

import com.wipro.topgear.spring.springboot.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class BankController {

    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }


    @GetMapping("name")
    public String bankName() {
        return bankService.bankName();
    }

    @GetMapping("address")
    public String bankAddress() {
        return bankService.bankAddress();
    }

}
