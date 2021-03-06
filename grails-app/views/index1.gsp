<!DOCTYPE html>
<html lang="en">
	<head>
		<link rel="stylesheet" href="${resource(dir:'stylesheets', file:'bootstrap.min.css')}">
	</head>
		<!--navbar comes here -->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapse " data-toggle="collapse" data-target="#indexNavBar">
						<span class="sr-only">Toggle Navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a href="#" class="navbar-brand">Kiosk</a>
				</div>

				<div class="collapse navbar-collapse" id="indexNavBar">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="${resource(dir: '', file: 'index.html')}">Angular Kiosk</a></li>
						<li><g:link>Kiosk</g:link></li>
					</ul>
				</div>
			</div>
		</nav>

		<div class="container" >
		<div class="panel panel-primary">
			<div class="ng-view">
				<div class="jumbotron">
					Welcome to Angular JS Kiosk
				</div>
			</div>
		</div>
		</div>


		%{--<script src="${resource(dir: 'lib/angular', file: 'angular.js')}"></script>--}%
		%{--<script src="${resource(dir: 'lib/angular', file: 'angular-route.js')}"></script>--}%
		%{--<script src="${resource(dir: 'lib/angular', file: 'angular-resource.js')}"></script>--}%

		%{--<script src="${resource(dir: 'js', file: 'app.js')}"></script>--}%
		%{--<script src="${resource(dir: 'js', file: 'services.js')}"></script>--}%
		%{--<script src="${resource(dir: 'js', file: 'controllers.js')}"></script>--}%

	</body>
</html>
