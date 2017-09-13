package com.libertymutual.goforcode.invoicify.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public abstract class BillingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private User createdBy;
    
    private Date createdOn;
    
    private String description;
    
    public abstract double getTotal();
    
}
