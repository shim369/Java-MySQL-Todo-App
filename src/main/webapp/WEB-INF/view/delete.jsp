<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="beans.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Delete Todo</title>
<%@ include file="common_css.jsp"%>
</head>
<%
TodoBean todoBean = (TodoBean) request.getAttribute("todoBean");
%>
<body>
	<main>
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-lg-8 col-xl-6">
					<div class="card rounded-3">
						<div class="card-body p-4 p-md-5">
							<h2 class="text-center">Delete Todo</h2>
							<form action="TodoDeleteComplete" method="post" class="mt-2">
								<table class="table">
									<tr>
										<td><label for="id" class="form-label">ID:</label></td>
										<td><%=todoBean.getId()%></td>
									</tr>
									<tr>
										<td><label for="taskname" class="form-label">Task Name</label></td>
										<td><%=todoBean.getTaskname()%></td>
									</tr>
									<tr>
										<td><label for="taskurl" class="form-label">Task URL</label></td>
										<td><%=todoBean.getTaskurl()%></td>
									</tr>
								</table>
								<button type="submit" class="mt-2 btn btn-primary">Delete Todo</button>
								<input type="hidden" name="id" value="<%=todoBean.getId()%>">
								<input type="hidden" name="taskname"
									value="<%=todoBean.getTaskname()%>"> <input
									type="hidden" name="taskurl" value="<%=todoBean.getTaskurl()%>">
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