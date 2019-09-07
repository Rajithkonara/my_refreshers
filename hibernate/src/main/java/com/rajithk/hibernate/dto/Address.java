package com.rajithk.hibernate.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "STREET_NAME")
    private @Getter @Setter String street;
    @Column(name = "CITY_NAME")
    private @Getter @Setter String city;
    @Column(name = "STATE_NAME")
    private @Getter @Setter String state;
    @Column(name = "PIN_CODE")
    private @Getter @Setter String pinCode;

}
