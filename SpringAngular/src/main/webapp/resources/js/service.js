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