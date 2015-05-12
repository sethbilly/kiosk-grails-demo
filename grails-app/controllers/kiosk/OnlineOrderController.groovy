package kiosk


import grails.transaction.Transactional

import static org.springframework.http.HttpStatus.*

@Transactional(readOnly = true)
class OnlineOrderController {

    static namespace = "kioskrest"

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OnlineOrder.list(params), model: [onlineOrderInstanceCount: OnlineOrder.count()]
    }

    def show(OnlineOrder onlineOrderInstance) {
        respond onlineOrderInstance
    }

    def create() {
        respond new OnlineOrder(params)
    }

    @Transactional
    def save(OnlineOrder onlineOrderInstance) {
        if (onlineOrderInstance == null) {
            notFound()
            return
        }

        if (onlineOrderInstance.hasErrors()) {
            respond onlineOrderInstance.errors, view: 'create'
            return
        }

        onlineOrderInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'onlineOrder.label', default: 'OnlineOrder'), onlineOrderInstance.id])
                redirect onlineOrderInstance
            }
            '*' { respond onlineOrderInstance, [status: CREATED] }
        }
    }

    def edit(OnlineOrder onlineOrderInstance) {
        respond onlineOrderInstance
    }

    @Transactional
    def update(OnlineOrder onlineOrderInstance) {
        if (onlineOrderInstance == null) {
            notFound()
            return
        }

        if (onlineOrderInstance.hasErrors()) {
            respond onlineOrderInstance.errors, view: 'edit'
            return
        }

        onlineOrderInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'OnlineOrder.label', default: 'OnlineOrder'), onlineOrderInstance.id])
                redirect onlineOrderInstance
            }
            '*' { respond onlineOrderInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(OnlineOrder onlineOrderInstance) {

        if (onlineOrderInstance == null) {
            notFound()
            return
        }

        onlineOrderInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OnlineOrder.label', default: 'OnlineOrder'), onlineOrderInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'onlineOrder.label', default: 'OnlineOrder'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
