<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>伟大的springboot项目</title>
	<link rel="stylesheet" type="text/css" href="https://heerey525.github.io/layui-v2.4.3/layui-v2.4.5/css/layui.css" />
	<script src="../../js/jquery.js"></script>
	<script src="../../js/jquery.min.js"></script>
	<script src="https://heerey525.github.io/layui-v2.4.3/layui-v2.4.5/layui.js"></script>
	<script type="text/javascript">
		
		
	</script>
</head>
<body>
	<div class="layui-form-item" style="text-align:center;position: relative;margin-top: 350px;">
        <h1>登录</h1>
        <form action="/login" method="post">
            <div class="layui-form-item">
                <label for="name">Username</label>
                <input type="text"  required="required" class="form-control" id="name" name="name" placeholder="Username">
            </div>
            <div class="layui-form-item">
                <label for="word">Password</label>
                <input type="password" required="required" class="form-control" id="password" name="password" placeholder="Password">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
        <div>
           <label for="msg">${msg }</label>
        </div>
    </div>
</body>
</html>