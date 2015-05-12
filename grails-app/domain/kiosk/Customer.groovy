package kiosk

import grails.rest.Resource

@Resource
class Customer {

    String firstName
    String lastName
    Long phone
    String email
    Integer totalPoints

    static constraints = {
        lastName nullable: true
    }
}
