<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>購入画面</title>
</head>
<body>
<div id="header"></div>
<div id="main">
	<div id="top">
		<p>BuyItem</p>
	</div>
	<div>
	<table>
	<s:form action="BuyAction">
		<tr>
			<td>商品名</td>
			<td>
				<s:property value="session.buyItemName" />
			</td>
		</tr>
		<tr>
			<td>値段</td>
			<td>
				<s:property value="session.onePrice" />
				<span>円</span>
			</td>
		</tr>
		<tr>
			<td>購入個数</td>
			<td>
				<select name="stock">
					<option value="1" selected="selected">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>支払い方法</td>
			<td>
				<input type="radio" name="pay"  value="1" checked=checked />現金払い
				<input type="radio" name="pay"  value="2"/>クレジットカード
			</td>
		</tr>
		<tr>
			<td><s:submit value="購入" /></td>
		</tr>
	</s:form>
	</table>
	</div>
	<div>
		<span>前画面に戻る場合は</span>
		<a href="<s:url action='GoHomeAction' />">こちら</a>
	</div>
	<div>
		<span>マイページは</span>
		<a href="<s:url action='MyPageAction' />">こちら</a>
	</div>
</div>
<div id="footer"></div>
</body>
</html>