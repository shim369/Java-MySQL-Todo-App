package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import beans.TodoBean;
import jakarta.servlet.http.HttpServletRequest;

public class TodoLogic {
	
	public TodoBean getTodoBean(int id) throws SQLException, NamingException {
		
		TodoBean todoBean = new TodoBean();
		
		String sql = "select id, taskname, taskurl from todo where id=?";
		
		try (Connection con = ConnectionBase.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setInt(1, id);
			
			System.out.println(pstmt.toString());
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				todoBean.setId(id);
				todoBean.setTaskname(rs.getString("taskname"));
				todoBean.setTaskurl(rs.getString("taskurl"));
			}
		}
		return todoBean;
	}
	
	public TodoBean getTodoBean(HttpServletRequest request) {
		TodoBean todoBean = new TodoBean();
		
		todoBean.setId(0);
		todoBean.setTaskname(request.getParameter("taskname"));
		todoBean.setTaskurl(request.getParameter("taskurl"));

		return todoBean;
	}

	public void insertTodo(TodoBean todoBean) throws SQLException, NamingException {

		String sql = "insert into todo(id, taskname, taskurl) values(?,?,?);";
		try (Connection con = ConnectionBase.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setInt(1, todoBean.getId());
			pstmt.setString(2, todoBean.getTaskname());
			pstmt.setString(3, todoBean.getTaskurl());

			System.out.println(pstmt.toString());

			pstmt.executeUpdate();
		}
	}

	public ArrayList<TodoBean> getAllTodo() throws SQLException, NamingException {

		ArrayList<TodoBean> todoList = new ArrayList<TodoBean>();

		String sql = "select id, taskname, taskurl from todo";

		try (Connection con = ConnectionBase.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			System.out.println(pstmt.toString());

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				TodoBean todoBean = new TodoBean();

				todoBean.setId(rs.getInt("id"));
				todoBean.setTaskname(rs.getString("taskname"));
				todoBean.setTaskurl(rs.getString("taskurl"));

				todoList.add(todoBean);
			}
		}
		return todoList;
	}
}
