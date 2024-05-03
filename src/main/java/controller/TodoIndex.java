package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import beans.TodoBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.TodoLogic;

/**
 * Servlet implementation class TodoIndex
 */
@WebServlet("/TodoIndex")
public class TodoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TodoLogic todoLogic = new TodoLogic();
		
		try {
			ArrayList<TodoBean> todoList = todoLogic.getAllTodo();
			
			request.setAttribute("todoList", todoList);
			
			request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);	
		} catch (SQLException | NamingException e) {
			request.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(request, response);	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
