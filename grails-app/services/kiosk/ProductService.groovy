package kiosk

import grails.transaction.Transactional

@Transactional
class ProductService {

    def serviceMethod() {

    }

    List<Product> list(){
        return Product.list()
    }

    Product get(long id){
        return Product.get(id)
    }

    void delete(Product product){
        Product.delete(product)
    }

    Product save(Product product){
        return Product.save(flash: true, failOnError: true)
    }
}
