/**
 * 控制器定义
 */

// 定义控制器 View1Controller ，并注入$rootScope、$scope、$http。
actionApp.controller('View1Controller', ['$rootScope', '$scope', '$http', function($rootScope, $scope,$http) {
    // 使用 $scope.$on 监听 $viewContentLoaded 事件，可以在页面内容加载完成后进行一些操作。
    $scope.$on('$viewContentLoaded', function() {
    	console.log('页面加载完成');
    });
    
    // 这段代码是这个演示的核心代码，请结合下面的 Viewl的界面一起理解：
    /*
    * 在scope内定义一个方法search，在页面上通过ng-click调用。
    * 通过 $scope.personName 获取页面定义的 ng-model=“personName”的值。
    * 使用 $http.get 向服务端地址search发送get请求。
    * 使用 params 增加请求参数。
    * 用 success 方法作为请求成功后的回调。
    * 将服务端返回的数据data通过 $scope.person 赋给模型person，这样页面视图上可以
    *     通过{{person.name}}、{{person.name}}、{{person.name}}来调用，且模型person值改变后，视图是自动更新的。
    */
    $scope.search = function(){
      personName = $scope.personName;
      $http.get('search',{
    	  params:{personName:personName}
      }).success(function(data){
    	 $scope.person=data;
      });;
     
    };
}]);

actionApp.controller('View2Controller', ['$rootScope', '$scope',  function($rootScope, $scope) {
    $scope.$on('$viewContentLoaded', function() {
    	console.log('页面加载完成');
    });
}]);


