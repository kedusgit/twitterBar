package com.twitter.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twitter.TwitterClass;

import twitter4j.TwitterException;

@WebServlet("/TweetsByTrend")
public class TweetsByTrend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TwitterClass objTwiter;

	public void init() {
		objTwiter = new TwitterClass();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String strTrend = request.getParameter("trend");
		String strPage = request.getParameter("page");
		int intPage = Integer.valueOf(strPage);

		if (strTrend == null) {
			return;
		}

		String jsonResponse = "";

		try {
			jsonResponse = objTwiter.searchByQueriesWithPage(strTrend,intPage);
		} catch (TwitterException e) {
			e.printStackTrace();
		}

		response.getWriter().println(jsonResponse);
	}

}
