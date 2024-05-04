<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Add Todo</title>
</head>

<body>
	<h1>Add Todo</h1>
	<form action="TodoInsertComplete" method="post">
		<table class="form-table">
			<tr>
				<td><label for="taskname">Task Name:</label></td>
				<td><input type="text" id="taskname" name="taskname" class="form-input"
					required></td>
			</tr>
			<tr>
				<td><label for="taskurl">Task URL:</label></td>
				<td><input type="text" id="taskurl" name="taskurl" class="form-input"
					required></td>
			</tr>
		</table>
		<button type="submit" class="form-button">Add Todo</button>
	</form>
</body>

</html>