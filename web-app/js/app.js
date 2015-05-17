/**
 * Created by crash on 5/9/15.
 */

var  app = angular.module('kioskApp', ['ngRoute', 'kioskServices']);
//app.run(function($rootScope, $location) {
//    $rootScope.goto = function (hash) {
//        $location.path(hash);
//    }
//})
app.config(function($routeProvider, $locationProvider){
    //$locationProvider.hashPrefix('!');

    $routeProvider.
        when('/product', {
            templateUrl: 'partials/product/index.html',
            controller: 'ProductController'
        })
        .when('/product/edit/:id', {
            templateUrl: 'partials/product/edit.html',
            controller: 'ProductController',
            resolve: {

            }
        })
        .when('/product/new', {
            templateUrl: 'partials/product/create.html',
            controller: 'ProductController'
        })
        .when('/product/:id', {
            templateURL: 'partials/product/index.html',
            controller: 'ProductController'
        })
        .when('/product/delete/:id', {
           templateUrl: 'partials/product/index.html',
            controller: 'ProductController',
            resolve: {
                action: function(){return 'delete';}
            }
        });

});