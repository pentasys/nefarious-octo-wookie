app.controller("PilotCtrl", ["$scope", "restService", function ($scope, restService) {
    "use strict";

    $scope.responseData = "not data";

    $scope.onLoad = function() {
        restService.load("http://localhost:80/api/pilot").then(function(data) {
            $scope.responseData = data;
        });
    };
}]);
