package com.appcall.webapi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long customerNumber;
    @Column(name="customerName")
    private String customerName;
    @Column(name="contactLastName")
    private String contactLastName;
    @Column(name="contactFirstName")
    private String contactFirstName;
    @Column(name="phone")
    private String phone;
    @Column(name="addressLine1")
    private String addressLine1;
    @Column(name="addressLine2")
    private String addressLine2;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="postalCode")
    private String postalCode;
    @Column(name="country")
    private String country;
    @Column(name="salesRepEmployeeNumber")
    private Integer salesRepEmployeeNumber;
    @Column(name="creditLimit")
    private Long creditLimit;
  
    protected Customer() {}
  
    public Customer(String customerName) {
      this.customerName = customerName;
    }
  
    public Long getCustomerNumber() {
      return this.customerNumber;
    }
  
    public String getCustomerName() {
      return this.customerName;
    }

    public String getContactFirstName() {
      return this.contactFirstName;
    }

    // add more gets for more returns..


}