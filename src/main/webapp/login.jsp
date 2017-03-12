<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<h3>登录</h3>
<p>请输入用户名和密码</p>
	<form action="loginSubmit" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" /> </td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" /> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="登录" /> </td>
			</tr>
		</table>
	</form>
</body>
</html>
