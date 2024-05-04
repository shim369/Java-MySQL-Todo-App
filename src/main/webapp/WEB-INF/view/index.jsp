<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Todo List</title>
<%@ include file="common_css.jsp"%>
</head>

<body>
	<%@ include file="header.jsp"%>
	<main>
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-lg-8 col-xl-6">
					<div class="card rounded-3">
						<div class="card-body p-4 p-md-5">
							<h2 class="text-center">Todo List</h2>

							<table class="table mt-2">
								<tr>
									<th>ID</th>
									<th>Task Name</th>
									<th>Task URL</th>
									<th>Edit</th>
									<th>Delete</th>
								</tr>

								<%
								ArrayList<TodoBean> todoList = (ArrayList<TodoBean>) request.getAttribute("todoList");
								%>

								<%
								for (TodoBean todoBean : todoList) {
								%>
								<tr>
									<td><%=todoBean.getId()%></td>
									<td><%=todoBean.getTaskname()%></td>
									<td><%=todoBean.getTaskurl()%></td>
									<td><a href="TodoUpdate?id=<%=todoBean.getId()%>">Edit</a></td>
									<td><a href="TodoDelete?id=<%=todoBean.getId()%>">Delete</a></td>
								</tr>
								<%
								}
								%>
							</table>
							<form action="TodoInsert">
								<input type="submit" value="Add Todo" class="mt-2 btn btn-primary">
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<%@ include file="common_js.jsp"%>
</body>

</html>