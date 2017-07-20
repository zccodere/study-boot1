<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HttpMessageConverter Demo</title>
</head>
<body>
	<div id="resp"></div><input type="button" onclick="req();" value="请求"/>

	<script type="text/javascript" src="static/jquery.js"></script>
	<script type="text/javascript">
		
		function req() {
			$.ajax({
			    url:"convert",
				// 注意这里的数据格式，后台处理按此格式处理，用“-”隔开。
				data:"1-zccoder",
				type:"POST",
				// contentType 设置的媒体类型是我们自定义的 application/x-zccoder。
				contentType:"application/x-zccoder",
				success:function (data) {
					$("#resp").html(data);
                }
			});
        }
		
	</script>

</body>
</html>