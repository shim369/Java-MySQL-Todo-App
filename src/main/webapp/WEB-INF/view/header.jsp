<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header class="p-2 shadow">
	<nav class="navbar navbar-expand-lg">
		<div class="container-fluid">
			<h1 class="fs-4 navbar-brand">Java MySQL Todo App</h1>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02"
				aria-controls="navbarTogglerDemo02" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item d-flex align-items-center me-3">
						<form action="TodoIndex" method="post">
							<input type="submit" value="Home" class="unset">
						</form>
					</li>
					<li class="nav-item d-flex align-items-center">
						<form action="TodoInsert" method="post">
							<input type="submit" value="Add Todo" class="unset">
						</form>
					</li>
			</div>
		</div>
	</nav>
</header>