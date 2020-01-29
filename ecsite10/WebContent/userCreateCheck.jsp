<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>登録確認</title>
</head>
<body>
<div id="header"></div>

<div id="main">
	<div id="top">
		<p>UserCreateConfirm</p>
	</div>
	<div>
		<h3>登録する内容は以下でよろしいですか。</h3>
		
		<table>
		<s:form action="UserCreateInputAction">
			<tr>
				<td><label>ログインID:</label></td>
				<td>
					<s:property value="loginId" />
				</td>
			</tr>
			<tr>
				<td><label>ログインPASS:</label></td>
				<td>
					<s:property value="loginPassword" />
				</td>
			</tr>
			<tr>
				<td><label>ユーザー名:</label></td>
				<td>
					<s:property value="userName" />
				</td>
			</tr>
			<tr>
				<td><s:submit value="完了" /></td>
			</tr>
		</s:form>
		</table>
	</div>
</div>

<div id="footer"></div>
</body>
</html>