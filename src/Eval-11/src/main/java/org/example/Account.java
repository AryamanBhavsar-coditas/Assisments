package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private int balance;
    private String priv;
    private String companyName;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToMany
    private List<Customer> customers;

}
