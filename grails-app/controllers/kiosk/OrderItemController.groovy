package kiosk

import grails.transaction.Transactional

import static org.springframework.http.HttpStatus.*

@Transactional(readOnly = true)
class OrderItemController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OrderItem.list(params), model:[orderItemInstanceCount: OrderItem.count()]
    }

    def show(OrderItem orderItemInstance) {
        respond orderItemInstance
    }

    def create() {
        respond new OrderItem(params)
    }

    @Transactional
    def save(OrderItem orderItemInstance) {
        if (orderItemInstance == null) {
            notFound()
            return
        }

        if (orderItemInstance.hasErrors()) {
            respond orderItemInstance.errors, view:'create'
            return
        }

        orderItemInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'orderItem.label', default: 'OrderItem'), orderItemInstance.id])
                redirect orderItemInstance
            }
            '*' { respond orderItemInstance, [status: CREATED] }
        }
    }

    def edit(OrderItem orderItemInstance) {
        respond orderItemInstance
    }

    @Transactional
    def update(OrderItem orderItemInstance) {
        if (orderItemInstance == null) {
            notFound()
            return
        }

        if (orderItemInstance.hasErrors()) {
            respond orderItemInstance.errors, view:'edit'
            return
        }

        orderItemInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'OrderItem.label', default: 'OrderItem'), orderItemInstance.id])
                redirect orderItemInstance
            }
            '*'{ respond orderItemInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(OrderItem orderItemInstance) {

        if (orderItemInstance == null) {
            notFound()
            return
        }

        orderItemInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OrderItem.label', default: 'OrderItem'), orderItemInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'orderItem.label', default: 'OrderItem'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
