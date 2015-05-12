/**
 * Created by crash on 5/11/15.
 */

var app = angular.module('KioskApp.Services',[]);

var kioskServices = angular.module('kioskServices', ['ngResource'])
kioskServices.factory('Product', ['$resource', function($resource){
    return $resource('/api/products', {}, {
        index: {method: 'GET', isArray:true}
    });
    return $resource('/api/products', {}, {
        save: {method: 'POST'}
    });
    return $resource('/api/products/:id', {id: '@id'}, {
       update: {method:'PUT'}
    });

}]);

kioskServices.factory('Customer', ['$resource', function($resource){
    return $resource('/api/customers', {}, {
       index: {method: 'GET', isArray:true}
    });

    return $resource('/api/customers', {}, {
        save: {method: 'POST'}
    });
}]);

kioskServices.factory('Order', ['$resource', function($resource){

}]);


