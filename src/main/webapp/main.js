(function() {
	var app = angular.module("myCSS", [ 'ngRoute' ]);
	app.config(function($routeProvider) {
		$routeProvider.when('/login', {
			controller : 'LoginController',
			templateUrl : 'login.html'
		}).when('/signup', {
			controller : 'SignUpController',
			templateUrl : 'signup.html'
		}).when('/dash', {
			controller : 'DashBoardController',
			templateUrl : 'dashBoard.html'
		}).otherwise({
			redirectTo : '/login'
		});
	});
	
})();