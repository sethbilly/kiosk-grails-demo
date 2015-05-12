<!doctype html>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" href="${resource(dir:'stylesheets', file:'bootstrap.min.css')}" />
    </head>
    <body>
        <!--nav bar for customer -->
        <nav class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#customerNav">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <g:link class="navbar-brand">Kiosk</g:link>

                <div class="collapse navbar-collapse" id="customerNav">
                    <ul class="nav navbar-nav navbar-right">
                        <li><g:link url="[action: 'orders', controller: 'customer']">Orders</g:link></li>
                        <li><g:link url="[action:'profile', controller:'customer']">Profile</g:link></li>
                    </ul>
                </div>
            </div>
        </nav><!-- end navbar-->
        <div class="container-fluid">
            <g:layoutBody>
                <div class="row">
                    <div class="col-sm-offset-6 col-sm-3">
                        <div class="jumbotron">

                        </div>
                    </div>
                </div>
            </g:layoutBody>
        </div>
    </body>
</html>