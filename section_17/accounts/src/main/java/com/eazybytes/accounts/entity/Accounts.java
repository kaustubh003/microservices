package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name = "customer_id")
    private Long customerId;

    @Id
    private Long accountNumber;

    @Column
    private String accountType;

    @Column
    private String branchAddress;

    @Column(name = "communication_sw")
    private boolean communicationSw;

}
