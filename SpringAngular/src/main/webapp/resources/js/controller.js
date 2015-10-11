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


appController.controller('UserListController', function($scope, $log, $uibModal, JobService, UserService) {
		$scope.users = UserService.getAll();
		
		$scope.jobs = JobService.getAll();
				
		$scope.detailModal = function(id){
			var modalOpts = {
				animation: true,
				backdrop: true,
			    keyboard: true,
			    templateUrl: 'partials/modal/userDetailModal.html', // Url du template HTML
			    controller: ['$log', '$scope', '$modalInstance', 'userDetail', 'jobs',
			        function($log, $scope, $modalInstance, userDetail, jobs) { //Controller de la fenêtre. Il doit prend en paramètre tous les élèments du "resolve".
			    	
			    	$scope.userDetail = userDetail;
			    	$scope.jobs = jobs;
			    	
			    	$scope.checkModal = function(valid) {
			    		$log.info("Valeur de modal : " + valid);
			    		if(valid)
			    			$scope.ok();
			    	};
			    	
			    	
			    	$scope.ok = function() {
			                //On fait appel à la fonction du scope parent qui permet de supprimer l'élément.
			    			$log.info("fermeture modal");
			    			
			    			//Sauvegarde de l'utilisateur
			    			$log.info("Valeur user : " + $scope.userDetail);
			    			UserService.saveUser($scope.userDetail);
			    			
			                //Fermeture de la fenêtre modale
			                $modalInstance.close();
			            };
			            $scope.cancel = function() {
			                // Appel à la fonction d'annulation.
			                $modalInstance.dismiss('cancel');
			            };
			        }
			    ],
			    resolve: {
			    	userDetail: function() {
			            return $scope.userDetail; //On passe à la fenêtre modal une référence vers le scope parent.
			        },
			        jobs: function(){
			        	return $scope.jobs;
			        }
			    }
			};
								
			
			$scope.userDetail = UserService.getUser(id);
			$uibModal.open(modalOpts);
		};
});
