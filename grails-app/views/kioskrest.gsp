<!doctype html>
<html ng-app="KioskApp">
<head>
    <title>Angular Grails Demo</title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}">
    %{--<script src="${resource(dir: 'js', file: 'jquery-1.11.3.js')}"></script>--}%
    %{--<script src="${resource(dir: 'lib/angular', file: 'angular.min.js')}"></script>--}%
    %{--<script src="${resource(dir: 'lib/angular', file: 'angular-route.min.js')}"></script>--}%
    %{--<script src="${resource(dir: 'lib/angular', file: 'angular-animate.min.js')}"></script>--}%

    %{--<script src="${resource(dir: 'app', file: 'app.js')}"></script>--}%
    %{--<script src="${resource(dir: 'app/services', file: 'services.js')}"></script>--}%
    %{--<script src="${resource(dir: 'app/controllers', file: 'controllers.js')}"></script>--}%
</head>

<body ng-controller="ProductsController">

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#restfulKioskNav">
                    <span class="sr-only">Toggle Navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="#" class="navbar-brand">Restful Kiosk</a>
            </div>
        </div>

        <div class="collapse navbar-collapse" id="restfulKioskNav">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#/products">Products</a></li>
                <li><a href="#persons">Staff</a></li>
            </ul>
        </div>
    </nav>

    <div class="panel panel-default">
        <div ng-view>

        </div>
    </div>

        <script src="${resource(dir: 'js', file: 'jquery-1.11.3.js')}"></script>
        <script src="${resource(dir: 'lib/angular', file: 'angular.min.js')}"></script>
        <script src="${resource(dir:'lib/angular', file: 'angular-resource.min.js')}" ></script>
        <script src="${resource(dir: 'lib/angular', file: 'angular-route.min.js')}" ></script>
        <script src="${resource(dir: 'lib/angular', file: 'angular-animate.min.js')}" ></script>

        <!--load angular scripts-->
        <script src="${resource(dir:'js/app', file: 'app.js')}" ></script>
        <script src="${resource(dir: 'js/app', file: 'controllers.js')}"></script>
        <script src="${resource(dir:'js/app', file: 'services.js')}"></script>
</body>
</html>