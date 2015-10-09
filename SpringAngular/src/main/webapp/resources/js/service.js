var appService = angular.module('myApp.service', []);

appService.service('MenuService', function ($log, $resource) {
    return {
        getAll: function () {
            var menuResource = $resource('http://localhost:9080/menu', {}, {
                query: {method: 'GET', params: {}, isArray: true}
            });
            return menuResource.query();
        }
    }
});


appService.service('ItemService', function ($log, $resource) {
    return {
        getAll: function () {
            var itemResource = $resource('http://localhost:9080/items', {}, {
                query: {method: 'GET', params: {}, isArray: true}
            });
            
            return itemResource.query(); 
        },
        getItem: function(id) {
        	var itemResource = $resource('http://localhost:9080/items/:itemId', {},{
        		query: {method:'GET', params:{itemId:id}, isArray:false}
        	});
        	return itemResource.query();
        }    	
    }
});