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

    };

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private Boolean Married;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getMarried() {
        return Married;
    }

    public Sex getSex() {
        return sex;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public BigDecimal getProperty() {
        return property;
    }

    private enum Sex{ Male, Femal};
    private Sex sex;

    private Timestamp updateTime;
    private BigDecimal property;

    public Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
    }
}
