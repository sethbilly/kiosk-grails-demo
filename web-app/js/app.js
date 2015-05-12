/**
 * Created by crash on 5/9/15.
 */

var app = angular.module('KioskApp', ['ngRoute','ngAnimate', 'KioskApp.Services', 'KioskApp.Controllers']);
//app.value('apiUrl', 'http://localhost:8080/kiosk/');


//app.run(function($rootScope, $location) {
//    $rootScope.goto = function (hash) {
//        $location.path(hash);
//    }
//});

//configure routes here
app.config(['$routeProvider', '$locationProvider',function($routeProvider, $locationProvider){
    //$locationProvider.hashPrefix('!');
    $routeProvider

        .when('/product', {
            templateUrl: 'partials/product/index.html',
            controller: 'ProductController'

        })

        .when('/product/:id/edit', {
            templateUrl: 'partials/product/product.html',
            controller: 'ProductController'
        })
        .when('/product/new', {
            templateUrl: 'partials/product/product.html'
        });

}]);