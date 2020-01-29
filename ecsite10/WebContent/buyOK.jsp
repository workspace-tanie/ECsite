<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>購入完了</title>
</head>
<body>
<div id="header"></div>

<div id="main">
	<div id="top">
		<p>BuyItemComplete</p>
	</div>
	<div>
		<p>購入手続きが完了致しました。</p>
		<div>
			<a href="<s:url action='MyPageAction' />">マイページ</a>
			<span>から購入履歴の確認が可能です。</span>
		</div>
		<div>
			<span>Homeへ戻る場合は</span>
			<a href="<s:url action='GoHomeAction' />">こちら</a>
		</div>
	</div>
</div>

<div id="footer"></div>
</body>
</html>
