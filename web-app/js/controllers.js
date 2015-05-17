/**
 * Created by crash on 5/11/15.
 */

'use strict';

app.controller('ProductController', function ($scope, Product, $routeParams, $location){

    //Product.query(function(data){
    //    $scope.products = data.products;
    //});
    //var product = Product.get({id:$routeParams.id}, function() {
    //    var id = product.id;
    //
    //});
    $scope.products = Product.query();
    $scope.productData = {};
    $scope.saveProduct = function(){
        var product = new Product($scope.productData);
        product.$save()
        $location.path('/product');
    }
    $scope.editProduct = function(){
        Product.query({id: $routeParams.id}).$promise.then(function(product){
            $scope.product = product;
        })
    }

    $scope.updateProduct = function(){

    }



});

app.controller('CustomerController', ['$scope', '$routeParams', '$location', 'Customer', function($scope, $routeParams, $location, $rootScope, Customer){

}]);
