<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>管理者画面</title>
</head>
<body>
<div id="header"></div>
<div id="main">
	<div id="top">
		<p>管理者画面<p>
	</div>
	<div id="item">
		商品
		<div id="info">
			<s:form action="ItemCreateAction">
				<s:submit value="新規登録" />
			</s:form>
			<s:form action="ItemListAction">
				<s:submit value="一覧" />
			</s:form>
		</div>
	</div>
</div>
<div id="footer"></div>
</body>
</html>