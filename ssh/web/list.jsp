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
  	<table>
  		<thead>
  			<tr>
	  			<td colspan="6">员工信息列表</td>
  			</tr>
  			<tr>
	  			<td>序号</td>
	  			<td>姓名</td>
	  			<td>邮箱</td>
	  			<td>出生日期</td>
	  			<td>创建日期</td>
	  			<td>所属部门</td>
	  			<td>操作</td>
  			</tr>
  		</thead>
  		<tbody>
  			 <s:iterator value="#request.employeeList" var="emp">
  			 		<tr>
						<td>${emp.id}</td>
						<td>${emp.lastName}</td>
						<td>${emp.email}</td>
						<td>${emp.birth}</td>
						<td>${emp.createTime}</td>
						<td>${emp.department.departmentName}</td>
						<td><a href="emp-delete.do?id=${emp.id}">删除</a></td>
		  			</tr>
  			 </s:iterator>
  		</tbody>
  	</table>
  </body>
</html>
