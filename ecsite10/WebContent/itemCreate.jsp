<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品新規登録</title>
</head>
<body>
<div id="header"></div>
<div id="main">
	<div id="top">
		<p>商品新規登録</p>
	</div>
	<div>
	<s:if test="errorMessage != ''">
		<s:property value="errorMessage" escape="false"/>
	</s:if>
	<s:form action="ItemCreateConfirmAction">
		商品名:
		<input type="text" name="buyItemName" /><br />
		　 値段:
		<input type="text" name="price" /><br />
		 　 在庫:
		<input type="text" name="stock" />
		<div id="button">
		<s:submit value="登録" />
		</div>
	</s:form>
	</div>
</div>
<div id="footer"></div>
</body>
</html>
