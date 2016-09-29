package com.twitter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twitter.TwitterClass;

import twitter4j.TwitterException;

@WebServlet("/TweetsByLocation")
public class TweetsByLocation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TwitterClass objTwiter;

	public void init() {
		objTwiter = new TwitterClass();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strLatitude = request.getParameter("lat");
		String strLongitude = request.getParameter("lng");

		double dblLatitude = Double.valueOf(strLatitude);
		double dblLongitude = Double.valueOf(strLongitude);

		String jsonResponse = "";

		try {
			jsonResponse = objTwiter.SearchByGeoLocation(dblLatitude, dblLongitude, 50);
		} catch (TwitterException e) {
			e.printStackTrace();
		}

		response.setContentType("application/json");

		PrintWriter out = response.getWriter();

		out.print(jsonResponse);
		out.flush();

	}

}
