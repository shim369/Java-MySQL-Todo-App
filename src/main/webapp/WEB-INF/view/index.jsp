<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Todo List</title>
</head>

<body>
	<h1>Todo List</h1>

	<table border="1">
		<tr bgcolor="#cccccc">
			<th>ID</th>
			<th>Task Name</th>
			<th>Task URL</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<%
		ArrayList<TodoBean> todoList = (ArrayList<TodoBean>)request.getAttribute("todoList");
		%>

		<%
		for (TodoBean todoBean : todoList) {
		%>
		<tr>
			<td><%=todoBean.getId()%></td>
			<td><%=todoBean.getTaskname()%></td>
			<td><%=todoBean.getTaskurl()%></td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<%
		}
		%>
	</table>
	<form action="TodoInsert">
		<input type="submit" value="Add Todo">
	</form>
</body>

</html>