/**
 * 
 */
// 定义模块actionApp，并依赖于路由模块ngRoute。
var actionApp = angular.module('actionApp',['ngRoute']);

// 路由配置，并注入$routeProvider来配置。
actionApp.config(['$routeProvider' , function($routeProvider) {

	// oper为路由名称。
	$routeProvider.when('/oper', {
		// controller定义的路由的控制器名称。
		controller: 'View1Controller',
		// templateUrl定义的是视图的真正地址。
		templateUrl: 'views/view1.html', 
	}).when('/directive', {
		controller: 'View2Controller',
		templateUrl: 'views/view2.html',
	});

}]);
