var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {
    $http({
        method : "GET",
        url : "callACandidate"
    }).then(function mySucces(response) {

        $scope.data = response.data;
        console.log(response.data);
    }, function myError(response) {
        $scope.data = response.statusText;
    });
});