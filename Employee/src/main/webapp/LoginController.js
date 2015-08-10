(function() {
	var app = angular.module('myLogin',['ngRoute']);

	app.controller('LoginController',[ '$scope','$http',
							
					function($scope,$http) {
		
		var self=this;
		self.employeemodel={};
		self.doLogin=function(){
			
			
								
									$http.post
											({
												url : "http://localhost:8080/Employee/home/Login",
													data : self.employeemodel,
													/*method:"POST",*/
													headers : {
														"Content-Type" : "application/x-www-form-urlencoded; charset=utf-8"
													}
												
												});
											
		};

								
							} ]);
})();