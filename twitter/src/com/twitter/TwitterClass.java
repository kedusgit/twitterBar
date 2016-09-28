package com.twitter;

import java.util.List;

import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.Query.Unit;
import twitter4j.QueryResult;
import twitter4j.Status;
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

	public String searchByQueries(String queries) throws TwitterException {
		Query query = new Query(queries);
		QueryResult result;
		result = twitter.search(query);
		List<Status> tweets = result.getTweets();
		String json = "[";
		for (Status tweet : tweets) {
			json += "{ \"name\" :" + "\"" + tweet.getUser().getScreenName() + "\"" + "," + "\"ProfilePic\":" + "\""
					+ tweet.getUser().getMiniProfileImageURL() + "\"" + "," + "\"Location\":" + "\""
					+ tweet.getUser().getLocation() + "\"" + "," + "\"Tweet\":" + "\"" + tweet.getText() + "\"" + "},";

		}
		json = json.substring(0, json.length() - 1);
		json += "]";
		return json;
	}

	public String SearchByGeoLocation(double latitude, double longitude, int radius) throws TwitterException {
		// Query query = new Query("");
		Query query = new Query(""); //

		GeoLocation location = new GeoLocation(latitude, longitude);
		Unit unit = Query.KILOMETERS; // or Query.MILES;
		query.setGeoCode(location, radius, unit);

		QueryResult result;

		result = twitter.search(query);
		String json = "[";
		List<Status> tweets = result.getTweets();
		// System.out.println(result.toString());

		for (Status tweet : tweets) {

			// System.out.println("@" + tweet.getUser().getScreenName() + " - "
			// + tweet.getText());
			json += "{ \"name\" :" + "\"" + tweet.getUser().getScreenName() + "\"" + "," + "\"ProfilePic\":" + "\""
					+ tweet.getUser().getMiniProfileImageURL() + "\"" + "," + "\"Location\":" + "\""
					+ tweet.getUser().getLocation() + "\"" + "," + "\"Location\":" + "\""
					+ tweet.getGeoLocation().getLatitude() + "\"" + "," + "\"Location\":" + "\""
					+ tweet.getGeoLocation().getLongitude() + "\"" + "," + "\"Tweet\":" + "\"" + tweet.getText() + "\""
					+ "},";

		}
		json = json.substring(0, json.length() - 1);
		json += "]";
		return json;

	}

}
