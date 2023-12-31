package com.spring.splitwise.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Expense extends BaseModel{
    private String description;
    private Double amount;
    private Date createdOn;

    @ManyToOne
    private  Group group;

    @ManyToMany
    private List<User> users=new ArrayList<>();

    @OneToMany
    private List<UserExpense> paidBy = new ArrayList<>();
    @OneToMany
    private List<UserExpense> owedBy = new ArrayList<>();
    //Amounts by individual


}
