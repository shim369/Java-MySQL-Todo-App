package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;

import beans.TodoBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.TodoLogic;

/**
 * Servlet implementation class ShainDelete
 */
@WebServlet("/TodoDelete")
public class TodoDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TodoDelete() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TodoLogic todoLogic = new TodoLogic();

		try {
			TodoBean todoBean = todoLogic.getTodoBean(Integer.parseInt(request.getParameter("id")));

			if (todoBean != null) {
				request.setAttribute("todoBean", todoBean);
				request.getRequestDispatcher("/WEB-INF/view/delete.jsp").forward(request, response);
			} else {
				request.setAttribute("errorMessage", "ToDo does not exist.");
				request.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(request, response);
			}
		} catch (SQLException | NamingException e) {
			e.printStackTrace();
			request.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
