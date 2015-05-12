/**
 * Created by crash on 5/11/15.
 */

'use strict';
angular.module('KioskApp', [])
    .controller('ProductController', function($scope, $location, $rootScope, Product){

        var product = Product.get({id:$routeParams.id});
        var $id  = product.id;
        $scope.prod = new Product
        $scope.products = function(producst){
            $scope.products = Product.index();
        }

        $scope.editProduct = function(id){
            Product.update({id:$id});
        }

        $scope.deleteProduct = function(id){
            Product.delete({id:$id});
        }

        $scope.saveProduct = function(){
            Product.save(prod);
        }
    })
    .controller('CustomerController', function($scope, $location, $rootScope, CustomerService){

    })
