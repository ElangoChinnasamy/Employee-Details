(function() {
	var app = angular.module("myLogin", [ 'ngRoute' ]);
	app.config(function($routeProvider) {
		$routeProvider.when('/Login', {
			controller : 'LoginController',
			templateUrl : 'Login.html'
		}).when('/Register', {
			controller : 'userCtrl',
			templateUrl : 'Register.html'
		})
		
		
		/*.when('/dash', {
			controller : 'DashBoardController',
			templateUrl : 'app/views/dashBoard.html'
		})*/
		
		.otherwise({
			redirectTo : '/Login'
		});
	});
	
})();