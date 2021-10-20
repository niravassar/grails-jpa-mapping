package com.objectcomputing.example

import grails.gorm.services.Service

interface EmployeeService {

    Employee save(String firstName, String lastName, Double salary)

    Number count()

    Employee get(Serializable id)

    Employee delete(Serializable id)
}
