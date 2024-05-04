<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Add Todo</title>
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
							<h2 class="text-center">Add Todo</h2>
							<form action="TodoInsertComplete" method="post" class="mt-2">
								<table class="table">
									<tr>
										<td><label for="taskname" class="form-label">Task Name</label></td>
										<td><input type="text" id="taskname" name="taskname"
											class="form-control" required></td>
									</tr>
									<tr>
										<td><label for="taskurl" class="form-label">Task URL</label></td>
										<td><input type="text" id="taskurl" name="taskurl"
											class="form-control" required></td>
									</tr>
								</table>
								<button type="submit" class="mt-2 btn btn-primary">Add Todo</button>
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