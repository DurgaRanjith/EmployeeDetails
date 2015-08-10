(function() {
	var app = angular.module('myCSS');

	app.controller('LoginController',[ '$scope', '$rootScope',
							'$log',
							'$http',
							'$location',
							
							function($scope, $rootScope, $log, $http,
									$location) {
								var self = this;
								self.user = new Object();
								self.user.username = "testAgent2";
								self.user.password = "testAgent2";
								var userlogin = { username : self.user.username,password : self.user.password}
								
								self.doLogin = function() {

								

									$http
											   ({
												url : "http://localhost:8080/EmployeeDetails/service/user/login",
												method: 'POST',
												data : userlogin,
												dataType: 'json',
												headers :{
													'Content-Type' : 'application/json'
													
												},
												/*success : onSuccess,
												error : onError*/
											});
								};

						/*		function onSuccess(data) {
									$log.log(JSON.stringify(data));

									if (angular.isObject(data)) {

										$log.log("Result is received!");

										if (data != null && data.result != null) {

											$log.log("Moving to dashboard!");

											$rootScope.$broadcast('Login', {
												isLoggedIn : true
											});

											$location.url('/dash');

										} else if (data.info != null) {

											$log.log("Message info..");

											$scope.$broadcast('Message', {
												isMessage : true,
												messageContent : data.info,
												messageSeverity : 'INFO'
											});
										} else if (data.warning != null) {

											$log.log("Message warn..");

											$scope.$broadcast('Message', {
												isMessage : true,
												messageContent : data.warning,
												messageSeverity : 'WARN'
											});
										} else if (data.error != null) {

											$log.log("Message Error..");

											$scope.$broadcast('Message', {
												isMessage : true,
												messageContent : data.error,
												messageSeverity : 'ERROR'
											});
										}

									}

								}
								function onError(data) {
									$log.log(JSON.stringify(data));
								}*/

							} ]);
})();