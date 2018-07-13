<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>市场列表信息</title>
</head>
<body>
	<table align='center' border='1' cellspacing='0'>
	    <tr>
	        <td>市场Id</td>
	        <td>市场名称</td>
	        <td>是否启用</td>
	        <td>市场X坐标</td>
	        <td>市场Y坐标</td>
	        <td>市场范围</td>
	        <td>详细地址</td>
	        <td>创建时间</td>
	        <td>修改时间</td>
	    </tr>
	    <c:forEach items="${marketList}" var="market">
	        <tr>
	            <td>${market.id}</td>
	            <td>${market.marketName}</td>
	            <c:if test="${market.status==1}">
	            <td>启用</td>
	            </c:if>
	            <c:if test="${market.status==0}">
	            <td>禁用</td>
	            </c:if>
	            <td>${market.marketCoordinateX}</td>
	            <td>${market.marketCoordinateY}</td>
	            <td>${market.marketScope}</td>
	            <td>${market.addressDetail}</td>
	            <td>${market.createDate}</td>
	            <td>${market.modifyDate}</td>
	        </tr>
	    </c:forEach>
	</table>
</body>
</html>