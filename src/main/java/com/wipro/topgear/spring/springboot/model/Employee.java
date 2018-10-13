package com.wipro.topgear.spring.springboot.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee {

    @Id
    private Long id;
    private String name;
    private String email;
    private String address;
}
