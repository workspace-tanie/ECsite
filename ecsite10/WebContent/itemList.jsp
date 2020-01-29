<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品一覧</title>
</head>
<body>
<div id="header"></div>
<div id="main">
	<div id="top">
		<p>商品一覧</p>
	</div>
	<div>
	<s:if test="itemList == null">
		<h2>登録商品はありません。</h2>
	</s:if>
	<s:elseif test="itemList != null">
	<table>
		<tr>
			<th>ID</th>
			<th>商品名</th>
			<th>値段</th>
			<th>在庫</th>
			<th>追加日時</th>
			<th>更新日時</th>
		<tr>
		<s:iterator value="itemList">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="itemName" /></td>
			<td><s:property value="price" /></td>
			<td><s:property value="stock" /></td>
			<td><s:property value="insertDate" /></td>
			<td><s:property value="upDate" /></td>
		</tr>
		</s:iterator>
	</table>
	<s:form action="ItemListDeleteConfirmAction">
		<s:submit value="全件削除"/>
	</s:form>
	</s:elseif>
	</div>
</div>
<div id="footer"></div>
</body>
</html>