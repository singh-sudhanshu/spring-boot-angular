package com.wipro.topgear.spring.springboot.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Bank {

    private String bankName;
    private String BankAddress;

}
