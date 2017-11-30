<%@page import="com.ssh.entities.Employee"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<form action="emp-save.do" method="post">
  		编号：<input name="id" /><br>
  		姓名：<input name="lastName"><br>
  		邮箱：<input name="email"><br>
  		出生日期：<input name="birth"><br>
  		部门：<s:select list="#request.departments" listKey="id"
  			listValue="departmentName" name="department.id">
  			</s:select><br>
  			<input type="submit" value="提交">
  	</form>
  </body>
</html>
