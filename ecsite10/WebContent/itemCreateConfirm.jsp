<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>登録確認画面</title>
</head>
<body>
<div id="header"></div>
<div id="main">
	<div id="top">
		<p>確認画面<p>
	</div>
	<div>
		<h3>登録の内容は以下でよろしいですか？</h3>
		<s:form action="ItemCreateCompleteAction">
		<s:property value="session.buyItemName" /><br />
		<s:property value="session.price" /><br />
		<s:property value="session.stock" />
		<s:submit value="完了" />
		</s:form>
	</div>
</div>
<div id="footer"></div>
</body>
</html>