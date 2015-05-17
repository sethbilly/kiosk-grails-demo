package kiosk

import grails.rest.Resource

@Resource()
class Product {
    String name
    String sku
    Float price

    static constraints = {
    }
}
