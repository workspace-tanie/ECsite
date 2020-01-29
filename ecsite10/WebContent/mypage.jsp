<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	
	<title>MyPage画面</title>
	
	<script type="text/javascript">
		function select()
	</script>
	
	
	<style type="text/css">
	
	/* =======TAG LAYOUT=======*/
	body{
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif:
		font-size:12px;
		color:#333;
		background:#fff;
	}
	
	table{
		text-align:center;
		margin:0 auto;
	}
	
	/* =======ID LAYOUT======= */
	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}
	
	#header{
		width:100%;
		height:80px;
		background-color:black;
	}
	
	#main{
		width:100%;
		height:500px;
		text-align:center;
	}
	
	#footer{
		width:100%;
		height:80px;
		background-color:black;
		clear:both;
	}
	
	#text-right{
		display:inline-block;
		text-align:right;
	}	
	
	</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>MyPage</p>
		</div>
		<div>
		<s:if test="myPageList==null">
			<h3>ご購入情報はありません。</h3>
		</s:if>
		<s:elseif test="message==null">
			<h3>ご購入情報は以下になります。</h3>
			<table border="1">
			<tr>
				<th>商品名</th>
				<th>値段</th>
				<th>購入個数</th>
				<th>支払い方法</th>
				<th>購入日</th>
			</tr>
			<s:iterator value="myPageList">
				<tr>
					<td><s:property value="itemName" /></td>
					<td><s:property value="buyTotalPrice" />円</td>
					<td><s:property value="stock" />個</td>
					<td><s:property value="pay" /></td>
					<td><s:property value="insertDate" /></td>
				</tr>
			</s:iterator>
			</table>
			<s:form action="MyPageAction">
				<input type="hidden" name="deleteFlg" value="1">
				<s:submit value="全件削除" />
			</s:form>
		</s:elseif>
		<s:if test="message != null">
			<h3><s:property value="message" /></h3>
		</s:if>
		<div id="text-right">
			<p>Homeへ戻る場合は<a href="<s:url action='GoHomeAction' />">こちら</a></p>
			<p>ログアウトする場合は<a href="<s:url action='LogoutAction' />">こちら</a></p>
		</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>