package com.twitter.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.twitter.dao.CategoryItemDao;
import com.twitter.model.CategoryItem;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/categoryController")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CategoryItemDao cateogryItemDao = CategoryItemDao.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CategoryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String categoryName = request.getParameter("categoryName");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/home.jsp");
		List<CategoryItem> categoryItems;
		if (categoryName == null) {
			categoryItems = cateogryItemDao.getCategoryItems("romance");
		} else {
			categoryItems = cateogryItemDao.getCategoryItems(categoryName);
		}
		if(request.getAttribute("categoryItems") != null){
			request.removeAttribute("categoryItems");
		}
		request.setAttribute("categoryItems", categoryItems);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
