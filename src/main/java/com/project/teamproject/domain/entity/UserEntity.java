package com.project.teamproject.domain.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {
    @Id     // Primary Key
    private String id;

    @Column(length = 10)
    private String pw;

    @Column(length = 10)
    private String name;

    @Column
    private boolean location;

    public UserEntity(String id, String pw, String name, boolean location) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.location = location;
    }
}
