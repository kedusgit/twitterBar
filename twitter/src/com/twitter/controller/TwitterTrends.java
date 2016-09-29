package com.twitter.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twitter.TwitterClass;

import twitter4j.TwitterException;

@WebServlet("/TwitterTrends")
public class TwitterTrends extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TwitterClass objTwiter;

	public void init() {
		objTwiter = new TwitterClass();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String jsonResponse = "";

		try {
			jsonResponse = objTwiter.searchByQueries("#test");
		} catch (TwitterException e) {
			e.printStackTrace();
		}

		response.getWriter().println(jsonResponse);
	}

}
