/**
 * 自定义指令
 */

// 定义一个指令名为 datePicker 。
actionApp.directive('datePicker',function(){
    return {
        // 限制为属性指令和样式指令。
        restrict: 'AC',
        // 使用 link 方法来定义指令，在link方法内可使用当前scope、当前元素及元素属性。
        link:function(scope,elem,attrs){
           // scope.treeObj = $.fn.zTree.init(elem, scope.settings);
            // 初始化 jqueryui 的 datepicker （jquery的写法是 $('#id').datepicker() ）。
            elem.datepicker();
        }
    };
});


