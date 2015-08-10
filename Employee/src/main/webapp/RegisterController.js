(function() {
	var app = angular.module('myLogin',[]);

	app.controller('userCtrl', [ '$scope', '$http',
			function($scope,$http) {
		$http
		.post({
			url : "http://localhost:8080/Employee/home/Register"
			
			});
		
	}]);

})();