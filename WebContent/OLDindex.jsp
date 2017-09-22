<html ng-app="myApp">
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/united/bootstrap.min.css">
</head>
<body ng-controller="myCtrl">
	<div class="container">
		<div class="col-md-12">
			<div class="panel panel-primary">
				<div class="panel-heading">Login</div>
				<div class="panel-body">

					<form class="form-horizontal" name="myForm" action="DemoServlet" method="get">
						<fieldset>
							<div class="form-group">
								<span class="control-label col-sm-6">First name:<span
									style="color: red">*</span>
								</span> <span class="col-sm-6"> <input type="text"
									ng-model="firstName" name="firstName"
									placeholder="Enter the first Name" required>
									<div
										ng-show="myForm.firstName.$touched && myForm.firstName.$invalid"
										style="color: red">This is required</div></span>

							</div>
							<div class="form-group">
								<span class="control-label col-sm-6">Last name: <span
									style="color: red">*</span>
								</span> <span class="col-sm-6"> <input type="text"
									ng-model="lastName" name="lastName"
									placeholder="Enter the last Name" required>
									<div
										ng-show="myForm.lastName.$touched && myForm.lastName.$invalid"
										style="color: red">This is required</div></span>
							</div>
							<div class="form-group">
								<span class="control-label col-sm-6">Email: <span
									style="color: red">*</span>
								</span> <span class="col-sm-6"> <input type="text"
									ng-model="email" name="email" placeholder="Enter the email"
									required>
									<div ng-show="myForm.email.$touched && myForm.email.$invalid"
										style="color: red">This is required</div></span>
							</div>
							<div class="form-group">
								<span class="control-label col-sm-6">Contact: <span
									style="color: red">*</span>
								</span> <span class="col-sm-6"> <input type="text"
									ng-model="contact" name="contact"
									placeholder="Enter the contact" required>
									<div
										ng-show="myForm.contact.$touched && myForm.contact.$invalid"
										style="color: red">This is required</div></span>
							</div>

							<div class="form-group">
								<span class="control-label col-sm-6">Username: <span
									style="color: red">*</span>
								</span> <span class="col-sm-6"> <input type="text"
									ng-model="username" name="userName"
									placeholder="Enter the Username" required>
									<div
										ng-show="myForm.userName.$touched && myForm.userName.$invalid"
										style="color: red">This is required</div></span>
							</div>

							<div class="form-group">
								<span class="control-label col-sm-6">Password: <span
									style="color: red">*</span>
								</span> <span class="col-sm-6"> <input type="password"
									ng-model="password" name="password"
									placeholder="Enter the password" required>
									<div
										ng-show="myForm.password.$touched && myForm.password.$invalid"
										style="color: red">This is required</div></span>
							</div>
							<div class="form-group text-center">
								<button class="btn btn-primary" type="submit"
									ng-disabled="myForm.firstName.$invalid || myForm.lastName.$invalid || myForm.email.$invalid ">submit</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
	
</script>
<script>
	var app = angular.module("myApp", [])

	app.controller("myCtrl", function($scope) {
		$scope.firstName = "Ajinkya"
		$scope.lastName = "Chanshetty"
		$scope.contact = 9960282703
		$scope.email = "aajinkya@hotmail.com"
		$scope.password = ""
		$scope.username = ""

	})
</script>
</html>