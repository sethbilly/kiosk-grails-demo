package kiosk

import grails.rest.Resource

@Resource()
class Person {
    String firstName
    String lastName
    String username
    Long phone
    String password
    String email

    static constraints = {
        phone nullable: true

    }
}
