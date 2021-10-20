package com.objectcomputing.example

import grails.gorm.annotation.JpaEntity

import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.Table

@JpaEntity
@Table(name = "EMPLOYEE")
class Employee implements Serializable {
    @Id
    @Column(name = "ID")
    Integer id
    @Column(name = "FIRST_NAME")
    String firstName
}
