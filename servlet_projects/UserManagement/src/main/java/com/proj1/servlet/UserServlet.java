package com.proj1.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.proj1.dao.UserDao;
import com.proj1.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				try
				{
					showNewForm(request, response);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			case "/insert":
				try
				{
					insertUser(request, response);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			case "/delete":
				try
				{
					deleteUser(request, response);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			case "/edit":
				try
				{
					showEditForm(request, response);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			case "/update":
				try
				{
					updateUser(request, response);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			default:
				try
				{
					listUser(request, response);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUser = userDao.selectAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		User existingUser = userDao.selectUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);

	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		if(name!=null && email!=null && country!=null)
		{
			User newUser = new User(name, email, country);
			userDao.insertUser(newUser);
		}
		else
		{
			showNewForm(request,response);
		}
		response.sendRedirect("list");
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");

		User book = new User(id, name, email, country);
		userDao.updateUser(book);
		response.sendRedirect("list");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		userDao.deleteUser(id);
		response.sendRedirect("list");

	}
}
