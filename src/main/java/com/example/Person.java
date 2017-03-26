package com.example;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created  on 2017/1/20.
 */

@Entity
public class Person {
    public Person(){

    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private Boolean married;
    private enum Sex{ Male, Femal}
    private Sex sex;

    private Timestamp updateTime;
    private BigDecimal property;

    public Person(String firstName, String lastName, Boolean married) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.married = married;
    }
}
