<!doctype html>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" href="${resource(dir: 'stylesheets', file:'bootstrap.min.css')}">
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#adminNavBar">
                        <span class="sr-only">Toggle Navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="#" class="navbar-brand">Kiosk</a>
                </div>

                <!-- begin nav links -->
                <div class="collapse navbar-collapse" id="adminNavBar">
                    <ul class="nav navbar-nav navbar-right">
                        <li><g:link controller="product" action="index">Products</g:link></li>
                        <li><g:link controller="person" action="index">Staff</g:link></li>
                    </ul>
                </div>
            </div>
        </nav><!-- end of navbar-->
        <div class="container-fluid">
            <g:layoutBody></g:layoutBody>
        </div>
        <g:javascript library="jquery"></g:javascript>
        <script type="text/javascript" src="${resource(dir: 'javascripts', file: 'bootstrap.min.css')}"></script>
    </body>
</html>