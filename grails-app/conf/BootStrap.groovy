import kiosk.Customer
import kiosk.Person
import kiosk.Product


class BootStrap {

    def init = { servletContext ->

        //initialise some dummy data
        new Product(name: 'Morning Blend', price: 9.50, sku: 'MB101').save(failOnError: true)
        new Product(name: 'Brazil Coffee', price: 5.50, sku: 'BC201').save(failOnError: true)
        new Product(name: 'Mexican Double', price: 5.50, sku: 'MD501').save(failOnError: true)
        new Product(name: 'Putorico Angaza', price: 5.50, sku: 'PA301').save(failOnError: true)

        new Customer(firstName: 'Mike', lastName:'Whelan', email:'sirbillbones@yahoo.com', phone:'0245184371', totalPoints: 3).save(failOnError: true)
        new Customer(firstName: 'Russel', lastName:'Crow', email:'exampledemo@yahoo.com', phone:'0266824444', totalPoints: 2).save(failOnError: true)
        new Customer(firstName: 'Bill', lastName:'Grant', email:'billgrant105@example.com', phone:'0243174549', totalPoints: 5).save(failOnError: true)


        new Person(firstName: 'Isaac', lastName: 'Cromwell', email: 'ikecromwell@github.com', username: 'ikecromwell', password: 'ikecromwell105').save(failOnError: true)
        new Person(firstName: 'Joan', lastName: 'Arc', email: 'joanarc@hotmail.com', username: 'joanarc', password: 'ja1234').save(failOnError: true)
        new Person(firstName: 'Sarah', lastName: 'Cox', email: 'dedenarkie@yahoo.com', username: 'scoxmama', password: 'scoxmama').save(failOnError: true)
        new Person(firstName: 'Lois', lastName: 'Clarke', email: 'loisclarke@gmail.com', username: 'loisclarke', password: 'ashaina84').save(failOnError: true)
    }

    def destroy = {
    }
}
