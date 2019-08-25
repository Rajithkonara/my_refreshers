package com.rajithk.hibernate.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

    @Id
    private @Getter @Setter int userId;
    private @Getter @Setter String userName;

}
