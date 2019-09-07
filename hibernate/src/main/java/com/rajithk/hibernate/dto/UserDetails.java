package com.rajithk.hibernate.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter int userId;
    private @Getter @Setter String userName;


    //override the column name using attributes
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
            @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
            @AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME")),
            @AttributeOverride(name = "pinCode", column = @Column(name = "HOME_PIN_CODE"))
    })
    private @Getter @Setter Address homeAddress;


    @Embedded
    private @Getter @Setter Address officeAddress;

}
