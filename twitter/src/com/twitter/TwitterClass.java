package com.twitter;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.Query.Unit;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TwitterClass {

	private final static String consumerKey = "OZP4VD43jqTxSWFv2fHRsY8LQ";
	private final static String consumerSecret = "8HLMGkoJ5Rsr95uoNI0WqkcXlDqXKB5AVTKq0cAFejPwWDOyzF";
	private final static String accessToken = "780805317609132032-rwNhKdcUlF4nyg4LkbAu6REYuBXuhia";
	private final static String accessTokenSecret = "NQB1JSH98DLTtRxUFtNce9X7R6hINNTELpzabGyxDCHJt";

	private TwitterFactory tFactory;
	private Twitter twitter;

	public TwitterClass() {

		tFactory = new TwitterFactory();
		twitter = tFactory.getInstance();
		twitter.setOAuthConsumer(consumerKey, consumerSecret);
		twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));

	}

	public String searchByQueriesWithPage(String queries, int page) throws TwitterException {
		Query query = new Query(queries);
		QueryResult result;
		query.setCount(100);

		result = twitter.search(query);
		List<Status> tweets = result.getTweets();
		JSONArray arrData = new JSONArray();

		ArrayList<Status> pageTweet = new ArrayList<Status>(tweets);

		int intPerPage = 20;
		int intOffset = page * intPerPage;
		
		for (int i = intOffset ; i < intOffset + intPerPage; i++) {

			JSONObject objJSON = new JSONObject();

			objJSON.put("name", pageTweet.get(i).getUser().getScreenName().toString());
			objJSON.put("profile_pic", pageTweet.get(i).getUser().getMiniProfileImageURL().toString());
			objJSON.put("location", pageTweet.get(i).getUser().getLocation().toString());
			objJSON.put("tweet_content", pageTweet.get(i).getText().toString());
			objJSON.put("url", "https://twitter.com/" + pageTweet.get(i).getText().toString() + "/status/"
					+ pageTweet.get(i).getId());

			arrData.add(objJSON);
		}

		return arrData.toString();

	}

	public String Trending() throws TwitterException {

		Trends result = twitter.getPlaceTrends(1);

		JSONArray arrData = new JSONArray();
		for (Trend b : result.getTrends()) {

			JSONObject objJSON = new JSONObject();

			objJSON.put("name", b.getName());
			objJSON.put("QueryName", b.getQuery());
			objJSON.put("URL", b.getURL());

			arrData.add(objJSON);

		}
		return arrData.toString();

	}

	public String searchByQueries(String queries) throws TwitterException {

		Query query = new Query(queries);

		QueryResult result;

		result = twitter.search(query);

		List<Status> tweets = result.getTweets();

		JSONArray arrData = new JSONArray();

		for (Status tweet : tweets) {

			JSONObject objJSON = new JSONObject();

			objJSON.put("name", tweet.getUser().getScreenName());
			objJSON.put("profile_pic", tweet.getUser().getMiniProfileImageURL());
			objJSON.put("location", tweet.getUser().getLocation());
			objJSON.put("tweet_content", tweet.getText());
			objJSON.put("url", "https://twitter.com/" + tweet.getUser().getScreenName() + "/status/" + tweet.getId());

			arrData.add(objJSON);

		}

		return arrData.toString();
	}

	public String SearchByGeoLocation(double latitude, double longitude, int radius) throws TwitterException {

		Query query = new Query(""); //

		GeoLocation location = new GeoLocation(latitude, longitude);
		Unit unit = Query.KILOMETERS; // or Query.MILES;
		query.setGeoCode(location, radius, unit);
		query.setCount(10);

		QueryResult result = twitter.search(query);

		List<Status> tweets = result.getTweets();

		JSONArray arrData = new JSONArray();

		for (Status tweet : tweets) {

			JSONObject objJSON = new JSONObject();

			objJSON.put("name", tweet.getUser().getScreenName());
			objJSON.put("profile_pic", tweet.getUser().getMiniProfileImageURL());
			objJSON.put("tweet_content", tweet.getText());
			objJSON.put("url", "https://twitter.com/" + tweet.getUser().getScreenName() + "/status/" + tweet.getId());
			objJSON.put("location", tweet.getUser().getLocation());

			try {
				tweet.getGeoLocation();
				objJSON.put("latitude", tweet.getGeoLocation().getLatitude());
				objJSON.put("longitude", tweet.getGeoLocation().getLongitude());
			} catch (Exception e) {
				objJSON.put("latitude", null);
				objJSON.put("longitude", null);
			}

			arrData.add(objJSON);

		}

		return arrData.toString();

	}

}
