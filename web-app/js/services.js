/**
 * Created by crash on 5/11/15.
 */
//switching to
var kioskServices = angular.module('kioskServices', ['ngResource']);

//$resource not deserializing json array well
//switching to jsonp
kioskServices.factory('Product',['$resource', function($resource){
    return $resource('api/products/:id'+'.json', {id:'@id'});
    return $resource('api/products/:id' +'.json', {id: '@id'}, {
        get: {method:'GET', isArray: false}
    })

}]);

//kioskServices.factory('Product', function($http){
//    var factory = {};
//
//    factory.index = function () {
//        return $http.get('api/product').success(function(results){
//            return results.data;
//        });
//    }
//
//    return factory;
//});

//kioskServices.factory('Customer', ['$resource', function($resource){
//    return $resource('/api/customers', {}, {
//       index: {method: 'GET', isArray:true}
//    });
//
//    return $resource('/api/customers', {}, {
//        save: {method: 'POST'}
//    });
//}]);
//
//kioskServices.factory('Order', ['$resource', function($resource){
//
//}]);


