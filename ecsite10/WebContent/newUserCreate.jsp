<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>新規登録画面</title>
</head>
<body>
<div id="header"></div>
<div id="main">
	<div id="top">
		<p>UserCreate<p>
	</div>
	
	<div>
		<s:if test="errorMessage !=''">
			<s:property value="errorMessage"  escape="false" />
		</s:if>
	
	<table>
	<s:form action="UserCreateCheckAction">
		<tr>
			<td><label>ログインID:</label></td>
			<td>
				<input name="loginId" type="text">
			</td>
		</tr>
		<tr>
			<td><label>ログインPASS:</label></td>
			<td>
				<input name="loginPassword" type="text">
			</td>
		</tr>
		<tr>
			<td><label>ユーザー名:</label></td>
			<td>
				<input name="userName" type="text">
			</td>
		</tr>
		<tr>
			<td><s:submit value="登録" /></td>
		</tr>
	</s:form>
	</table>
	</div>
	<div>
		<p>
			前画面に戻る場合は
			<a href="<s:url action='GoHomeAction' />">こちら</a>
		</p>
	</div>
</div>
<div id="fotter"></div>
</body>
</html>