var myApp = angular.module('myApp', ['ngResource', 'ngRoute', 'myApp.service', 
                                     'myApp.animation', 'myApp.controller', 'myApp.filter']);
    
myApp.config(['$routeProvider',
 function($routeProvider) {
	$routeProvider.
		when('/users', {
			templateUrl :'partials/user-list.html',
			controller: 'UserListController'
		}).
		when('/items', {
			templateUrl: 'partials/item-list.html',
			controller: 'ItemController'		
		}).
		when('/items/:itemId', {
			templateUrl: 'partials/item-detail.html',
			controller: 'ItemDetailController'		
		}).
		otherwise({
			redirectTo: '/items'
		});
}]);


