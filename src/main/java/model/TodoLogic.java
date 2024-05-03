package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import beans.TodoBean;

public class TodoLogic {
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
