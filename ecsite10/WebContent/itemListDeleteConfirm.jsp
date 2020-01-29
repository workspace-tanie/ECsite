<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>削除確認</title>
</head>
<body>
<div id="header"></div>
<div id="main">
	<div id="top">
		<p>削除確認</p>
	</div>
	<div>
		<s:form action="ItemListDeleteCompleteAction">
			<s:submit value="削除" />
		</s:form>
		<s:form action="ItemListAction">
			<s:submit value="キャンセル" />
		</s:form>
	</div>
</div>
<div id="footer"></div>
</body>
</html>