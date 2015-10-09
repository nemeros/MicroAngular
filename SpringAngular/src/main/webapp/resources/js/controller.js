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

