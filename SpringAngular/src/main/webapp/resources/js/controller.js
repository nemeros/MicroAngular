var appController = angular.module('myApp.controller', []);

appController.controller('MenuController', function ($scope, $log, MenuService) {
    $scope.menu = MenuService.getAll();
});

appController.controller('ItemController', function($scope, $log, ItemService) {
	$scope.items = ItemService.getAll();
});


appController.controller('ItemDetailController', function($scope, $log, $routeParams, ItemService) {
	$scope.itemSpecific = ItemService.getItem($routeParams.itemId);
	
	
	$scope.hello = function(name) {
	    alert('Hello ' + (name || 'world') + '!');
	};
});


appController.controller('UserListController', function($scope, $log, $routeParams, JobService, UserService) {
		$scope.users = UserService.getAll();
		
		$scope.jobs = JobService.getAll();
		
		$scope.fn = function(text){
			alert(text);
		};
});
