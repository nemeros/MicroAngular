var appController = angular.module('myApp.controller', []);

appController.controller('MenuController', function ($scope, $log, MenuService) {
    $scope.menu = MenuService.getAll();
});