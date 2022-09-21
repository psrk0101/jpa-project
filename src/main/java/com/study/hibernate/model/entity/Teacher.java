package com.study.hibernate.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher {
    @Id
    private int id;

    @Column(name = "name")
    private String name;
}
