package kiosk

import grails.converters.JSON
import grails.rest.RestfulController

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProductController{

//    static responseFormats = ['json', 'xml']
//
//    ProductController(){
//        super(Product)
//    }

    def productService
    //static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static  scaffold =  true

//    @Override
//    def index(){
//        respond listAllResources(params), [includes: includeFields, excludes: ['class']]
//    }

//    def list(){
//        List<Product> products = productService.list(params);
//        render products as JSON
//    }

//    def index() {
////        params.max = Math.min(max ?: 10, 100)
//        List<Product> products = Product.list();
//        respond products as JSON
////        , model:[productInstanceCount: Product.count()]
//    }
//
//    def show(Product productInstance) {
//        respond productInstance
//    }
//
//    def edit(){
//        Product product = productService.get(params.id as long)
//        render product as JSON
//    }
//
//    def create() {
//        respond new Product(params)
//    }
//
//    @Transactional
//    def save(Product productInstance) {
//        if (productInstance == null) {
//            notFound()
//            return
//        }
//
//        if (productInstance.hasErrors()) {
//            respond productInstance.errors, view:'create'
//            return
//        }
//
//        productInstance.save flush:true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.created.message', args: [message(code: 'product.label', default: 'Product'), productInstance.id])
//                redirect productInstance
//            }
//            '*' { respond productInstance, [status: CREATED] }
//        }
//    }
//
//    def edit(Product productInstance) {
//        respond productInstance as JSON
//    }
//
//    @Transactional
//    def update(Product productInstance) {
//        if (productInstance == null) {
//            notFound()
//            return
//        }
//
//        if (productInstance.hasErrors()) {
//            respond productInstance.errors, view:'edit'
//            return
//        }
//
//        productInstance.save flush:true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.updated.message', args: [message(code: 'Product.label', default: 'Product'), productInstance.id])
//                redirect productInstance
//            }
//            '*'{ respond productInstance, [status: OK] }
//        }
//    }
//
//    @Transactional
//    def delete(Product productInstance) {
//
//        if (productInstance == null) {
//            notFound()
//            return
//        }
//
//        productInstance.delete flush:true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Product.label', default: 'Product'), productInstance.id])
//                redirect action:"index", method:"GET"
//            }
//            '*'{ render status: NO_CONTENT }
//        }
//    }
//
//    protected void notFound() {
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.not.found.message', args: [message(code: 'product.label', default: 'Product'), params.id])
//                redirect action: "index", method: "GET"
//            }
//            '*'{ render status: NOT_FOUND }
//        }
//    }
//    private getIncludeFields(){
//        params.fields?.tokenizer(',')
//    }
}
