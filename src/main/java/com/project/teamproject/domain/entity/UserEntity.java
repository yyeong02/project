package com.project.teamproject.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class UserEntity {
    @Id     // Primary Key
    @Column(length = 10, nullable = false)
    private String id;

    @Column(length = 10)
    private String pw;

    @Column(length = 10)
    private String name;

    private boolean location;
//
//    @Builder
//    public UserEntity(String id, String pw, String name) {
//        this.id = id;
//        this.pw = pw;
//        this.name = name;
//    }
}